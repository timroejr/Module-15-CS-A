
public class MyEnglish2 extends Homework2 implements Processing {
	private static int pages;
	private static String typeHomework;
	MyEnglish2() {
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
	
	public void doReading() {
		pages = pages - 1;
	}
}
