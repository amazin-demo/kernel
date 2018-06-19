package amazin.kernel.order.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderDto {
    private String id;
    private String accountId;
    private List<OrderItemDto> items;
}
