package labs.lab5;

public class CTAStation extends GeoLocation {
	
	private String name;
	private String location;
	private boolean opened;
	private boolean wheelchair;
	
	public CTAStation(String name,double latitude, double longitude, String location, boolean wheelchair, boolean opened) {
		super();
		setName(name);
		setLocation(location);
		setOpened(opened);
		setWheelchair(wheelchair);
	}
	
	public CTAStation() {
		setName(null);
		setLocation(null);
		setOpened(false);
		setWheelchair(false);
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public boolean isOpened() {
		return opened;
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
	public void setOpened(boolean opened) {
		this.opened = opened;
	}
	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
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
		
		String string1 = "";
		String string2 = "";
		if (this.isWheelchair()) {
			string1 = "has";
		} else {
			string1 = "has no";
		}
		if (this.opened) {
			string2 = "is";
		} else {
			string2 = "is not";
		}
		
		return (this.name + " station is " + this.location
				+ ", and " + string1 + " wheelchair accessibility and " + string2 + " opened.");
	}
	
	public static CTAStation parseCTAStation(String s) {
		CTAStation station = new CTAStation();
		String[] stringArray = s.split(",",6);
		station.name = stringArray[0];
		station.setLat(Double.parseDouble(stringArray[1]));
		station.setLng(Double.parseDouble(stringArray[2]));
		station.location = stringArray[3];
		station.opened = Boolean.parseBoolean(stringArray[5]);
		station.wheelchair = Boolean.parseBoolean(stringArray[4]);
		
		return station; 
    }	
}