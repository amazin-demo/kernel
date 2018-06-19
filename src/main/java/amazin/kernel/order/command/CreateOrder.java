package amazin.kernel.order.command;

import lombok.Value;

@Value
public class CreateOrder {
    private final String cartId;
}
