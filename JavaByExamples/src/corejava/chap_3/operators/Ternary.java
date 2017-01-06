package corejava.chap_3.operators;

/**
 * Ternary Operator (?:) - replacement for simple if-else
 * <ul>
 * Usage
 * <li>condtion? trueValue : falseValue</li>
 * </ul>
 * 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Ternary {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i > 10 ? "Hello" : "Hi"); // Hi
	}
}
