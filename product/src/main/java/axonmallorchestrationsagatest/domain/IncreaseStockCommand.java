package axonmallorchestrationsagatest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class IncreaseStockCommand {

    private Integer stock;
    private String orderId;
}
