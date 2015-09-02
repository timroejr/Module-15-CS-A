
public abstract class homework {
	
	public static int pagesRead;
	public static String typeHomework;
	homework () {
		pagesRead = 0;
		typeHomework = "none";
	}
	
	public abstract void createAssignment(int p);

}
