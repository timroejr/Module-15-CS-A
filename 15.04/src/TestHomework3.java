import java.util.*;
public class TestHomework3 {
	private static List<Homework3> assignments = new ArrayList<Homework3>();

	public static void addAssignments() {
		MyMath3 math = new MyMath3();
		math.createAssignment(4);

		MyScience3 science = new MyScience3();
		science.createAssignment(6);

		MyEnglish3 english = new MyEnglish3();
		english.createAssignment(4);

		MyJava3 java = new MyJava3();
		java.createAssignment(5);

		assignments.add(math);
		assignments.add(science);
		assignments.add(english);
		assignments.add(java);
	}

	public static void print() {
		for (Homework3 hw : assignments) {
			System.out.println(hw.toString());
		}
	}

	public static void compare() {
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < assignments.size(); i++) {
			for (int j = 0; j < assignments.size(); j++) {
				Homework3 hw1 = assignments.get(index1);
				Homework3 hw2 = assignments.get(index2);
				int pagesHW1 = hw1.getPages();
				int pagesHW2 = hw2.getPages();
				int compareResult = hw1.compareTo(pagesHW1, pagesHW2);
				//System.out.println(assignments.get(index1).getTypeHomework()); DEBUG PURPOSES ONLY
				String n1 = assignments.get(index1).getTypeHomework();
				String n2 = assignments.get(index2).getTypeHomework();
				if (!(n1.equals(n2))) {
					if (compareResult == 0) {
						System.out.println("The homework for " + assignments.get(index1).getTypeHomework() + " and " + assignments.get(index2).getTypeHomework() + " are the same number of pages.");
					}
				}
				index2++;
			}
			index2 = 0;
			index1++;
		}
	}

	public static void main(String[] args) {
		addAssignments();
		print();
		compare();
	}
}
