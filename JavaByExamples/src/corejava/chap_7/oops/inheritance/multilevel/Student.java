package corejava.chap_7.oops.inheritance.multilevel;

/**
 * Child class for Person
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class Student extends Person {

	private int id;
	private int marks;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
