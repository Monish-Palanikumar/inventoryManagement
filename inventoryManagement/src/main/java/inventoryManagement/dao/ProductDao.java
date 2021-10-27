package inventoryManagement.dao;

import java.util.List;

import inventoryManagement.dto.Product;

public interface ProductDao {
	public Boolean add(Product product);

	public Boolean update(Product product);

	public Boolean delete(Long productId);

	public Product searchById(Long productId);

	public List<Product> productList();
}
