package axonmallorchestrationsagatest.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private String deliveryId;
    private String userId;
    private String address;
    private String orderId;
    private String productId;
    private Integer qty;
    private String status;
}
