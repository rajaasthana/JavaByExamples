package corejava.chap_7.oops.inheritance.multilevel;

/**
 * GrandChild class for Person
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class CollegeStudent extends Student {

	private String department;

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
