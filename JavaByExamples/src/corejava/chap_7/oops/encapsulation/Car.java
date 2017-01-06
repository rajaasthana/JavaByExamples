package corejava.chap_7.oops.encapsulation;

/**
 * <p>Encapsulation refers to wrapping/hiding attribues/behaviors from other objects</p>
 * Class is an example of encapsulation as it wraps the attributes and behaviors of an object
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Car {
	char gearType;
	String brand;
	String model;
	private int noOfWheels = 4;//marking private hides this attribute from accessing outside of this class
	
	public void printCarInfo(){
		System.out.println("Brand:"+ brand +", Model:"+model +", Gear Type:"+gearType +", Wheels:"+ noOfWheels);
	}
}
