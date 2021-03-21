package project;
//8th May 2020, This class is responsible for creating instances of different routes, reading the data fed and modifying it.
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends MenuOperation {

	static CTARoute redLine = new CTARoute("Red Line");
    static CTARoute greenLine = new CTARoute("Green Line");
    static CTARoute blueLine = new CTARoute("Blue Line");
    static CTARoute brownLine = new CTARoute("Brown Line");
    static CTARoute purpleLine = new CTARoute("Purple Line");
    static CTARoute pinkLine = new CTARoute("Pink Line");
    static CTARoute orangeLine = new CTARoute("Orange Line");
    static CTARoute yellowLine = new CTARoute("Yellow Line");
    
    static {
    	dataRead();
    }
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		arrangeStations();
		String choice = "";
		
		mainMenu();
		choice = input.next();
		if (choice.equals("7")) {
			System.out.println("\nProgram exited successfully.");
		} else if (choice.equals("1")) {
			inputChoiceOne();
			arrangeStations();
		} else if (choice.equals("3")) {
			inputChoiceThree();
		} else if (choice.equals("2")) {
			inputChoiceTwo();
		} else if (choice.equals("4")) {
			inputChoiceFour();
		} else if (choice.equals("5")) {
			inputChoiceFive();
		} else if (choice.equals("6")) {
			inputChoiceSix();
		}
		
		input.close();
	}
	
	private static void dataRead() {
		try {
			File stationList = new File("src\\project\\CTAStops.csv");
			Scanner fileReader = new Scanner(stationList);
	        
	        while (fileReader.hasNextLine()) {
	        	String inputLine = fileReader.nextLine();
	        	CTAStation currentStation;
	        	if ((inputLine.substring(0,4).equalsIgnoreCase("Name")) || (inputLine.substring(0,4).equalsIgnoreCase("Null"))) {
	        		
	        	} else {
	        		currentStation = new CTAStation();
	        		currentStation = CTAStation.parseCTAStation(inputLine);
	        		if (currentStation.getRedPosition() >= 0) {
	        			redLine.addStation(currentStation);
	        		}
	        		if (currentStation.getGreenPosition() >= 0) {
	        			greenLine.addStation(currentStation);
	        		}
	        		if (currentStation.getBluePosition() >= 0) {
	        			blueLine.addStation(currentStation);
	        		}
	        		if (currentStation.getBrownPosition() >= 0) {
	        			brownLine.addStation(currentStation);
	        		}
	        		if (currentStation.getPurplePosition() >= 0) {
	        			purpleLine.addStation(currentStation);
	        		}
	        		if (currentStation.getPinkPosition() >= 0) {
	        			pinkLine.addStation(currentStation);
	        		}
	        		if (currentStation.getOrangePosition() >= 0) {
	        			orangeLine.addStation(currentStation);
	        		}
	        		if (currentStation.getYellowPosition() >= 0) {
	        			yellowLine.addStation(currentStation);
	        		}
	        	}	
	        }
	        fileReader.close();
	        } catch (Exception e) {
	        	e.getStackTrace();
		}
	}
	
	private static void arrangeStations() {
		redLine.sort();
		greenLine.sort();
		blueLine.sort();
		brownLine.sort();
		purpleLine.sort();
		pinkLine.sort();
		orangeLine.sort();
		yellowLine.sort();
	}
	
	private static void mainMenu() {
		System.out.print("Choose from the following: \r\n" + 
				"1. Add a new station.\r\n" + 
				"2. Modify an existing station.\r\n" + 
				"3. Remove an existing station.\r\n" + 
				"4. Search station(s).\r\n" + 
				"5. Find the nearest station.\r\n" + 
				"6. Plan a journey.\r\n" + 
				"7. Exit the application.\r\n" + 
				">> ");
	}
	
	

}
