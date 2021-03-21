package labs.lab4;

//Lab 4 Part II

public class PhoneNumber {
	
	private String countryCode; //Exercise 1: 3 instance variables created
	private String areaCode;
	private String number;
	
	public PhoneNumber() { //Exercise 2: Default constructor
		setCountryCode("null");                    //*stringSimplifier used
		setAreaCode("null");                       //to return error message
		setNumber("null");                         //for no input.                        
	}                                              
	
	public PhoneNumber(String areaCode,String number) { //Exercise 3: 
		setCountryCode("001");     //Non-default constructor
		setAreaCode(areaCode);
		setNumber(number);
	}
	
	public PhoneNumber(String countryCode,String areaCode,String number) {
		this.countryCode = countryCode;  //Non-default constructor
		this.areaCode = areaCode;
		this.number = number;
	}

	public String getCountryCode() { //Exercise 4: Accessor methods
		return countryCode;          //for
	}                                //each of the
                                     //3 instance variables
	public String getAreaCode() {    //created.
		return areaCode;
	}

	public String getNumber() {
		return number;
	}

	public void setCountryCode(String countryCode) { //Exercise 5: Mutator methods
		this.countryCode = countryCode;        //for
	}                                          //each
                                               //of 
	public void setAreaCode(String areaCode) { //the 3
		this.areaCode = areaCode;              //instance
	}                                          //variables
                                               //created.
	public void setNumber(String number) {
		this.number = number;
	}

	public String toString() {
		if (countryCode == "null" || areaCode == "null" || number == "null") { //Exercise 6:
			return "Invalid Phone Number"; //This method returns entire phone number in
		}                                  //string format. Will also display error message
		return (countryCode + areaCode + number); //if either of 3 variables = null.
	}
	
	public boolean areaCodeChecker() { //Exercise 7: This method returns
		if (this.areaCode.length() != 3) {  //true if areaCode is 3 
			return false;                   //characters long.
		}
		return true;
	}
	
	public boolean numberChecker() { //Exercise 8: This method returns true
		if (this.number.length() != 7) { //if numberChecker is 7 characters
			return false;  //long.
		}
		return true;
	}
	
	public boolean phoneNumberChecker() { //Exercise 9: This method returns
		if (areaCodeChecker() && numberChecker()) { //true if areaCodeChecker()
			return true; // & numberChecker() is true. 
		}
		return false;
	}
}
