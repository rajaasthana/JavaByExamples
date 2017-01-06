package corejava.chap_4.controlstatements;

/**
 * 'break' is used to terminate a loop
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Break {
	public static void main(String[] args) {
		//terminate the loop when the value is 3
		for(int i = 0; i<10; i++){
			if(i == 3){
				break;
			}
			System.out.println(i);
		}
	}
}
