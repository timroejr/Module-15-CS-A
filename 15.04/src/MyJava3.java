
public class MyJava3 extends Homework3 implements Processing{
	public static int pages;
	public static String typeHomework;
	MyJava3() {
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
	
	public int getPages() {
		return pages;
	}
	
	public String getTypeHomework() {
		return typeHomework;
	}

}
