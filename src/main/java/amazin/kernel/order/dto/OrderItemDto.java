package amazin.kernel.order.dto;

import lombok.Data;

@Data
public class OrderItemDto {
    private String sku;
    private int quantity;
    private int price;
}
