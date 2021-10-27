package inventoryManagement.dto;

import java.sql.Timestamp;

public class Order {
	private Long orderId;
	private Long employeeId;
	private Long customerId;
	private Long productId;
	private Integer orderQuantity;
	private Timestamp orderDate;
	private Integer totalPrice;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, Long employeeId, Long customerId, Long productId, Integer orderQuantity,
			Timestamp orderDate, Integer totalPrice) {
		super();
		this.orderId = orderId;
		this.employeeId = employeeId;
		this.customerId = customerId;
		this.productId = productId;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", employeeId=" + employeeId + ", customerId=" + customerId
				+ ", productId=" + productId + ", orderQuantity=" + orderQuantity + ", orderDate=" + orderDate
				+ ", totalPrice=" + totalPrice + "]";
	}

}
