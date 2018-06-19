package amazin.kernel.payment.dto;

import lombok.Data;

@Data
public class PaymentDto {
    private String id;
    private String accountId;
    private int amount;
}
