package amazin.kernel.order.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String id;
    private String accountId;
    private List<OrderItemDto> items;
}
