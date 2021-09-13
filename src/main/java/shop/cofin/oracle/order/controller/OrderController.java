package shop.cofin.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.order.domain.OrderDTO;
import shop.cofin.oracle.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	
	@RequestMapping("/orders")
	public void findAll() {
		List<OrderDTO> orders = orderService.findAll();
		for(OrderDTO order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/orderId/{orderId}")
	public void findByOrderId(@PathVariable int orderId) {
		OrderDTO orders = orderService.findByOrderId(orderId); 
		System.out.println(orders.toString());
	}
	@RequestMapping("/orders/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		OrderDTO orders = orderService.findByCustId(custId); 
		System.out.println(orders.toString());
	}
	@RequestMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		OrderDTO orders = orderService.findByBookId(bookId); 
		System.out.println(orders.toString());
	}
	@RequestMapping("/orders/orderPrice/{orderPrice}")
	public void findByOrderPrice(@PathVariable int orderPrice) {
		OrderDTO orders = orderService.findByOrderPrice(orderPrice); 
		System.out.println(orders.toString());
	}
	@RequestMapping("/orders/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		OrderDTO orders = orderService.findByOrderDate(orderDate); 
		System.out.println(orders.toString());
	}
}
