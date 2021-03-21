package exams.second;

public class CylindricalBox extends Box {
	
	private double radius;
	private double height;
	
	
	public CylindricalBox(String name, double radius, double height) {
		super(name);
		this.radius = radius;
		this.height = height;
	}
	
	public CylindricalBox() {
		super(null);
		this.radius = 0;
		this.height = 0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public boolean equals(Box b) {
		if (this.getName() != b.getName()) {
			return false;
		} else if (this.getRadius() != ((CylindricalBox) b).getRadius()) {
			return false;
		} else if (this.getHeight() != ((CylindricalBox) b).getHeight()){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return this.getName() + ": " + "CylindricalBox [Height = " + height + ", Radius = " + radius + "]\n"
				+ "[Area = " + area() + ", Volume = " + volume() + "]";
	}

	@Override
	double area() {
		double r = this.getRadius();
		double h = this.getHeight();
		return ((2 * Math.PI * r)*(h + r));
	}

	@Override
	double volume() {
		double r = this.getRadius();
		double h = this.getHeight();
		return (Math.PI * Math.pow(r,2) * h);
	}
}
