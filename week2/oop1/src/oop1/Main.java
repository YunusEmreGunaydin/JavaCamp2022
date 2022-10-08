package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrace(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrace(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrace(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
	
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055555555");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("Yunus Emre");
		individualCustomer.setLastName("Günaydın");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("1235");
		corporateCustomer.setPhone("0554335345");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("3124114");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
		

	}

}
