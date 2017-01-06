package corejava.chap_4.controlstatements;

/**
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class If_Elseif_Else {

	public static void main(String[] args) {
		byte day = 1;
		if(day == 0){
			System.out.println("Today is Sunday");
		}else if(day == 1){
			System.out.println("Today is Monday");
		}else{
			System.out.println("Its a bad day");
		}
	}

}
