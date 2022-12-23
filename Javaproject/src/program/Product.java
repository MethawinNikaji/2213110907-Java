package program;

public class Product {
	private String id;
	private int unit;
	private double price;
	public void setId(String ID) {
		id = ID;
	}
	public String getId() {
		return id;
	}
	public void Setunit(int Unit) {
		unit = Unit;
	}
	public int Getunit() {
		return unit;
	}
	public void Setprice(double Price) {
		price = Price;
	}
	public double getPrice() {
		return price;
	}
	public double Calculate(){
		return unit*price;
		
	}

}
