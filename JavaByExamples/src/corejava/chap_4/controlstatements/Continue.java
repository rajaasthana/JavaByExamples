package corejava.chap_4.controlstatements;

/**
 * 'continue' is used to skip the current iteration
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Continue {
	public static void main(String[] args) {
		//skips the iteration when the value is 3
		for(int i = 0; i<10; i++){
			if(i == 3){
				continue;
			}
			System.out.println(i);
		}
	}
}
