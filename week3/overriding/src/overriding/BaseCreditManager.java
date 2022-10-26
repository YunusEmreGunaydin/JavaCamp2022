package overriding;

public class BaseCreditManager {
	
	//final ekleyerek metodun ezilmesine engel oluruz//public final.
	public double calculate(double price) {
	
		return price * 1.18;
	}

}
