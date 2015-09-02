import java.util.*;
public class InventoryDemo {
	public static List<Product> products = new ArrayList<Product>();
	public static void addInventory() {
		Car car1 = new Car("Jaguar", 100000.00);
		Car car2 = new Car("Neon", 17000.00);
		Tool tool1 = new Tool("Jig Saw", 149.18);
		Car car3 = new Car("Jaguar", 110000.00);
		Car car4 = new Car("Neon", 17500.00);
		Car car5 = new Car("Neon", 17875.32);
		Truck truck1 = new Truck("RAM", 35700.00);
		Tool tool2 = new Tool("Circular Saw", 200.00);
		Tool tool3 = new Tool("Circular Saw", 150.00);
		products.add(car1);
		products.add(car2);
		products.add(car3);
		products.add(car4);
		products.add(car5);
		products.add(truck1);
		products.add(tool1);
		products.add(tool2);
		products.add(tool3);
	}

	public static void takeInventory(String productName) {
		int itemCount = 0;
		double totalCost = 0;
		List <Tool> tools = new ArrayList<Tool>();
		for (Product pr : products) {
			//System.out.println(pr.getName()); DEBUG PURPOSES ONLY
			if (pr.getName().equalsIgnoreCase(productName)) {
				itemCount++;
				totalCost = totalCost + pr.getCost();
			}
			if (pr.getType().equals("Tool")) {
				//System.out.println(pr); DEBUG PURPOSES ONLY
				tools.add((Tool) pr);
			}
		}
		System.out.println(productName + ": Quantity: " + itemCount + ", Total Cost: " + totalCost);
		if (tools.size() > 0) {
			for (int h = 0; h < tools.size(); h++) {
				Tool tool = tools.get(h);
				if (!tool.getName().equals(productName)) {
					tools.remove(h);
				}
			}
			int index1 = 0;
			int index2 = 0;
			for (int i = 0; i < tools.size(); i++) {
				for (int j = 0; j < tools.size(); j++) {
					Tool tool1 = tools.get(index1);
					Tool tool2 = tools.get(index2);
					int compareResult = tool1.compareTo(tool2);
					double tool1Cost = tool1.getCost();
					double tool2Cost = tool2.getCost();
					if (!(tool1Cost == tool2Cost)) {
						if (compareResult == 1) {
							System.out.println("The second tool is more expensive");
						}
					}
					index2++;
				}
				index2 = 0;
				index1++;
			}
		}
	}

	public static void main(String [] args) {
		addInventory();
		Scanner in = new Scanner(System.in);
		System.out.print("Item Name: ");
		takeInventory(in.nextLine());
	}
}
