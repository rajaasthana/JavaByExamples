package corejava.chap_7.oops.inheritance.single;

/**
 * Main class to demonstrate inheritance
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setMarks(78);
		
		//student object accessing the properties of it parent
		s1.setFirstName("Raja");
		s1.setLastName("Asthana");
		s1.setAge(28);
		
		System.out.println("Id: "+s1.getId());
		System.out.println("Name: "+s1.getFirstName() + " " + s1.getLastName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Marks: "+s1.getMarks());
	}
	
	
}
