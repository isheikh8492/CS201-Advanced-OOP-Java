package exams.second;

public class RectangularBox extends Box {
	
	private double height;
	private double width;
	private double depth;
	
	
	public RectangularBox(String name, double height, double width, double depth) {
		super(name);
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public RectangularBox() {
		super(null);
		this.height = 0;
		this.width = 0;
		this.depth = 0;
	}

	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getDepth() {
		return this.depth;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	boolean equals(Box b) {
		if (this.getName() != b.getName()) {
			return false;
		} else if (this.getHeight() != ((RectangularBox) b).getHeight()) {
			return false;
		} else if (this.getWidth() != ((RectangularBox) b).getWidth()){
			return false;
		} else if (this.getDepth() != ((RectangularBox) b).getDepth()){
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		return this.getName() + ": " + "RectangularBox [Height = " + height + ", Width = " + width + ", Depth = " + depth + "]\n"
				+ "[Area = " + area() + ", Volume = " + volume() + "]"; 
	}

	@Override
	double area() {
		double h = this.getHeight();
		double w = this.getWidth();
		double d = this.getDepth();
		return (2 * ((h*w)+(w*d)+(h*d)));
	}

	@Override
	double volume() {
		double h = this.getHeight();
		double w = this.getWidth();
		double d = this.getDepth();
		return (h * w * d);
	}
	
	
}
