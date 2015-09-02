
public class MyScience3 extends Homework3 implements Processing{
	public static String typeHomework;
	public static int pages;
	MyScience3() {
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
	
	public void doReading() {
		pages = pages - 3;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String getTypeHomework() {
		return typeHomework;
	}
	
}
