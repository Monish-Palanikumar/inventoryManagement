package inventoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import inventoryManagement.dao.ProductDao;
import inventoryManagement.databaseConfig.DbConfig;
import inventoryManagement.dto.Product;

public class ProductDaoImpl implements ProductDao {
	DbConfig dbConfig;
	PreparedStatement stmt;

	public ProductDaoImpl() {
		dbConfig = DbConfig.getDbConfig();
	}

	@Override
	public Boolean add(Product product) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"INSERT INTO product (productId, productName, productPrice, productAvailability) VALUES (?,?,?,?);");
			stmt.setLong(1, product.getProductId());
			stmt.setString(2, product.getProductName());
			stmt.setInt(3, product.getProductPrice());
			stmt.setInt(4, product.getProductAvailability());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean update(Product product) {
		try {
			stmt = dbConfig.getCon().prepareStatement(
					"UPDATE product SET productName=?, productPrice=?, productAvailability=? WHERE productId=?;");
			stmt.setString(1, product.getProductName());
			stmt.setInt(2, product.getProductPrice());
			stmt.setInt(3, product.getProductAvailability());
			stmt.setLong(4, product.getProductId());
			int i = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean delete(Long productId) {
		try {
			stmt = dbConfig.getCon().prepareStatement("DELETE FROM product WHERE productId=?;");
			stmt.setLong(1, productId);
			int n = stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product searchById(Long productId) {
		ResultSet rs = null;
		Product product = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM product WHERE productId=?;");
			stmt.setLong(1, productId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				product = new Product();
				product.setProductId(rs.getLong("productId"));
				product.setProductName(rs.getString("productName"));
				product.setProductPrice(rs.getInt("productPrice"));
				product.setProductAvailability(rs.getInt("productAvailability"));
				return product;
			}
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> productList() {
		List<Product> list = new ArrayList<Product>();
		ResultSet rs = null;
		Product product = null;
		try {
			stmt = dbConfig.getCon().prepareStatement("SELECT * FROM product;");
			rs = stmt.executeQuery();
			if (rs.next()) {
				product = new Product();
				product.setProductId(rs.getLong("productID"));
				product.setProductName(rs.getString("productName"));
				product.setProductPrice(rs.getInt("productPrice"));
				product.setProductAvailability(rs.getInt("productAvailability"));

				list.add(product);

			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}