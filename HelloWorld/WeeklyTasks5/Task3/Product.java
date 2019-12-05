package Task3;

public class Product {
	private int location;
	private int amount;
	private String productNumber;
	public Product(String productNumber,int location, int amount ) {
		this.location = location;
		this.amount = amount;
		this.productNumber = productNumber;
	}
	public Product(String productNumber) {
		this.productNumber = productNumber;
	}
	public Product() {}
	@Override
	public String toString() {
		return "Product [location=" + location + ", amount=" + amount + ", productNumber=" + productNumber + "]";
	}
}
