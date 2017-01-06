package corejava.chap_1.structure;


/**
 * <p>This program shows the basic structure of a java program.</p>
 * 
 * <p>At this point, there is no need to worry about any of the keyword in this program.</p>
 * 
 * Things to learn from the program
 * 	<ul>
 * 		<li>The name after 'class' is called classname. In this case the classname is 'FirstJavaProgram'</li>
 * 		<li>The file should be saved in the name of the classname (FirstJavaProgram.java)</li>
 * 		<li>public static void main() is the starting point of execution</li>
 * 		<li>To compile the code, use the command 'javac filename.java' (javac FirstJavaProgram.java)
 * 		<li>Once the compilation is successful, compiler creates a bytecode file (FirstJavaProgram.class) which is used to execute the program</li>
 * 		<li>To run the code, use the command 'java filename' (java FirstJavaProgram)
 * 		<li>The program prints 'My First Java Program' to the console</li>
 * 	</ul>
 * @author Raja Asthana
 * @since 6-Jan-2017
 */
public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("My First Java Program");
	}

}
