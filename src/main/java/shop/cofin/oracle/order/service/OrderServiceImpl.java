package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.cofin.oracle.order.domain.OrderDTO;
import shop.cofin.oracle.mappers.OrderMapper;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired OrderMapper orderMapper;
	
	@Override
	public List <OrderDTO> findAll(){
		return orderMapper.findAll();}
	@Override
	public OrderDTO findByOrderId(int orderId) {
		return orderMapper.findByOrderId(orderId);}
	@Override
	public OrderDTO findByCustId(int custId) {
		return orderMapper.findByCustId(custId);}
	@Override
	public OrderDTO findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);}
	@Override
	public OrderDTO findByOrderPrice(int orderPrice) {
		return orderMapper.findByOrderPrice(orderPrice);}
	@Override
	public OrderDTO findByOrderDate(String orderDate) {
		return orderMapper.findByOrderDate(orderDate);}
}
