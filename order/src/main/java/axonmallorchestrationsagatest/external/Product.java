package axonmallorchestrationsagatest.external;

import java.util.Date;
import lombok.Data;

@Data
public class Product {

    private String productId;
    private String productName;
    private Integer stock;
    private String orderId;
}
