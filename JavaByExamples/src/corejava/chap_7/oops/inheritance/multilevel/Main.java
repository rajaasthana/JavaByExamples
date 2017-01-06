package corejava.chap_7.oops.inheritance.multilevel;

/**
 * Main class to demonstrate multilevel inheritance (Parent-child-GrandChild)
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Main {

	public static void main(String[] args) {

		CollegeStudent s1 = new CollegeStudent();
		
		s1.setDepartment("Computer Science");
		
		//collegestudent accessing properties of student
		s1.setId(1);
		s1.setMarks(78);
		
		//collegestudent object accessing the properties of it parent
		s1.setFirstName("Raja");
		s1.setLastName("Asthana");
		s1.setAge(28);
		
		System.out.println("Id: "+s1.getId());
		System.out.println("Name: "+s1.getFirstName() + " " + s1.getLastName());
		System.out.println("Department: "+s1.getDepartment());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Marks: "+s1.getMarks());
	}
	
	
}
