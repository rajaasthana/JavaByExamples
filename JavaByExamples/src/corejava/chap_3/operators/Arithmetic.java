package corejava.chap_3.operators;

/**
 * Arithmetic Operators
 * <ul>
 * 		<li>Addition (+)</li>
 * 		<li>Subtraction (-)</li>
 * 		<li>Multiplication (*)</li>
 * 		<li>Division (/)</li>
 * 		<li>Modulus (%)</li>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Arithmetic {
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		int sum = value1 + value2;
		System.out.println(sum);//30
		
		//modulus returns the remainder
		
		int v1 = 10;
		int v2 = 4;
		System.out.println(v1%v2);//2
	}
}
