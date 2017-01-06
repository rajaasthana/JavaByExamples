package corejava.chap_4.controlstatements;

/**
 * <p>'while' is a looping statement. 'while' is used to execute a piece of code repeatedly until a condition becomes false<p> 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class WhileLoop {
	public static void main(String[] args) {

		//print number from 1 to 10
		int value = 1; //start value
		while(value <=10){
			System.out.println(value);
			value++; //update the value by 1
		}
	}
}
