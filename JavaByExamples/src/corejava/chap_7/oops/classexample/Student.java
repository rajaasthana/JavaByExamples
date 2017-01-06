package corejava.chap_7.oops.classexample;

/**
 * A class is a container of member variables and methods
 * A class is a structure/blueprint.
 * 
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Student {
	
	//attributes
	int id;
	String name;

	//methods/behaviors
	void setName(String n){
		name = n;
	}
	
	String getName(){
		return name;
	}
}
