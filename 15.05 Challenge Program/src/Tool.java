
public class Tool implements Product, Comparable<Tool> {
	private String name;
	private double cost;
	Tool(String n, double c) {
		name = n;
		cost = c;
	}
	
	public int compareTo(Tool obj) {
		if (cost == obj.cost) {
			return 0;
		} if (cost < obj.cost) {
			return 1;
		} else {
			return -1;
		}
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}
	
	public String getType() {
		return "Tool";
	}

}
