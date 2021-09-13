package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.customer.domain.CustomerDTO;

@Repository
public interface CustomerMapper {
	public List<CustomerDTO> findAll();
	public CustomerDTO findById(int custId);
	public CustomerDTO findByCustName(String custName);
	public CustomerDTO findByAddress(String address);
	public CustomerDTO findByPhone(String phone);
	void save(CustomerDTO customer);

}
