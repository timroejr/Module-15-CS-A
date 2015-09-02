
public class myMath extends homework {
	private static String typeHomework;
	private static int pages;
	myMath() {
		super();
	}
	public void createAssignment(int p) {
		typeHomework = "Math";
		pages = p;
	}
	
	public String toString() {
		String data = typeHomework + " - " + pages + " to read.";
		return data;
	}
}
