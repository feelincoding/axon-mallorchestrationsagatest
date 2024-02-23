package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private String deliveryId;
    private String userId;
    private String address;
    private String orderId;
    private String productId;
    private Integer qty;
    private String status;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
