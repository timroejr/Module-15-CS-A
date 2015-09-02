
public class MyJava2 extends Homework2 implements Processing {
	private static int pages;
	private static String typeHomework;
	MyJava2() {
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
	
	public void doReading() {
		pages = pages - 4;
	}
}
