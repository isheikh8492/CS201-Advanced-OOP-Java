package labs.lab5;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class CTAStopApp extends GeoLocation {

	static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) throws IOException {
		
		File stationList = new File("src/labs/lab5/greenLineStops.csv");
		Scanner fileReader = new Scanner(stationList);
		
		
		int c = 0;
		CTAStation[] stationArray = new CTAStation[c];
		
		while(fileReader.hasNextLine()){
		
			try {
				String inputLine = fileReader.nextLine();
				if (!(inputLine.substring(0,4).equals("Name"))) {
					c++;
					CTAStation[] temp = stationArray;
					stationArray = new CTAStation[c];
					for (int i = 0;i < temp.length;i++) {
						stationArray[i] = temp[i];
					}
					
					stationArray[c-1] = CTAStation.parseCTAStation(inputLine);
				}
			} catch (Exception e) {
				continue;
			}
	    }
		fileReader.close();
		
		String choice = "";
		
		while (!choice.equals("4")) {
			displayMenu();
			choice = input.nextLine();
			if (choice.equals("4")) {
				System.out.println();
				System.out.println("Program exited successfully.");
			} else if (choice.equals("3")) {
				System.out.print("\n" + displayNearest(stationArray));
				input.nextLine();
			} else if (choice.equals("2")) {
				displayByWheelchair(stationArray);
			} else if (choice.equals("1")) {
				System.out.println();
				displayStationNames(stationArray);
			} else {
				System.out.println("Invalid choice.");
			}
			System.out.println();
			System.out.println();
		}
    }
	
	private static void displayMenu() {
		
		System.out.println("Select an option from the menu:");
		System.out.println("1. Display all the Green Line Stations' names.");
		System.out.println("2. Display Green Line Station with/without wheelchair accessibility");
		System.out.println("3. Display the nearest Green Line Station");
		System.out.print("4. Exit program.\n\n>> ");
	}
	
	private static void displayStationNames(CTAStation[] array) {
		
		for (int k = 0;k < array.length;k++) {
			System.out.println(array[k].getName());
		}
	}
	
	private static void displayByWheelchair(CTAStation[] array) {
		System.out.println();
		System.out.print("Do you want wheelchair accessibility? (Y/N)\n>> ");
		String ans = input.nextLine();
		
		boolean flag = false;
		
		while (!(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("n"))) {
			System.out.println();
			System.out.println("Invalid answer.");
			System.out.println();
			System.out.print("Do you want wheelchair accessibility? (Y/N)\n>> ");
			ans = input.nextLine();
		}
		if (ans.equalsIgnoreCase("y")) {
			flag = true;
		} else if (ans.equalsIgnoreCase("n")) {
			flag = false;
		}
		System.out.println();
		boolean noStation = false;
		for (int k = 0;k < array.length;k++) {
			if ((array[k].isWheelchair() == flag)) {
				System.out.println(array[k].getName());
				noStation = true;
			}
		}
		if (!noStation) {
			System.out.println("No station found.");
		}
    }
	
	private static String displayNearest(CTAStation[] array) {
		System.out.println();
		GeoLocation location = new GeoLocation();
		System.out.print("Enter the latitude of the location: ");
		location.setLat(input.nextDouble());
		System.out.print("Enter the latitude of the location: ");
		location.setLng(input.nextDouble());
		String nearestStation = "";
		double min = Double.MAX_VALUE;
		for (int k = 0;k < array.length;k++) {
			
			
			double distance = array[k].calcDistance(location);
			if (distance < min) {
				min = distance;
				nearestStation = array[k].getName();	
			}
		}
		return nearestStation;
	}
}