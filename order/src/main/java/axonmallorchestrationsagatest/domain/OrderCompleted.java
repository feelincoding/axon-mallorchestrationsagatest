package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCompleted extends AbstractEvent {

    private String orderId;
    private String productName;
    private String productId;
    private String status;
    private Integer qty;
    private String userId;

    public OrderCompleted(Order aggregate) {
        super(aggregate);
    }

    public OrderCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
