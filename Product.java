package Persistent.Session.ExcelSheetRead;

public class Product {
	private String productId;
	private String productName;
	private String categoryName;
	private double price;
	private String itemInStock;
	
	public Product(String productId, String productName, String categoryName,  double price, String itemInStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
		this.itemInStock = itemInStock;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String isItemInStock() {
		return itemInStock;
	}
	public void setItemInStock(String itemInStock) {
		this.itemInStock = itemInStock;
	}
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", price=" + price + ", itemInStock=" + itemInStock + "]";
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	

}
