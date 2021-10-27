package inventoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import inventoryManagement.dao.CustomerDao;
import inventoryManagement.databaseConfig.DbConfig;
import inventoryManagement.dto.Customer;

public class CustomerDaoImpl implements CustomerDao {

	DbConfig dbConfig;

	PreparedStatement stmt;

	public CustomerDaoImpl() {
		dbConfig = DbConfig.getDbConfig();
	}

	@Override
	public Boolean add(Customer customer) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"INSERT INTO Customer (customerId, customerName, customerPhone, customerAge) VALUES (?,?,?,?);");
			stmt.setLong(1, customer.getCustomerId());
			stmt.setString(2, customer.getCustomerName());
			stmt.setString(3, customer.getCustomerPhone());
			stmt.setInt(4, customer.getCustomerAge());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean update(Customer customer) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"UPDATE Customer SET customerName=?, customerPhone=?, customerAge=? WHERE customerId=?;");
			stmt.setString(1, customer.getCustomerName());
			stmt.setString(2, customer.getCustomerPhone());
			stmt.setInt(3, customer.getCustomerAge());
			stmt.setLong(4, customer.getCustomerId());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean delete(Long customerId) {
		try {
			stmt = dbConfig.getCon().prepareStatement("DELETE FROM Customer WHERE customerId=?;");
			stmt.setLong(1, customerId);
			int n = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Customer searchById(Long customerId) {
		ResultSet rs = null;
		Customer customer = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM Customer WHERE customerId=?;");
			stmt.setLong(1, customerId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getLong("CustomerId"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setCustomerPhone(rs.getString("customerPhone"));
				customer.setCustomerAge(rs.getInt("customerAge"));
				return customer;
			}
			return customer;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Customer> customerList() {
		ResultSet rs = null;
		Customer customer = null;
		List<Customer> list = new ArrayList<Customer>();
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM Customer;");
			rs = stmt.executeQuery();
			while (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getLong("CustomerId"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setCustomerPhone(rs.getString("customerPhone"));
				customer.setCustomerAge(rs.getInt("customerAge"));
				list.add(customer);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}