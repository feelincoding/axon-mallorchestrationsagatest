package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.ProductApplication;
import axonmallorchestrationsagatest.domain.ProductRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String productName;

    private Integer stock;

    private String orderId;

    @PostPersist
    public void onPostPersist() {
        ProductRegistered productRegistered = new ProductRegistered(this);
        productRegistered.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    //<<< Clean Arch / Port Method
    public void decreaseStock(DecreaseStockCommand decreaseStockCommand) {
        //implement business logic here:

        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void increaseStock(IncreaseStockCommand increaseStockCommand) {
        //implement business logic here:

        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
