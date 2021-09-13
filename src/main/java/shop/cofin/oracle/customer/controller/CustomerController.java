package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.customer.domain.CustomerDTO;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller @RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	
	@RequestMapping ("/join")
	public String join() {
		return "Join Success!";
	}
	@RequestMapping ("/login")
	public String login() {
		return "Login Success!";
	}
	
	
	public void findAll() {
		List<CustomerDTO> customers = customerService.findAll();
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	@RequestMapping("/customers/custId/{custId}")
	public void findById (@PathVariable int custId) {
		List<CustomerDTO> customers = null;
	}
	@RequestMapping("/customers/custName/{custName}")
	public void findByCustName (@PathVariable String custName) {
		List<CustomerDTO> customers = null;
	}
	@RequestMapping("/customers/address/{address}")
	public void findByAddress (@PathVariable String address) {
		List<CustomerDTO> customers = null;
	}
	@RequestMapping("/customers/phone/{phone}")
	public void findByPhone (@PathVariable String phone) {
		List<CustomerDTO> customers = null;
	}
	
}
