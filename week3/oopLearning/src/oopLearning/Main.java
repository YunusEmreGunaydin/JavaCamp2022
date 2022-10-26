package oopLearning;

public class Main {

	public static void main(String[] args) {
		
		
		//value type
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		
		System.out.println(number1);
		
		//reference type
		
		int[] numbers1 = {1,2,3,4};
		int[] numbers2 = {10,20,30,40};
		numbers1 = numbers2;
		numbers2[1] = 100;
		 
		System.out.println(numbers1[1]);
		/////////////////		
		
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setCity("Kütahya");
		
		/*
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		*/
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCity("Ankara");
		corporateCustomer.setTaxNumber("2313213113");
		
		IndivialCustomer indivialCustomer = new IndivialCustomer();
		indivialCustomer.setId(3);
		indivialCustomer.setFirstName("Yunus Emre");
		indivialCustomer.setLastName("Günaydın");
		indivialCustomer.setNationalIdentity("231414214");
		indivialCustomer.setCity("Balıkesir");
		
		CustomerManager customerManager2 = new CustomerManager(indivialCustomer,new  MilitaryCreditManager());
		customerManager2.giveCredit();
		
		
		
		
	}

}
