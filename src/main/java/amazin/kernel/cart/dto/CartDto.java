package amazin.kernel.cart.dto;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;

@Data
public class CartDto {

    private String id;
    private List<CartProductDto> products = new LinkedList<>();
}
