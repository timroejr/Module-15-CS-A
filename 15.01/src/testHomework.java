import java.util.ArrayList;
public class testHomework {
	private static ArrayList<homework> assignments = new ArrayList<homework>();
	public static void addAssignments() {
		myMath math = new myMath();
		math.createAssignment(4);
		myScience science = new myScience();
		science.createAssignment(6);
		myEnglish english = new myEnglish();
		english.createAssignment(10);
		myJava java = new myJava();
		java.createAssignment(5);
		assignments.add(math);
		assignments.add(science);
		assignments.add(english);
		assignments.add(java);
	}
	
	public static void print() {
		for (homework hw : assignments) {
			System.out.println(hw.toString());
		}
	}
	
	public static void main(String[] args) {
		addAssignments();
		print();
	}

}
