package project;
//6th May 2020, 
//This class is responsible for storing all the methods related to 
//updating the CTA Routes, as well as store the CTAStations data type
//into different routes.

import java.util.ArrayList;

public class CTARoute extends CTAStation{
	
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
	
	public void removeCTAStation(String name) {
		CTAStation itemToRemove = this.lookupStation(name);
		if (!(itemToRemove.equals(null))) {
			this.stops.remove(itemToRemove);
			System.out.println(name + " found on " + this.getName() + ".");
		}
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
		for (int i = 0;i < this.getStops().size();i++) {
			lineString += (i) +". " + this.stops.get(i).getName() + "\n";
		}
		return lineString;
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
	
	public void sort() {
		for (int i = 1;i < this.getStops().size() ;i++) {
            int k = i;
            if (this.getName().equalsIgnoreCase("Red Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getRedPosition() < (this.getStops().get(k).getRedPosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Green Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getGreenPosition() < (this.getStops().get(k).getGreenPosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Blue Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getBluePosition() < (this.getStops().get(k).getBluePosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Brown Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getBrownPosition() < (this.getStops().get(k).getBrownPosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Purple Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getPurplePosition() < (this.getStops().get(k).getPurplePosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Pink Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getPinkPosition() < (this.getStops().get(k).getPinkPosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Orange Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getOrangePosition() < (this.getStops().get(k).getOrangePosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
            if (this.getName().equalsIgnoreCase("Yellow Line")) {
            	while (((k > 0) && (this.getStops().get(k - 1).getYellowPosition() < (this.getStops().get(k).getYellowPosition())))) {
                    CTAStation temp = this.getStops().get(k);
                    this.getStops().set(k, this.getStops().get(k - 1));
                    this.getStops().set(k - 1,temp);
                    k--;
                }
            }
        }
	}
	
	public static CTAStation nearestStationInCTA(double lat,double lng) {
		double min = Double.MAX_VALUE;
		CTAStation minStation = new CTAStation();
		
		for (int i = 0;i < Main.redLine.getStops().size();i++) {
			if (Main.redLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.redLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.redLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.greenLine.getStops().size();i++) {
			if (Main.greenLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.greenLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.greenLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.blueLine.getStops().size();i++) {
			if (Main.blueLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.blueLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.blueLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.brownLine.getStops().size();i++) {
			if (Main.brownLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.brownLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.brownLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.purpleLine.getStops().size();i++) {
			if (Main.purpleLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.purpleLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.purpleLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.pinkLine.getStops().size();i++) {
			if (Main.pinkLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.pinkLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.pinkLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.orangeLine.getStops().size();i++) {
			if (Main.orangeLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.orangeLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.orangeLine.getStops().get(i);
			}
		}
		for (int i = 0;i < Main.yellowLine.getStops().size();i++) {
			if (Main.yellowLine.getStops().get(i).calcDistance(lat, lng) < min) {
				min = Main.yellowLine.getStops().get(i).calcDistance(lat, lng);
				minStation = Main.yellowLine.getStops().get(i);
			}
		}
		return minStation;
	}
	
	public CTARoute reverseSort() {
		CTARoute reverseBlueLine = new CTARoute("Blue Line");
		reverseBlueLine.stops = this.stops;
		for (int i = 1;i < reverseBlueLine.getStops().size() ;i++) {
            int k = i;
            if (reverseBlueLine.getName().equalsIgnoreCase("Blue Line")) {
            	while (((k > 0) && (reverseBlueLine.getStops().get(k - 1).getBluePosition() > (reverseBlueLine.getStops().get(k).getBluePosition())))) {
                    CTAStation temp = reverseBlueLine.getStops().get(k);
                    reverseBlueLine.getStops().set(k, reverseBlueLine.getStops().get(k - 1));
                    reverseBlueLine.getStops().set(k - 1,temp);
                    k--;
                }
            }
		}
		return reverseBlueLine;
	}
		
}