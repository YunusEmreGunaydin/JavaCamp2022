package oopLearning;

public class CorporateCustomer extends Customer{
	
	private String CompanyName;
	private String taxNumber;
	
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
}
