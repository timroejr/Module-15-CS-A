
public abstract class Vehicle implements Product{
	private String name;
	private double cost;
	Vehicle(String n, double c) {
		name = n;
		cost = c;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCost() {
		return cost;
	}
}
