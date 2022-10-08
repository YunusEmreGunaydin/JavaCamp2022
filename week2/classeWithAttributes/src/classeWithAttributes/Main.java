package classeWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setUnitPrice(5000);
		product.setStockAmount(123);
		
		Product product2 = new Product(1,"Mouse","Logitec Mouse",3000,222);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
	}

}
