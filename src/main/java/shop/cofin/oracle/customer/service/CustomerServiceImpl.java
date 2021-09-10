package shop.cofin.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.customer.domain.CustomerDTO;
import shop.cofin.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;
	
	@Override
	public List<CustomerDTO> findAll(){
		return customerMapper.findAll();
	}
	@Override
	public CustomerDTO findById(int custId) {
		return customerMapper.findById(custId);
	};
	
	public CustomerDTO findByCustName(String custName) {
		return customerMapper.findByCustName(custName);
	};
	
	public CustomerDTO findByAddress(String address) {
		return customerMapper.findByAddress(address);
	};
	
	public CustomerDTO findByPhone(String phone) {
		return customerMapper.findByPhone(phone);
	};
}
