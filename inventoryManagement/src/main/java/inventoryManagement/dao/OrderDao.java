package inventoryManagement.dao;

import java.util.List;

import inventoryManagement.dto.Order;

public interface OrderDao {

	public Boolean add(Order order);

	public Boolean update(Order order);

	public Boolean delete(Long orderId);

	public Order searchById(Long orderId);

	public List<Order> orderList();

}
