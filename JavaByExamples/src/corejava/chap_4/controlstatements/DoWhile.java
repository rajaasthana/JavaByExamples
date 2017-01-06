package corejava.chap_4.controlstatements;

/**
 * Do-While is same as 'while' except it checks for the condition after executing the code once
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class DoWhile {
	public static void main(String[] args) {

		//even if the condition is 'false', the below loop executes once
		int value = 15;
		do{
			System.out.println(value);
		}
		while(value <=10);
	}

}
