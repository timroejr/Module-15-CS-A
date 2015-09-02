
public class MyMath3 extends Homework3 implements Processing{
	public static String typeHomework;
	public static int pages;
	MyMath3() {
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
	
	public int getPages() {
		return pages;
	}
	
	public String getTypeHomework() {
		return typeHomework;
	}

}
