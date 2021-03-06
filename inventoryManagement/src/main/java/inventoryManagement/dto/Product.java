package inventoryManagement.dto;

public class Product {
	private Long productId;
	private String productName;
	private Integer productPrice;
	private Integer productAvailability;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String productName, Integer productPrice, Integer productAvailability) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productAvailability = productAvailability;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(Integer productAvailability) {
		this.productAvailability = productAvailability;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productAvailability=" + productAvailability + "]";
	}

}
