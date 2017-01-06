package corejava.chap_7.oops.inheritance.hierarchial;

/**
 * Main class to demonstrate multilevel inheritance (Parent-child-GrandChild)
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Main {

	public static void main(String[] args) {
		Employee s1 = new Employee();
		s1.setSalary(25000);
		
		//collegestudent object accessing the properties of it parent
		s1.setFirstName("Raja");
		s1.setLastName("Asthana");
		s1.setAge(28);
		
		System.out.println("Name: "+s1.getFirstName() + " " + s1.getLastName());
		System.out.println("Salary: "+s1.getSalary());
		System.out.println("Age: "+s1.getAge());
	}
	
	
}
