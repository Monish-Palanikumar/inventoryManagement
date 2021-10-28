package inventoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import inventoryManagement.dao.EmployeeDao;
import inventoryManagement.databaseConfig.DbConfig;
import inventoryManagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	DbConfig dbConfig;

	PreparedStatement stmt;

	public EmployeeDaoImpl() {
		dbConfig = DbConfig.getDbConfig();
	}

	@Override
	public Boolean add(Employee employee) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"INSERT INTO employee (employeeId, employeeName, salary, jobTitle) VALUES (?,?,?,?);");
			stmt.setLong(1, employee.getEmployeeId());
			stmt.setString(2, employee.getEmployeeName());
			stmt.setInt(3, employee.getSalary());
			stmt.setString(4, employee.getJobTitle());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean update(Employee employee) {
		try {
			stmt = dbConfig.getCon()
					.prepareStatement("UPDATE employee SET employeeName=?, salary=?, jobTitle=? WHERE employeeId=?;");
			stmt.setString(1, employee.getEmployeeName());
			stmt.setInt(2, employee.getSalary());
			stmt.setString(3, employee.getJobTitle());
			stmt.setLong(4, employee.getEmployeeId());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean delete(Long employeeId) {
		try {
			stmt = dbConfig.getCon().prepareStatement("DELETE FROM employee WHERE employeeId=?;");
			stmt.setLong(1, employeeId);
			int n = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee searchById(Long employeeId) {
		ResultSet rs = null;
		Employee employee = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM employee WHERE employeeId=?;");
			stmt.setLong(1, employeeId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEmployeeId(rs.getLong("CustomerId"));
				employee.setEmployeeName(rs.getString("customerName"));
				employee.setSalary(rs.getInt("salary"));
				employee.setJobTitle(rs.getString("jobTitle"));
				return employee;
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Employee> employeeList() {
		List<Employee> list = new ArrayList<Employee>();
		ResultSet rs = null;
		Employee employee = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM employee;");
			rs = stmt.executeQuery();
			while (rs.next()) {
				employee = new Employee();
				employee.setEmployeeId(rs.getLong("employeeId"));
				employee.setEmployeeName(rs.getString("employeeName"));
				employee.setSalary(rs.getInt("salary"));
				employee.setJobTitle(rs.getString("jobTitle"));
				list.add(employee);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
