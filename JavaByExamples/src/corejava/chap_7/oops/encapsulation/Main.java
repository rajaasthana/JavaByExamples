package corejava.chap_7.oops.encapsulation;

/**
 * Main class to demonstrate object creation and accessing attributes and behaviors through object.
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Main {

	public static void main(String[] args) {
		//create car object
		Car bmw = new Car();
		
		bmw.brand = "BMW";
		bmw.gearType = 'A';
		bmw.model = "320D";
		//bmw.noOfWheels = 10; //main cannot access noOfWheels (private member)
		bmw.printCarInfo();
		
	}
	
	
}
