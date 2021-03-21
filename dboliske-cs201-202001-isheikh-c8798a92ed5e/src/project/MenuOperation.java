package project;
//8th May 2020, This class is responsible for data collection, and calling the necessary methods from other classes.

import java.util.Scanner;


public abstract class MenuOperation {
	
	public static void inputChoiceOne() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the station: ");
		String name = input.next();
		System.out.print("Enter station's latitude: ");
		double lat = input.nextDouble();
		System.out.print("Enter station's latitude: ");
		double lng = input.nextDouble();
		System.out.print("Enter station's location(: ");
		String location = input.next();
		System.out.print("Enter station's wheelchair accessibility(true/false): ");
		boolean flag = Boolean.parseBoolean(input.next());
		System.out.print("Position of station you want it to be located at the Red Line(-1 for no position): ");
		int redPosition = 33 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Green Line(-1 for no position): ");
		int greenPosition = 28 - (Integer.parseInt(input.next()));
		System.out.print("Position of station you want it to be located at the Blue Line(-1 for no position): ");
		int bluePosition = 33 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Brown Line(-1 for no position): ");
		int brownPosition = 27 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Purple Line(-1 for no position): ");
		int purplePosition = 27 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Pink Line(-1 for no position): ");
		int pinkPosition = 22 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Orange Line(-1 for no position): ");
		int orangePosition = 16 - Integer.parseInt(input.next());
		System.out.print("Position of station you want it to be located at the Yellow Line(-1 for no position): ");
		int yellowPosition = 3 - Integer.parseInt(input.next());
		CTAStation station1 = new CTAStation(name,lat,lng,location,flag,redPosition,greenPosition,bluePosition,brownPosition,purplePosition,pinkPosition,orangePosition,yellowPosition);
		if ((Main.redLine.lookupStation(station1.getName()) == null)) {
			if (station1.getRedPosition() < 34) {
				Main.redLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.redLine.getName() + ".");
		}
		if ((Main.greenLine.lookupStation(station1.getName()) == null)) {
			if (station1.getGreenPosition() < 29) {
				Main.greenLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.greenLine.getName() + ".");
		}
		if ((Main.blueLine.lookupStation(station1.getName()) == null)) {
			if (station1.getBluePosition() < 34) {
				Main.blueLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.blueLine.getName() + ".");
		}
		if ((Main.brownLine.lookupStation(station1.getName()) == null)) {
			if (station1.getBrownPosition() < 28) {
				Main.brownLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.brownLine.getName() + ".");
		}
		if ((Main.purpleLine.lookupStation(station1.getName()) == null)) {
			if (station1.getPurplePosition() < 28) {
				Main.purpleLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.purpleLine.getName() + ".");
		}
		if ((Main.pinkLine.lookupStation(station1.getName()) == null)) {
			if (station1.getPinkPosition() < 23) {
				Main.pinkLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.pinkLine.getName() + ".");
		}
		if ((Main.orangeLine.lookupStation(station1.getName()) == null)) {
			if (station1.getOrangePosition() < 17) {
				Main.orangeLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.brownLine.getName() + ".");
		}
		if ((Main.yellowLine.lookupStation(station1.getName()) == null)) {
			if (station1.getYellowPosition() < 4) {
				Main.yellowLine.addStation(station1);
			}
		} else {
			System.out.println("Station with name '" + name + "' already present in " + Main.yellowLine.getName() + ".");
		}
		input.close();
	}
	
	//3
	static void inputChoiceThree() {
		String name = "";
		Scanner in = new Scanner(System.in);
		System.out.print("\nChoose from the following: \n"
				+ "1. Red Line\n"
				+ "2. Green Line\n"
				+ "3. Blue Line\n"
				+ "4. Brown Line\n"
				+ "5. Purple Line\n"
				+ "6. Pink Line\n"
				+ "7. Orange Line\n"
				+ "8. Yellow Line\n>> ");
		int integer = in.nextInt();
		if (integer == 1) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.redLine.lookupStation(name) != null) {
				Main.redLine.removeCTAStation(name);
				System.out.println("'" + name + "'"+ " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 2) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.greenLine.lookupStation(name) != null) {
				Main.greenLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}if (integer == 3) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.blueLine.lookupStation(name) != null) {
				Main.blueLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 4) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.brownLine.lookupStation(name) != null) {
				Main.brownLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 5) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.purpleLine.lookupStation(name) != null) {
				Main.purpleLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 6) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.pinkLine.lookupStation(name) != null) {
				Main.pinkLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 7) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.orangeLine.lookupStation(name) != null) {
				Main.orangeLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 8) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.yellowLine.lookupStation(name) != null) {
				Main.yellowLine.removeCTAStation(name);
				System.out.println(name + " station removed successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		
		in.close();
	}
	
	public static void inputChoiceTwo() {
		String name = "";
		Scanner in = new Scanner(System.in);
		System.out.print("\nChoose from the following: \n"
				+ "1. Red Line\n"
				+ "2. Green Line\n"
				+ "3. Blue Line\n"
				+ "4. Brown Line\n"
				+ "5. Purple Line\n"
				+ "6. Pink Line\n"
				+ "7. Orange Line\n"
				+ "8. Yellow Line\n>> ");
		int integer = in.nextInt();
		if (integer == 1) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.redLine.lookupStation(name) != null) {
				Main.redLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 2) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.greenLine.lookupStation(name) != null) {
				Main.greenLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 3) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.blueLine.lookupStation(name) != null) {
				Main.blueLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 4) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.brownLine.lookupStation(name) != null) {
				Main.brownLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 5) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.purpleLine.lookupStation(name) != null) {
				Main.purpleLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 6) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.pinkLine.lookupStation(name) != null) {
				Main.pinkLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 7) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.orangeLine.lookupStation(name) != null) {
				Main.orangeLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		if (integer == 8) {
			System.out.print("\nEnter the name of the station: ");
			name = in.next();
			if (Main.yellowLine.lookupStation(name) != null) {
				Main.yellowLine.lookupStation(name).modifyCTAStation();
				System.out.println("Station updated successfully.");
			} else {
				System.out.println("'" + name + "'" + " not found.");
			}
		}
		in.close();
	}
	
	public static void inputChoiceFour() {
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter the name of station(s): ");
		String name = in.next();
		System.out.println();
		if (Main.redLine.lookupStation(name) != null) {
			System.out.println(Main.redLine.lookupStation(name).getName() + " found on " + Main.redLine.getName() + ".");
			flag = true;
		}
		if (Main.greenLine.lookupStation(name) != null) {
			System.out.println(Main.greenLine.lookupStation(name).getName() + " found on " + Main.greenLine.getName() + ".");
			flag = true;
		}
		if (Main.blueLine.lookupStation(name) != null) {
			System.out.println(Main.blueLine.lookupStation(name).getName() + " found on " + Main.blueLine.getName() + ".");
			if (name == "Harlem") {
				System.out.println(Main.blueLine.reverseSort().lookupStation(name).getName() + " found on " + Main.blueLine.getName() + "."); 
			}
			flag = true;
		}
		if (Main.brownLine.lookupStation(name) != null) {
			System.out.println(Main.brownLine.lookupStation(name).getName() + " found on " + Main.brownLine.getName() + ".");
			flag = true;
		}
		if (Main.purpleLine.lookupStation(name) != null) {
			System.out.println(Main.purpleLine.lookupStation(name).getName() + " found on " + Main.purpleLine.getName() + ".");
			flag = true;
		}
		if (Main.pinkLine.lookupStation(name) != null) {
			System.out.println(Main.pinkLine.lookupStation(name).getName() + " found on " + Main.pinkLine.getName() + ".");
			flag = true;
		}
		if (Main.orangeLine.lookupStation(name) != null) {
			System.out.println(Main.orangeLine.lookupStation(name).getName() + " found on " + Main.orangeLine.getName() + ".");
			flag = true;
		}
		if (Main.yellowLine.lookupStation(name) != null) {
			System.out.println(Main.yellowLine.lookupStation(name).getName() + " found on " + Main.yellowLine.getName() + ".");
			flag = true;
		}
		
		if (!flag) {
			System.out.println("No station in CTA has name '" + name + "'.");
		}
		in.close();
	}
	
	public static void inputChoiceFive() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the latitude of the location: ");
		double lat = in.nextDouble();
		System.out.print("Enter the longitude of the location: ");
		double lng = in.nextDouble();
		System.out.println("\n" + CTARoute.nearestStationInCTA(lat, lng).toString());
		in.close();
	}
	
	public static void inputChoiceSix() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nChoose from the following: \n"
				+ "1. Within Red Line\n"
				+ "2. Within Green Line\n"
				+ "3. Within Blue Line\n"
				+ "4. Within Brown Line\n"
				+ "5. Within Purple Line\n"
				+ "6. Within Pink Line\n"
				+ "7. Within Orange Line\n"
				+ "8. Within Yellow Line\n>> ");
		int num = Integer.parseInt(input.next());
		System.out.println("Enter the start station: ");
		String initialStation = input.next();
		System.out.println("Enter the destination station: ");
		String finalStation = input.next();
		String journeyString = "";
		
		if (num == 1) {
			if (Main.redLine.lookupStation(initialStation) != null) {
				int start = Main.redLine.getStops().indexOf(Main.redLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.redLine.lookupStation(finalStation) != null) {
					int finish = Main.redLine.getStops().indexOf(Main.redLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.redLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.redLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 2) {
			if (Main.greenLine.lookupStation(initialStation) != null) {
				int start = Main.greenLine.getStops().indexOf(Main.greenLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.greenLine.lookupStation(finalStation) != null) {
					int finish = Main.greenLine.getStops().indexOf(Main.greenLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.greenLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.greenLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 3) {
			if (Main.blueLine.lookupStation(initialStation) != null) {
				int start = Main.blueLine.getStops().indexOf(Main.blueLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.blueLine.lookupStation(finalStation) != null) {
					int finish = Main.blueLine.getStops().indexOf(Main.blueLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.blueLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.blueLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 4) {
			if (Main.brownLine.lookupStation(initialStation) != null) {
				int start = Main.brownLine.getStops().indexOf(Main.brownLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.brownLine.lookupStation(finalStation) != null) {
					int finish = Main.brownLine.getStops().indexOf(Main.brownLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.brownLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.brownLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 5) {
			if (Main.purpleLine.lookupStation(initialStation) != null) {
				int start = Main.purpleLine.getStops().indexOf(Main.purpleLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.purpleLine.lookupStation(finalStation) != null) {
					int finish = Main.purpleLine.getStops().indexOf(Main.purpleLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.purpleLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.purpleLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 6) {
			if (Main.pinkLine.lookupStation(initialStation) != null) {
				int start = Main.pinkLine.getStops().indexOf(Main.pinkLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.pinkLine.lookupStation(finalStation) != null) {
					int finish = Main.pinkLine.getStops().indexOf(Main.pinkLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.pinkLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.pinkLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 7) {
			if (Main.orangeLine.lookupStation(initialStation) != null) {
				int start = Main.orangeLine.getStops().indexOf(Main.orangeLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.orangeLine.lookupStation(finalStation) != null) {
					int finish = Main.orangeLine.getStops().indexOf(Main.orangeLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.orangeLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.orangeLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		if (num == 8) {
			if (Main.yellowLine.lookupStation(initialStation) != null) {
				int start = Main.yellowLine.getStops().indexOf(Main.yellowLine.lookupStation(initialStation));
				String journeyString1 = "";
				if (Main.yellowLine.lookupStation(finalStation) != null) {
					int finish = Main.yellowLine.getStops().indexOf(Main.yellowLine.lookupStation(finalStation));
					if (finish > start) {
						for (int i = start + 1;i < finish;i++) {
							journeyString1 += Main.yellowLine.getStops().get(i).getName() + " -> ";
						}
					}
					if (finish < start) {
						for (int j = finish + 1;j < start;j++) {
							journeyString1 += Main.yellowLine.getStops().get(j).getName() + " -> "; 
						}
					}
					journeyString = initialStation + " -> "+ journeyString1 +  finalStation;
					System.out.println(journeyString);
				}
			}
		}
		input.close();
	}
}
