package exams.first;

public class Circle {
	
	private double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle() {
		
		this.radius = 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}

	public String toString() {
		return ("Circle with a radius of " + radius);
	}

	public boolean equals(Circle c) {
		
		if (this.radius != c.radius) {
			return false;
		} else {
			return true;
		}
	}
	
	public double area() {
		return (Math.PI * this.radius * this.radius);
	}
	
	public double circumference() {
		return (2 * Math.PI * this.radius); 
	}

}
