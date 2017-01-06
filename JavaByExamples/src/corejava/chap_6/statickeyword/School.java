package corejava.chap_6.statickeyword;

public class School {
	public static void main(String[] args) {
		// static members are loaded into JVMs memory on classloading (.class file loads into JVM)
		// and can be directly accessed using the class name
		System.out.println(Student.school);
	}

}
