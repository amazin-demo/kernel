package amazin.kernel.order.command;

import java.util.List;

import amazin.kernel.order.dto.OrderItemDto;
import lombok.Value;

@Value
public class PlaceOrder {
    private final String accountId;
    private final List<OrderItemDto> items;
}
