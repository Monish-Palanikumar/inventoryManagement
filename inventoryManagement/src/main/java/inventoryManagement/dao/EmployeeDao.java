package inventoryManagement.dao;

import java.util.List;

import inventoryManagement.dto.Employee;

public interface EmployeeDao {
	public Boolean add(Employee employee);

	public Boolean update(Employee employee);

	public Boolean delete(Long employeeId);

	public Employee searchById(Long employeeId);

	public List<Employee> employeeList();
}
