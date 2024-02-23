package axonmallorchestrationsagatest.domain;

import axonmallorchestrationsagatest.domain.*;
import axonmallorchestrationsagatest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private String productId;
    private String productName;
    private Integer stock;
    private String orderId;
}
