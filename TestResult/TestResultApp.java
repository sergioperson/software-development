/*
TestResultApp.java
S Rodriguez
10/09/2018
*/
import java.util.Scanner;
public class TestResultApp{

	public static void main(String[] args){

	//declare variables
	Double englishNote;
	Double mathNote;
	String result;

	//Declare objects
	Scanner keyboard;
	TestResult myResult;

	keyboard=new Scanner(System.in);
	myResult=new TestResult();

	//inputs
	System.out.print("English note: ");
	englishNote=keyboard.nextDouble();

	System.out.print("Math note: ");
	mathNote=keyboard.nextDouble();

	//set values
	myResult.setEnglishNote(englishNote);
	myResult.setMathNote(mathNote);

	//Compute
	myResult.compute();
	result=myResult.getResult();

	//Output
	System.out.println(result);

	}

}