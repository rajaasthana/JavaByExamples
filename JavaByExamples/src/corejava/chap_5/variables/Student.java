package corejava.chap_5.variables;

/**
 * Three kinds of variables in Java
 * <ul>
 * <li>local - local to method</li>
 * <li>instance - object level (refer OOPs)</li>
 * <li>static - class level (refer static keyword)</li>
 * </ul>
 * 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Student {
	static int totalMarks;//static variable -- class level
	int id; // instance variable -- object level
	
	public static void main(String[] args) {
		float pi = 3.14f; //local variable
		System.out.println(pi);
	}
}
