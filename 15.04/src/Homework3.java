
public abstract class Homework3 implements Comparable<Homework3>, Processing {
	public int pagesRead;
	public String typeHomework;
	Homework3() {
		pagesRead = 0;
		typeHomework = "none";
	}
	
	public abstract void createAssignment(int p);
	public abstract int getPages();
	public abstract String getTypeHomework();
	
	public int compareTo(Homework3 obj) {
		if (pagesRead > obj.pagesRead) {
			return 1;
		} else if (pagesRead == obj.pagesRead) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public int compareTo(int n1, int n2) {
		if (n1 == n2) {
			return 0;
		} else if (n2 > n1) {
			return 1;
		} else {
			return -1;
		}
	}
}
