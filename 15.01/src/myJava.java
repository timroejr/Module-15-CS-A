
public class myJava extends homework {
	private static int pages;
	private static String typeHomework; 
	myJava() {
		super();
	}
	
	public void createAssignment(int p) {
		typeHomework = "Java";
		pages = p;
	}
	
	public String toString() {
		String data = typeHomework + " - " + pages + " to read.";
		return data;
	}

}
