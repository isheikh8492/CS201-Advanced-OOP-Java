package labs.lab4;


//Lab 4 Exercise 10

//This application class will instantiate two instances of GeoLocation, and then
//test the methods of the GeoLocation class.
public class GeoLocationApplication {

	public static void main(String[] args) {
		
		GeoLocation coordinate1 = new GeoLocation(); //Default constructor 
		                                             //instantiated
		GeoLocation coordinate2 = new GeoLocation(34.56,-45.68); //Non-default 
		                                             //constructor instantiated
				
		System.out.println("Latitude of coordinate 1: " + //Accessor methods
		coordinate1.getLat() + "\n");                     //for 'lat' &  
		System.out.println("Longitude of coordinate 1: "  //'lng', in each
		+ coordinate1.getLng() + "\n");                   // of the
				                                          //first two coordinates,
		System.out.println("Latitude of coordinate 2: " + //called.
		coordinate2.getLat() + "\n");
		System.out.println("Longitude of coordinate 2: "
		+ coordinate2.getLng() + "\n");
				
		coordinate2.setLat(-1000); //Accessor method called to set 'lat' data 
		                           //out of range
		System.out.println(coordinate2.latCheck() + "\n" ); //Checker returns false,
		                                           //checker working fine.
				
		String target = "Target located. Coordinates: (-68.56,25.71)";//Testing
				                                                      //parseLocation
		GeoLocation coordinate3 = GeoLocation.parseLocation(target);  //method
				
		System.out.println("Coordinate 3: " + coordinate3.toString());
		//parseLocation method also works fine.
	}

}
