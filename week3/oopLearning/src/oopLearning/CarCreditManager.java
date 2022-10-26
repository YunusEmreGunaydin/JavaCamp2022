package oopLearning;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
	    System.out.println("Araba kredisi hesaplandı.");
	}

	@Override
	public void save() {
		
		super.save();
	}

}
