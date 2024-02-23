package axonmallorchestrationsagatest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DecreaseStockCommand {

    private Integer stock;
    private String orderId;
}
