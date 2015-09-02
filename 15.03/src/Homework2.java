/**
 * 
 * @author timothyroejr
 * @version 2
 */
public abstract class Homework2 implements Processing {
	public static int pagesRead;
	public static String typeHomework;
	Homework2() {
		pagesRead = 0;
		typeHomework = "none";
	}
	
	public abstract void createAssignment(int p);
}
