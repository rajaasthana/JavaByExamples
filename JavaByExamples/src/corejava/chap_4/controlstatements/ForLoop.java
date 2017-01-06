package corejava.chap_4.controlstatements;

/**
 * <p><code><b>for</b></code> is a looping statement. 'for' is used to execute a piece of code repeatedly until a condition becomes false<p>
 * <p>'for' is an alternative to 'while' where the initialization, condition, increment/decrement is in a single line of code</p>
 * <p>Prefer 'while' loop when the number of iteration is not known</p> 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class ForLoop {
	public static void main(String[] args) {

		//print number from 1 to 10
		for(int i=0; i <=10; i++){
			System.out.println(i);
		}
	}
}
