package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//veritabanı objesi
public class JdbcProductDao implements ProductDao{
  
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır... SQL yazılır..
		
		System.out.println("JDBC ile veritabanına eklendi.");
	}
	
}
