package corejava.chap_3.operators;

/**
 * Logical operators are
 * <ul>
 * 	<li>AND (&&)</li>
 * 	<li>OR (||)</li>
 * 	<li>NOT (!)</li>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Logical {
	public static void main(String[] args) {
		int i = 10;
		
		if(i < 15 && i > 5){
			System.out.println("The value of i -- using AND operator "+ i);
		}
		
		if(i < 5 || i < 15){
			System.out.println("The value of i -- using OR operator " + i);
		}

		if(!(i < 5)) {
			System.out.println("The value of i -- using NOT operator " + i);
		}
	}
}
