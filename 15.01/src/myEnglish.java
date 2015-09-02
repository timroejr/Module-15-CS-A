
public class myEnglish extends homework {
	private static int pages;
	private static String typeHomework;
	myEnglish() {
		super();
	}
	public void createAssignment(int p) {
		typeHomework = "English";
		pages = p;
	}
	
	public String toString() {
		String data = typeHomework + " - " + pages + " to read.";
		return data;
	}
}
