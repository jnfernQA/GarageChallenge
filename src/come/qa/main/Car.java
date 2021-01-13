package come.qa.main;

public class Car extends Vehicle{
	
	@Override
	public int numberOfWheels() {
		return 4;
	}
	
	@Override
	
	public int avSpeed() {
		return 80;
	}
	
	@Override
	public int avCost() {
		return 400;
	}
	
	
	@Override
	public String toString() {
		return "Car [numberOfWheels()= " + numberOfWheels() + ", avSpeed()= " + avSpeed()
				+ "]";
	}
	
	@Override
	public String type() {
		return "car";
	}

	
		


	

}
