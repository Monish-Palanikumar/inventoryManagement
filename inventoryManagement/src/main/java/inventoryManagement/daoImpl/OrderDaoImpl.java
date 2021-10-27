package inventoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import inventoryManagement.dao.OrderDao;
import inventoryManagement.dao.ProductDao;
import inventoryManagement.databaseConfig.DbConfig;
import inventoryManagement.dto.Order;
import inventoryManagement.dto.Product;

public class OrderDaoImpl implements OrderDao {

// point 1 
// calculate the total price and grand total price for same customer 101 
// 2 Television 2*25000=50000(total price) 
// 3 mobile 3*15000=45000(total price) 
// total grand price 50000+45000= 95000 
// point 2 
// buying quantity must be minus from product availability 
// productAvailabilty - orderQuantity; 

	DbConfig dbConfig;
	PreparedStatement stmt;
	private ProductDao productDao;

	public OrderDaoImpl() {
		dbConfig = DbConfig.getDbConfig();
		productDao = new ProductDaoImpl();
	}

	@Override
	public Boolean add(Order order) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"INSERT INTO Order1 (orderId, employeeId, customerId, productId, orderQuantity, orderDate, totalPrice) VALUES (?,?,?,?,?,?,?);");
			Long orderId = order.getOrderId();
			Long employeeId = order.getEmployeeId();
			Long customerId = order.getCustomerId();
			Long productId = order.getProductId();
			Integer orderQuantity = order.getOrderQuantity();
			Timestamp orderDate = Timestamp.from(Instant.now());
			Integer totalPrice = order.getTotalPrice();
			Product product = productDao.searchById(productId);
			if (product.getProductAvailability() < orderQuantity) {
				throw new ArithmeticException("We do not have enough quantity of " + product.getProductName());
			}
			if (totalPrice <= 0 || totalPrice == null) {
				throw new NullPointerException("You must buy atleast one product");
			}
			stmt.setLong(1, orderId);
			stmt.setLong(2, employeeId);
			stmt.setLong(3, customerId);
			stmt.setLong(4, productId);
			stmt.setInt(5, orderQuantity);
			stmt.setTimestamp(6, orderDate);
			stmt.setInt(7, totalPrice);
			int i = stmt.executeUpdate();
			stmt = null;
			stmt = dbConfig.getCon().prepareStatement("UPDATE Product SET productAvailability=? where productID=?");
			Integer remainingQuantity = product.getProductAvailability() - orderQuantity;
			stmt.setInt(1, remainingQuantity);
			stmt.setLong(2, product.getProductId());
			i = stmt.executeUpdate();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		} catch (ArithmeticException e2) {
			e2.printStackTrace();
			return false;
		} catch (NullPointerException e3) {
			e3.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean update(Order order) {
		try {
			stmt = dbConfig.getCon().prepareStatement("UPDATE Order1 SET orderQuantity = ? where orderId=?");
			stmt.setInt(1, order.getOrderQuantity());
			stmt.setLong(2, order.getOrderId());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean delete(Long orderId) {
		try {
			stmt = dbConfig.getCon().prepareStatement("DELETE FROM Order1 WHERE orderId=?;");
			stmt.setLong(1, orderId);
			int n = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Order searchById(Long orderId) {
		ResultSet rs = null;
		Order order = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM Order1 WHERE orderId=?;");
			stmt.setLong(1, orderId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				order = new Order();
				order.setOrderId(rs.getLong("OrderId"));
				order.setEmployeeId(rs.getLong("employeeId"));
				order.setCustomerId(rs.getLong("customerId"));
				order.setProductId(rs.getLong("productId"));
				order.setOrderQuantity(rs.getInt("orderQuantity"));
				order.setOrderDate(rs.getTimestamp("orderDate"));
				order.setTotalPrice(rs.getInt("totalPrice"));
				return order;
			}
			return order;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Order> orderList() {
		List<Order> orderlist = new ArrayList<Order>();
		ResultSet rs = null;
		Order order = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM Order1");
			rs = stmt.executeQuery();
			while (rs.next()) {
				order = new Order();
				order.setOrderId(rs.getLong("orderId"));
				order.setEmployeeId(rs.getLong("employeeId"));
				order.setCustomerId(rs.getLong("customerId"));
				order.setProductId(rs.getLong("productId"));
				order.setOrderQuantity(rs.getInt("orderQuantity"));
				order.setOrderDate(rs.getTimestamp("orderDate"));
				order.setTotalPrice(rs.getInt("totalPrice"));
				orderlist.add(order);
			}
			return orderlist;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
