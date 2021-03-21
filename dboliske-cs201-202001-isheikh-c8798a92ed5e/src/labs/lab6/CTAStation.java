package labs.lab6;

public class CTAStation extends GeoLocation {
	
	private String name;
	private String location;
	private boolean opened;
	private boolean wheelchair;
	private int redPosition;
	private int greenPosition;
	
	public CTAStation(String name,double latitude, double longitude, String location, boolean wheelchair,int redPosition,int greenPosition) {
		super();
		setName(name);
		setLat(latitude);
		setLng(longitude);
		setLocation(location);
		setWheelchair(wheelchair);
		setRedPosition(redPosition);
		setGreenPosition(greenPosition);
		
		
	}
	
	public CTAStation() {
		setName(null);
		setLocation(null);
		setWheelchair(false);
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public boolean isWheelchair() {
		return wheelchair;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public int getGreenPosition() {
		return greenPosition;
	}

	public void setGreenPosition(int greenPosition) {
		this.greenPosition = greenPosition;
	}

	public boolean equals(CTAStation station) {
		if (this.name != station.name) {
			return false;
		} else if (this.location != station.location) {
				return false;
			} else if (this.opened != station.opened) {
				return false;
			} else if (this.wheelchair != station.wheelchair) {
				return false;
		    } else {
		    	return true;
		    }
	}
	
	public String toString() {
		String s3 = "";
		if (this.redPosition == -1) {
			s3 = "Green Line";
		} else if ((this.greenPosition == -1)) {
			s3 = "Red Line";
		} else if (this.redPosition >= 0 & this.greenPosition >= 0) {
			s3 = "Red Line,Green Line";
		}
		String string1 = "";
		if (this.isWheelchair()) {
			string1 = "has";
		} else {
			string1 = "has no";
		}
		return ("Name: " + this.name + "\nRoute: " + s3 + "\n(Latitude,Longitude): " + "(" +this.getLat() + "," + this.getLng() + ")" + 
				"\nLocation: " + this.location + "\n" + string1 + " wheelchair accessibility.\n");
	}
	
	public static CTAStation parseCTAStation(String s) {
		CTAStation station = new CTAStation();
		String[] stringArray = s.split(",",7);
		station.name = stringArray[0];
		station.setLat(Double.parseDouble(stringArray[1]));
		station.setLng(Double.parseDouble(stringArray[2]));
		station.location = stringArray[3];
		station.wheelchair = Boolean.parseBoolean(stringArray[4]);
		station.setRedPosition(Integer.parseInt(stringArray[5]));
		station.setGreenPosition(Integer.parseInt(stringArray[6]));
		return station;
    }	
}