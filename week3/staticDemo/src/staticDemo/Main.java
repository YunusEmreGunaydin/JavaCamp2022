package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.price = 120;
		product.name = "Logitech Mouse";
		
		productManager.add(product);
		
		
		//Artık bu kullanımı önerilmiyor.
		DatabaseHelper.Crud.update();

	}

}
