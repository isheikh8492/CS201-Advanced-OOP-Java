package labs.lab6;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class CTAStopApp extends GeoLocation  {

	static Scanner input = new Scanner(System.in);
	static Scanner smallChoice = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		File stationList = new File("src/labs/lab6/CTAStops.csv");
		Scanner fileReader = new Scanner(stationList);
		
		CTARoute greenLine = new CTARoute("Green Line");
		CTARoute redLine = new CTARoute("Red Line");
		
		
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
					if (stationArray[c-1].getRedPosition() >= 0) {
						redLine.addStation(stationArray[c-1]);
					}
					if (stationArray[c-1].getGreenPosition() != -1) {
						greenLine.addStation(stationArray[c-1].getGreenPosition(),stationArray[c-1]);
					}
				}
			} catch (Exception e) {
				e.getMessage();
			}
	    }
		fileReader.close();
		
		arrangeStations(redLine,greenLine);
		
		String choice = "";
		
		while (!choice.equals("8")) {
			displayMenu();
			choice = input.next();
			if (choice.equals("8")) {
				System.out.println();
				System.out.println("Program exited successfully.");
			} else if (choice.equals("2")) {
				System.out.print("Which route(s) do you intend to view?\n1. Red Line\n2. Green Line \n3. Both\n>> ");
				int c2 = input.nextInt();
				switch (c2) {
				case 1:
					displayByWheelchair(redLine);
					break;
				case 2:
					displayByWheelchair(greenLine);
					break;
				case 3:
					displayByWheelchair(redLine);
					System.out.println();
					displayByWheelchair(greenLine);
				}
			} else if (choice.equals("3")) {
				System.out.print("Which route(s) do you intend to view?\n1. Red Line\n2. Green Line \n3. Both\n>> ");
				int c3 = input.nextInt();
				switch (c3) {
				case 1:
					System.out.print("Enter the latitude of the location: ");
					double latitude = input.nextDouble();
					System.out.print("Enter the latitude of the location: ");
					double longitude = input.nextDouble();
					System.out.print("Red Line: ");
					System.out.println(displayNearest(redLine,latitude,longitude));
					break;
				case 2:
					System.out.print("Enter the latitude of the location: ");
					latitude = input.nextDouble();
					System.out.print("Enter the latitude of the location: ");
					longitude = input.nextDouble();
					System.out.print("Green Line: ");
					System.out.println(displayNearest(greenLine,latitude,longitude));
					break;
				case 3:
					System.out.print("Enter the latitude of the location: ");
					latitude = input.nextDouble();
					System.out.print("Enter the latitude of the location: ");
					longitude = input.nextDouble();
					System.out.print("Red Line: ");
					System.out.println(displayNearest(redLine,latitude,longitude) + "\n");
					System.out.print("Green Line: ");
					System.out.println(displayNearest(greenLine,latitude,longitude));
				}
				input.nextLine();
			
			} else if (choice.equals("1")) {
				System.out.print("Which route(s) do you intend to view?\n1. Red Line\n2. Green Line \n3. Both\n>> ");
				int c1 = input.nextInt();
				switch (c1) {
				case 1:
					displayStationNames(redLine);
					break;
				case 2:
					displayStationNames(greenLine);
					break;
				case 3:
					System.out.println("Red Line: ");
					displayStationNames(redLine);
					System.out.println();
					System.out.println("Green Line: ");
					displayStationNames(greenLine);
				}
			} else if (choice.equals("4")) {
				System.out.print("Which route(s) do you intend to view?\n1. Red Line\n2. Green Line\n>> ");
				int c4 = Integer.parseInt(input.next());
				if (c4 == 1) {
					System.out.print("Search by name: ");        //COnservatory-central park drive not searchable
					System.out.println(redLine.lookupStation(smallChoice.nextLine()).toString());
				} else if (c4 == 2) {
					System.out.print("Search by name: ");
					try {
						System.out.println(greenLine.lookupStation(smallChoice.nextLine()).toString());
					} catch (Exception e) {
						e.getMessage();
						System.out.println("No station found.");
					}
				} else {
					System.out.print("Invalid choice.");
				}
			} else if (choice.equals("5")) {
				System.out.print("Red Line: \n");
				for (int i = 0;i < redLine.getStops().size();i++) {
					System.out.println(redLine.getStops().get(i).toString());
				}
				System.out.print("Green Line: \n");
				for (int i = 0;i < greenLine.getStops().size();i++) {
					System.out.println(greenLine.getStops().get(i).toString());
				}
			} else if (choice.equals("6")) {
				System.out.print("Which route(s) do you intend to change?\n1. Red Line\n2. Green Line\n>> ");
				int c6 = Integer.parseInt(input.next());
				
					System.out.print("Enter the previous station's name: ");
					String previous = input.next();
					System.out.println("Enter the following station's name: ");
					String following = input.next();
					if (c6 == 1) {
						addCTAStation(redLine,previous,following);
					} else if (c6 == 2) {
					addCTAStation(greenLine,previous,following);
					} else {
						System.out.println("Invalid entry.");
				}
			} else if (choice.equals("7")) {
				System.out.print("Which route(s) do you intend to change?\n1. Red Line\n2. Green Line\n>> ");
				int c7 = Integer.parseInt(input.next());
				if (c7 == 1) {
					System.out.print("Enter the name of station to remove: ");
					String text = smallChoice.next();
					try {
						if (redLine.lookupStation(text) != null) {
							redLine.removeStation(redLine.lookupStation(text));
							System.out.println("Route updated successfully.");
						}
					} catch (Exception e) {
						e.getMessage();
						System.out.println("Station not found.");
					}
				} else if (c7 == 2) {
					System.out.print("Enter the name of station to remove: ");
					String text = smallChoice.next();
					try {
						if (greenLine.lookupStation(text) != null) {
							greenLine.removeStation(greenLine.lookupStation(text));
							System.out.println("Route updated successfully.");
						}
					} catch (Exception e) {
						e.getMessage();
						System.out.println("Station not found.");
					}
				}
			}
			System.out.println();
			System.out.println();
		}
    }
	
	private static void displayMenu() {
		System.out.println("Select an option from the menu:");
		System.out.println("1. Display the Red and/or Green Line Stations' names.");
		System.out.println("2. Display Red and/or Green Line Stations' names with/without wheelchair accessibility.");
		System.out.println("3. Display the nearest Red and/or Green Line Stations.");
		System.out.println("4. Display information for a Red or Green Line Station with a specific name.");
		System.out.println("5. Display information of all Red & Green Line Stations.");
		System.out.println("6. Add a new Red or Green Line Station.");
		System.out.println("7. Delete an existing Red or Green Line Station.");
		System.out.print("8. Exit program.\n\n>> ");
	}
	
	private static void displayStationNames(CTARoute route) {
		for (int k = 0;k < route.getStops().size();k++) {
			System.out.println(route.getStops().get(k).getName());
		}
	}
	
	private static void displayByWheelchair(CTARoute route) {
		System.out.println(route.getName() + ": ");
		System.out.print("Do you want wheelchair accessibility? (Y/N)\n>> ");
		String ans = input.next();
		
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
		for (int k = 0;k < route.getStops().size();k++) {
			if (route.getStops().get(k).isWheelchair() == flag) {
				System.out.println(route.getStops().get(k).getName());
				noStation = true;
			}
		}
		if (!noStation) {
			System.out.println("No station found.");
		}
    }
	
	private static String displayNearest(CTARoute route,double lat,double lng) {
		return route.nearestStation(lat,lng).getName();
	}
	
	private static void arrangeStations(CTARoute redLine,CTARoute greenLine) {
		for (int i = 0;i < redLine.getStops().size() - 1;i++) {
			for (int j = i + 1;j < redLine.getStops().size();j++) {
				if (redLine.getStops().get(i).getRedPosition() > redLine.getStops().get(j).getRedPosition()) {
					CTAStation temp = redLine.getStops().get(j);
					redLine.getStops().set(j, redLine.getStops().get(i));
					redLine.getStops().set(i, temp);	
				}
			}
		}
		for (int i = 0;i < greenLine.getStops().size() - 1;i++) {
			for (int j = i + 1;j < greenLine.getStops().size();j++) {
				if (greenLine.getStops().get(i).getGreenPosition() > greenLine.getStops().get(j).getGreenPosition()) {
					CTAStation temp = greenLine.getStops().get(j);
					greenLine.getStops().set(j, greenLine.getStops().get(i));
					greenLine.getStops().set(i, temp);	
				}
			}
		}
	}
	
	public static void addCTAStation(CTARoute route,String previous,String following) {
		if (route.lookupStation(previous) != null) {
			int position1 = route.getStops().indexOf(route.lookupStation(previous));
			int position2 = route.getStops().indexOf(route.lookupStation(following));
			if (position2 == position1 + 1) {
				CTAStation station = new CTAStation();
				System.out.print("Enter the station name: ");
				station.setName(input.next());
				System.out.print("Enter station's latitude: ");
				station.setLat(Double.parseDouble(input.next()));
				System.out.print("Enter station's latitude: ");
				station.setLng(Double.parseDouble(input.next()));
				System.out.print("Enter station's location: ");
				station.setLocation(input.next());
				System.out.print("Enter station's wheelchair accessibility: ");
				station.setWheelchair(Boolean.parseBoolean(input.next()));
				if (route.getName().equalsIgnoreCase("red line")) {
					route.getStops().get(position1).setGreenPosition(-1);
					route.getStops().get(position1).setRedPosition(position2);
				} else if (route.getName().equalsIgnoreCase("green line")) {
					route.getStops().get(position1).setRedPosition(-1);
					route.getStops().get(position1).setGreenPosition(position2);
				}
				route.insertStation(position2,station);
				System.out.println("Route updated successfully.");
			} else {
				System.out.println("Invalid Entry.");
			}
		}
	}
}

