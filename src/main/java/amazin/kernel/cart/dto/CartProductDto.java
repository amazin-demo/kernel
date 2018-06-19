package amazin.kernel.cart.dto;

import lombok.Data;

@Data
public class CartProductDto {
    private String sku;
    private int quantity;
}
