package come.qa.main;



public class Runner {

	public static void main(String[] args) {
		
		
		Vehicle Lamboghini = new Car();
		Vehicle Honda_Super_Cub = new Motorbike();
		Vehicle Cessna_172 = new Aircraft();
		
		
		Garage g = new Garage();
		
		g.vehicleList.add(Lamboghini);
		g.vehicleList.add(Honda_Super_Cub);
		g.vehicleList.add(Cessna_172);
		
		
		//Prints out list of vehicles
		System.out.println(g.vehicleList);
		
		
		
		g.calculateBill();
		
		g.removeByType("Motorbike");
		
		g.fixByType("car");
		
		g.emptyGarage();
		
	
	}

	

}
