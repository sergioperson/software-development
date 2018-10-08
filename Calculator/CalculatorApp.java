/*
CalculatorApp.java
S Rodriguez
05/10/2018
*/

import java.util.*;
public class CalculatorApp {

	public static void main(String[] args) {

	//declare variables;
	double number1=0;
	double number2=0;
	double result=0;

	//declare and create objects
	Calculator calc=new Calculator();
	Scanner scanner=new Scanner(System.in);

	//input
	System.out.print("Number 1: ");
	number1=scanner.nextDouble();

	System.out.print("Number 2: ");
	number2=scanner.nextDouble();

	//call methods
	calc.setNumber1(number1);
	calc.setNumber2(number2);

	calc.add();
	result=calc.getResult();

	//outputs
	System.out.println("The sum of " + number1 + " and " + number2 + " is " + result + ".");

	calc.subtract();
	result=calc.getResult();

	System.out.println("The subtract of " + number1 + " and " + number2 + " is " + result + ".");

	}

}