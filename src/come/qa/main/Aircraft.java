package come.qa.main;

public class Aircraft extends Vehicle{

	@Override
	public int numberOfWheels() {
		return 3;
	}
	
	@Override
	
	public int avSpeed() {
		return 962;
	}
	
	@Override
	public int avCost() {
		return 4000;
	}
	
	@Override
	public String toString() {
		return "Aircraft [numberOfWheels()= " + numberOfWheels() + ", avSpeed()= " + avSpeed()
				+ "]";
	}
	
	@Override
	public String type() {
		return "Aircraft";
	}

	
	
	
	
}
