package labs.lab4;

//Lab 4 Part I
public class GeoLocation {
	
	private double lat; //Exercise 1: two instance variables 'lat' & 'lng' created,
	private double lng; //which are doubles.
	
	public GeoLocation() { //Exercise 2: Default constructor,
		setLat(0); //'lat' & 'lng' both set to zero.
		setLng(0);
	}
	
	public GeoLocation(double lat, double lng) { //Exercise 3: Non-default
		setLat(lat); //constructor;'lat' & 'lng' both set to values of
		setLng(lng); //corresponding parameters.
	}
	
	public double getLat() { //Exercise 4: Accessor method for 'lat'
		return this.lat;     //instance variable
	}

	public double getLng() { //Accessor method for 'lng'
		return this.lng;     //instance variable
	}
	
	public void setLat(double lat) { //Exercise 5: Mutator method for 'lat'
		this.lat = lat;              //instance variable
	}

	public void setLng(double lng) { //Mutator method for 'lng'
		this.lng = lng;              //instance variable
	}

	public String toString() { //Exercise 6: This method will return a Geolocation
		return "(" + this.lat + "," + this.lng + ")"; //instance in the
	} //string format
	
	public boolean latCheck() { //Exercise 7: This method checks if the 'lat'
		if (this.lat >= -90 && this.lat <= 90) { //instance
			return true; //variable value is between -90 & 90
		}
		return false;
	}
	
	public boolean lngCheck() { //Exercise 8: This method checks if the 'lng'
		if (this.lng >= -180 && this.lng <= 180) { //instance variable value is
			return true; //between -180 & 180
		}
		return false;
	}
	
	public static GeoLocation parseLocation(String LocationString) { //Exercise 9:
		GeoLocation location = new GeoLocation(); //This method will scan
		                      //a location in string format and parse it into
		String latString = ""; //a GeoLocation object.
		String lngString = "";
		
		int i = 0; //index in string
		
		while(true) { //infinite loop
			if (LocationString.charAt(i) == '(') { //scans for a left-hand bracket
				i++; //index incremented to search for element immediately
				     //after left-hand bracket
				while(LocationString.charAt(i) != ',') { //searches(and verifies 
					//for numbers in string format till preceding comma.
					//Between '(' & ',', 'lat' in string form
					//is stored.
					if ((LocationString.charAt(i) >= '0') && (LocationString.charAt(i) <= '9')
							|| (LocationString.charAt(i) == '+') || (LocationString.charAt(i) == '-')
							|| (LocationString.charAt(i) == '.')) {
						latString += LocationString.charAt(i); //'lat' string is being built.
					}
					i++; //index incremented by 1 each time to scan next element in location string
				}
				i++; //index incremented by 1 to search for values after the comma till the
				//right-hand bracket.
				while(LocationString.charAt(i) != ')') { //Elements
					//between ',' & ')' (right-hand bracket) have 'lng' in string format.
					if ((LocationString.charAt(i) >= '0') && (LocationString.charAt(i) <= '9')
							|| (LocationString.charAt(i) == '-') || (LocationString.charAt(i) == '+')
							|| (LocationString.charAt(i) == '.')) {
						lngString += LocationString.charAt(i); //'lng' string is being built.
					}
					i++; //index incremented by 1 each time to scan next element in location string.
				}
			}
			i++; //index incremented by 1 to scan next element in location string
			//if conditions above not met.
			if (i >= LocationString.length() - 1) { //if index is equal(or greater
				//than, in extreme cases) to right-most index number in location 
				//string, while loop is broken.
				break;
			}
		}
		location.setLat(Double.parseDouble(latString)); //lat & lng strings parsed
		location.setLng(Double.parseDouble(lngString)); //into double format
		return location;
	}
}