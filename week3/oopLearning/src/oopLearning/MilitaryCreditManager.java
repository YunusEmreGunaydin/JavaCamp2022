package oopLearning;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı.");
	}
	
	@Override
	public void save() {
		super.save();
	}
	

}