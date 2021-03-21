package project;

// 8th May 2020, This class is responsible for converting data in to a CTAStation type, as well as parsing input String into the CTAStation data type.

import java.util.Scanner;

public class CTAStation extends GeoLocation {
	
	private String name;
	private String location;
	private boolean wheelchair;
	private int redPosition;
	private int greenPosition;
	private int bluePosition;
	private int brownPosition;
	private int purplePosition;
	private int pinkPosition;
	private int orangePosition;
	private int yellowPosition;
	
	public CTAStation(String name,double latitude, double longitude, String location, boolean wheelchair, int redPosition,
			int greenPosition, int bluePosition, int brownPosition, int purplePosition, int pinkPosition,
			int orangePosition, int yellowPosition) {
		super();
		setName(name);
		setLat(latitude);
		setLng(longitude);
		setLocation(location);
		setWheelchair(wheelchair);
		setRedPosition(redPosition);
		setGreenPosition(greenPosition);
		setBluePosition(bluePosition);
		setBrownPosition(brownPosition);
		setPurplePosition(purplePosition);
		setPinkPosition(pinkPosition);
		setOrangePosition(orangePosition);
		setYellowPosition(yellowPosition);
	}
	
	

	@SuppressWarnings("null")
	public CTAStation() {
		super();
		setName(null);
		setLat(-1);
		setLng(-1);
		setLocation(null);
		setWheelchair(false);
		setRedPosition(-1);
		setGreenPosition(-1);
		setBluePosition(-1);
		setBrownPosition(-1);
		setPurplePosition(-1);
		setPinkPosition(-1);
		setOrangePosition(-1);
		setYellowPosition(-1);
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isWheelchair() {
		return wheelchair;
	}
	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
	}
	public int getRedPosition() {
		return redPosition;
	}
	public void setRedPosition(int redPosition) {
		this.redPosition = redPosition;
	}
	public int getBluePosition() {
		return bluePosition;
	}
	public void setBluePosition(int bluePosition) {
		this.bluePosition = bluePosition;
	}
	public int getBrownPosition() {
		return brownPosition;
	}
	public void setBrownPosition(int brownPosition) {
		this.brownPosition = brownPosition;
	}
	public int getPurplePosition() {
		return purplePosition;
	}
	public void setPurplePosition(int purplePosition) {
		this.purplePosition = purplePosition;
	}
	public int getPinkPosition() {
		return pinkPosition;
	}
	public void setPinkPosition(int pinkPosition) {
		this.pinkPosition = pinkPosition;
	}
	public int getOrangePosition() {
		return orangePosition;
	}
	public void setOrangePosition(int orangePosition) {
		this.orangePosition = orangePosition;
	}
	public int getYellowPosition() {
		return yellowPosition;
	}
	public void setYellowPosition(int yellowPosition) {
		this.yellowPosition = yellowPosition;
	}
	public int getGreenPosition() {
		return greenPosition;
	}
	public void setGreenPosition(int greenPosition) {
		this.greenPosition = greenPosition;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CTAStation other = (CTAStation) obj;
		if (bluePosition != other.bluePosition)
			return false;
		if (brownPosition != other.brownPosition)
			return false;
		if (greenPosition != other.greenPosition)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orangePosition != other.orangePosition)
			return false;
		if (pinkPosition != other.pinkPosition)
			return false;
		if (purplePosition != other.purplePosition)
			return false;
		if (redPosition != other.redPosition)
			return false;
		if (wheelchair != other.wheelchair)
			return false;
		if (yellowPosition != other.yellowPosition)
			return false;
		return true;
	}



	public String toString() {
		String s3 = "";
		if (this.redPosition != -1) {
			s3 += "Red Line     "; 
		}
		if (this.greenPosition != -1) {
			s3 += "Green Line     "; 
		}
		if (this.bluePosition != -1) {
			s3 += "Blue Line     "; 
		}
		if (this.brownPosition != -1) {
			s3 += "Brown Line     "; 
		}
		if (this.purplePosition != -1) {
			s3 += "Purple Line     "; 
		}
		if (this.pinkPosition != -1) {
			s3 += "Pink Line     "; 
		}
		if (this.orangePosition != -1) {
			s3 += "Orange Line     "; 
		}
		if (this.yellowPosition != -1) {
			s3 += "Yellow Line     "; 
		}
		String string1 = "";
		if (this.isWheelchair()) {
			string1 = "has";
		} else {
			string1 = "has no";
		}
		return ("Name:" + this.name + "\nRoute: " + s3 + "\n(Latitude,Longitude): " + "(" +this.getLat() + "," + this.getLng() + ")" + 
				"\nLocation: " + this.location + "\n" + string1 + " wheelchair accessibility.\n");
	}
	
	public static CTAStation parseCTAStation(String s) {
		CTAStation station = new CTAStation();
		String[] stringArray = s.split(",",13);
		station.name = stringArray[0];
		station.setLat(Double.parseDouble(stringArray[1]));
		station.setLng(Double.parseDouble(stringArray[2]));
		station.location = stringArray[3];
		station.wheelchair = Boolean.parseBoolean(stringArray[4]);
		station.setRedPosition(Integer.parseInt(stringArray[5]));
		station.setGreenPosition(Integer.parseInt(stringArray[6]));
		station.setBluePosition(Integer.parseInt(stringArray[7]));
		station.setBrownPosition(Integer.parseInt(stringArray[8]));
		station.setPurplePosition(Integer.parseInt(stringArray[9]));
		station.setPinkPosition(Integer.parseInt(stringArray[10]));
		station.setOrangePosition(Integer.parseInt(stringArray[11]));
		station.setYellowPosition(Integer.parseInt(stringArray[12]));
		return station;
    }
	
	public void modifyCTAStation() {
		System.out.print("Choose the property you want to modify:\n"
				+ "1. Name\n"
				+ "2. Location\n"
				+ "3. Wheelchair Accessibility\n"
				+ ">> ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Enter station's new name: ");
			this.setName(input.next());
		}
		if (choice == 2) {
			System.out.println("Enter station's new location: ");
			this.setLocation(input.next());
		}
		if (choice == 3) {
			System.out.println("Enter station's updated wheelchair accessibility: ");
			this.setWheelchair(Boolean.getBoolean(input.next()));
			
		}
		input.close();
	}
	
	
}

