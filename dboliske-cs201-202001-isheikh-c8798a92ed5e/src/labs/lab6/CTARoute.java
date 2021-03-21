package labs.lab6;

import java.util.ArrayList;

public class CTARoute {
	
	private String name;
	private ArrayList<CTAStation> stops;
	
	public CTARoute(String name) {
		this.name = name;
		this.stops = new ArrayList<CTAStation>();
	}
	
	
	public void addStation(CTAStation station) {
		this.stops.add(station);
	}
	
	public void addStation(int position,CTAStation station) {
		this.stops.add(position, station);
	}
	
	public void removeStation(CTAStation station) {
		this.stops.remove(station);
	}
	
	public void removeStation(int position) {
		this.stops.remove(position);
	}
	
	public void insertStation(int position,CTAStation station) {
		this.stops.add(position, station);
	}
	
	public CTAStation lookupStation(String name) {
		for (int i = 0;i < stops.size();i++) {
			if ((this.stops.get(i).getName()).equalsIgnoreCase(name)) {
				return stops.get(i);
			}
		}
		return null;
	}
	
	public CTAStation nearestStation(double latitude,double longitude) {
		CTAStation nearest = new CTAStation();
		double min = Double.MAX_VALUE;
		for (int i = 0;i < stops.size();i++) {
			double distance = (Math.sqrt(Math.pow(this.stops.get(i).getLat()-latitude,2)+Math.pow(this.stops.get(i).getLng()-longitude,2)));
			if (distance < min) {
				 nearest = this.stops.get(i);
			}
		}
		return nearest;
	}
	
	public CTAStation nearestStation(GeoLocation g) {
		return nearestStation(g.getLat(),g.getLng());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CTAStation> getStops() {
		return stops;
	}

	public void setStops(ArrayList<CTAStation> stops) {
		this.stops = stops;
	}
	
	public String toString() {
		String lineString = "";
		String arrayString = "";
		for (int i = 0;i < this.stops.size();i++) {
			lineString = this.stops.get(i).toString();
			arrayString = lineString + "\n";
		}
		return arrayString;
	}
	
	public boolean equals(CTARoute x) {
		if (x.stops.size() != this.stops.size()) {
			return false;
		} else {
			for (int i = 0;i < x.stops.size();i++) {
				if (!(x.stops.get(i).equals(this.stops.get(i)))) {
					return false;
				}
			}
		} 
		return true;
	}
}