package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private String deliveryId;
    private String userId;
    private String address;
    private String orderId;
    private String productId;
    private Integer qty;
    private String status;
}
