
public class MyEnglish3 extends Homework3 implements Processing{
	public static int pages;
	public static String typeHomework;
	MyEnglish3() {
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
	
	public int getPages() {
		return pages;
	}
	
	public String getTypeHomework() {
		return typeHomework;
	}

	
}
