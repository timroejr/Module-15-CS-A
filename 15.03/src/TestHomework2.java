import java.util.*;
public class TestHomework2 {
	private static List<Homework2> beforeAssignments = new ArrayList<Homework2>();
	public static void addAssignments() {
		
		MyMath2 math = new MyMath2();
		math.createAssignment(4);
		beforeAssignments.add(math);
		
		MyScience2 science = new MyScience2();
		science.createAssignment(6);
		beforeAssignments.add(science);
		
		MyEnglish2 english = new MyEnglish2();
		english.createAssignment(10);
		beforeAssignments.add(english);
		
		MyJava2 java = new MyJava2();
		java.createAssignment(5);
		beforeAssignments.add(java);
	}
	
	public static void print() {
		for (Homework2 hwBefore : beforeAssignments) {
			System.out.println("Before Reading: ");
			System.out.println(hwBefore.toString());
			System.out.println("After Reading: ");
			hwBefore.doReading();
			System.out.println(hwBefore.toString());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		addAssignments();
		print();
	}

}
