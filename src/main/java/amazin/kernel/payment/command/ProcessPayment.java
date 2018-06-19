package amazin.kernel.payment.command;

import lombok.Value;

@Value
public class ProcessPayment {
    private final String accountId;
    private final int amount;
}
