package come.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> vehicleList = new ArrayList<>();
	
	
	
	//1 . Calculate Bill
	public void calculateBill() {
		
			for ( Vehicle i : vehicleList ) {
			
				int bill = 0;
			
				switch(i.type()) {
					case "car": 
						bill = 2 * i.avSpeed() * i.avCost();
						break;
					case "Motorbike": 
						bill = 1 * i.avSpeed() * i.avCost();
						break;
					case "Aircraft": 
						bill = 4 * i.avSpeed() * i.avCost();
						break;
				}
			
				System.out.println(i + " Bill: £" + bill);
			
			}
		
	}
	
	//Add Vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	
	//RemoveByType
	public void removeByType(String type) {
		
		// create a placeholder list
		List<Vehicle> removeList = new ArrayList<Vehicle>();
		
		for ( Vehicle v : vehicleList) {
			
			
			if ( v.type().equals(type) ) {
				System.out.println("Removing vehicle " + v);
			} else {
				removeList.add(v);
			}
			
		}	
		
		vehicleList = removeList;
		System.out.println(vehicleList);
		
	}
	
	
	//Fix by Type
	public void fixByType(String type) {
		
		for ( Vehicle v : vehicleList ) {
			
			int bill = 0;
			
			if(v.type().contentEquals(type)) {
				bill = v.avSpeed() * v.avCost();
				System.out.println(v + " Bill: £" + bill);
			} 
			
		}
		
	}
	
	
	//Empty Garage
	public void emptyGarage() {
		
		vehicleList.clear();
		
		System.out.println("Garage is empty! " + vehicleList);
		
	}
	
}


