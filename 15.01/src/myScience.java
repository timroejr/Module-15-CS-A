
public class myScience extends homework{
	private static String typeHomework;
	private static int pages;
	myScience() {
		super();
	}
	public void createAssignment(int p) {
		typeHomework = "Science";
		pages = p;
	}
	
	public String toString() {
		String data = typeHomework + " - " + pages + " to read";
		return data;
	}
}
