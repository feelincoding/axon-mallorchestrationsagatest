package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private String productId;
    private String productName;
    private Integer stock;
    private String orderId;

    public StockDecreased(Product aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
