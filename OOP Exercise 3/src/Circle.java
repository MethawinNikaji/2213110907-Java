
public class Circle extends Shape {
	private double Radius;
	public Circle(double Radius,String color) {
		super(color);
		this.Radius = Radius;
	}
	public double GetRadius() {
		return this.Radius;
	}
	@Override
	public double getArea() {
		return Math.PI * (Radius * Radius);
	}
	@Override
	public String ToString() {
		return "Circle[radius=" + Radius + "]";
	}
	
}
