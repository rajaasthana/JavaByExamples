package corejava.chap_7.oops.inheritance.hierarchial;

/**
 * Child class for Person
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Employee extends Person {

	private float salary;

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	
}
