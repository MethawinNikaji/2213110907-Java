
public  abstract class Shape {
	
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public Shape() {

	}

	public abstract double getArea();

	@Override
	public String toString() {
		return "color=" + color;
	}

	public double GetVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String ToString() {
		// TODO Auto-generated method stub
		return null;
	}
}
