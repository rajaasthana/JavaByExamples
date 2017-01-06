package corejava.chap_7.oops.object;

/**
 * Object is an instance of a class. Object is always created with the new keyword. See {@link Main} for the actual object creation.
 * When the object is created, JVM allocates memory for all non static members(instance members)
 * <p>Multple object can be created for a single class. Each object has its own memory space</p>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Car {
	char gearType; //M - manual, A- Automatic
	String brand;
	String model;
	
	public void printCarInfo(){
		System.out.println("Brand: "+ brand +", Model: "+model +", Gear Type: "+gearType);
	}
}
