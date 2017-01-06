package corejava.chap_3.operators;

/**
 * Increment Operators are
 * <ul>
 * <li>++</li>
 * <li>--</li>
 * </ul>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class IncrementDecrement {
	public static void main(String[] args) {
		int i = 10;// '=' assigns value to a variable while '==' compares the value
		
		System.out.println(i++); //10 - post increment (prints and increments the value)
		System.out.println(i); //11
	}
}
