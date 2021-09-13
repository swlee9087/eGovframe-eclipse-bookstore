package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.order.domain.OrderDTO;

@Component
public interface OrderService {
	public List<OrderDTO> findAll();
	public OrderDTO findByOrderId(int orderId);
	public OrderDTO findByCustId(int custId);
	public OrderDTO findByBookId(int bookId);
	public OrderDTO findByOrderPrice(int orderPrice);
	public OrderDTO findByOrderDate(String orderDate);

}
