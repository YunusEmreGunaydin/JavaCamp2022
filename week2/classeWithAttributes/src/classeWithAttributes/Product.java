package classeWithAttributes;

public class Product {
	
	public Product() {
		
	}

	public Product(int id, String name, String description, double unitPrice, int stockAmount) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.stockAmount = stockAmount;
	}
	private int id;
	private String name;
	private String description;
	private double unitPrice;
	private int stockAmount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
}
