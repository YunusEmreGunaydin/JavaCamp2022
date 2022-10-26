package staticDemo;

public class ProductValidator {
	//Ürünleri güncellerken ve kaydederken kurallara uygun olup olmadığına bakmak için kullanılır.
	
	// Static yaptığımız zaman class ismi ile çağrıma imkanı doğuyor.
	// Static yaptığımız zaman class'ı newleme ihtiyacı duymayız.
	
	
	//Ana class static olmaz.Ancak inner class yani class içinde class oluşturduğumuz zaman o classları static yapabiliriz.
	static {
		System.out.println("Statik yapıcı blok çalıştı.");
	}
	
	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
