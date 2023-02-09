
public class Cylinder extends Circle {
	private double Height;
	public Cylinder(double radius,double Height ){
		super(radius, null);
		this.Height = Height;
	}
	public double GetHeight() {
		return this.Height;
	}
	@Override
	public double GetVolume() {
		return super.getArea() * Height;
	}
	@Override
	public double getArea() {
		return Math.PI * (Height + super.GetRadius());
	}
	@Override
	public String toString() {
		return "Cylinder[height=" + Height + ",radius=" + GetRadius() + "]";
		
	}
	
	
	
	}


	
	


