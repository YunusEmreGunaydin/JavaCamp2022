package oopLearning;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesapland─▒.");
	}
	
	@Override
	public void save() {
		super.save();
	}
	

}
