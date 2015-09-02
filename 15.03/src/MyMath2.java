
public class MyMath2 extends Homework2 implements Processing {
	private static String typeHomework;
	private static int pages;
	MyMath2() {
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
	
	public void doReading() {
		pages = pages - 2;
	}

}
