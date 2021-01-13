package come.qa.main;

public class Motorbike extends Vehicle{

	
	@Override
	public int numberOfWheels() {
		return 2;
	}
	
	@Override
	
	public int avSpeed() {
		return 90;
	}
	
	@Override
	public int avCost() {
		return 200;
	}
	
	@Override
	public String toString() {
		return "Motorbike [numberOfWheels()= " + numberOfWheels() + ", avSpeed()= " + avSpeed()
				+ "]";
	}
	
	@Override
	public String type() {
		return "Motorbike";
	}

	
	
		
	
	

	
	
}
