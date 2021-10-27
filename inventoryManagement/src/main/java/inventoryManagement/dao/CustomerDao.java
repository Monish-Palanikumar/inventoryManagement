package inventoryManagement.dao;

import java.util.List;

import inventoryManagement.dto.Customer;

public interface CustomerDao {
	public Boolean add(Customer customer);

	public Boolean update(Customer customer);

	public Boolean delete(Long customerId);

	public Customer searchById(Long customerId);

	public List<Customer> customerList();
}
