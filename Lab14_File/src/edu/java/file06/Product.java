package edu.java.file06;

public class Product {
	// field
	private int productId; // 상품 번호
	private String productName; // 상품 이름
	private int productPrice; // 상품 가격
	
	// constructor
	public Product() {}
	public Product(int productId, String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	// getters & setters
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product{id=" + this.productId + ", name=" + this.productName + ", price=" + this.productPrice + "}";
	}
	
}
