package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private String productId;
    private String productName;
    private Integer stock;

    public ProductRegistered(Product aggregate) {
        super(aggregate);
    }

    public ProductRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
