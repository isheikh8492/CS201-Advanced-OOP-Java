package exams.second;

public abstract class Box {
	
	private String name;
	
	public Box(String name) {
		super();
		this.name = name;
	}
	
	public Box() {
		this.name = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String toString();

	abstract boolean equals(Box box);

	abstract double area();
	abstract double volume();
}
