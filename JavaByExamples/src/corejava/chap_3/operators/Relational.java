package corejava.chap_3.operators;

/**
 * Relational Operators are
 * <ul>
 * <li>LESS THAN (<)</li>
 * <li>GREATER THAN (>)</li>
 * <li>GREATER THAN OR EQUALS TO (>=)</li>
 * <li>LESS THAN OR EQUALS TO (<=)</li>
 * <li>EQUAL TO (==)</li>
 * <li>NOT EQUAL TO (!=)</li>
 * </ul>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Relational {
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i<5); //false
		System.out.println(i>5); //true
		System.out.println(i<=5); //false
		System.out.println(i>=5); //true
		System.out.println(i==10); //true
		System.out.println(i!=15); //true
	}
}
