/*
CalcultorIfApp.java
S Rodriguez
06/10/2018
*/

import java.util.*;
public class CalculatorIfApp{

	public static void main(String[] args){

	//declare variables
	double value1;
	double value2;
	char operator;

	//declare objects
	Scanner scan=new Scanner(System.in);
	CalculatorIf calc=new CalculatorIf();

	//request input data
	System.out.print("First number: ");
	value1=scan.nextDouble();

	System.out.print("Second number: ");
	value2=scan.nextDouble();

	System.out.print("Operator +, -, * or /: ");
	operator=scan.next().charAt(0);

	//set values
	calc.setFirstNumber(value1);
	calc.setSecondNumber(value2);

	//execute
	if(operator=='+'){

		calc.Sum();
		System.out.println(value1 + " + " + value2 + " = " + calc.getResult());

	}else if(operator=='-'){

		calc.Subtract();
		System.out.println(value1 + " - " + value2 + " = " + calc.getResult());

	}else if(operator=='*'){

		calc.Multiply();
		System.out.println(value1 + " * " + value2 + " = " + calc.getResult());

	}else if(operator=='/'){

		calc.Divide();
		System.out.println(value1 + " / " + value2 + " = " + calc.getResult());

	}else{

		System.out.println("Invalid operator!");

	}
	}
}