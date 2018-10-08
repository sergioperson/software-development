/*
Numbers.java
S Rodriguez
1 10 2018
*/

import java.util.*;
public class NumbersApp{
	public static void main(String[] args){

		//variables
		int number1;
		int number2;
		int sum;

		//objects - external
		Scanner keyboard;
		keyboard=new Scanner(System.in);
		Numbers myNumbers;
		myNumbers=new Numbers();

		//ask question
		System.out.print("Enter number 1: ");

		//store answer
		number1=keyboard.nextInt();

		//send answer to instance class
		myNumbers.setNumber1(number1);

		System.out.print("Enter number 2: ");
		number2=keyboard.nextInt();
		myNumbers.setNumber2(number2);

		//process
		myNumbers.compute();

		//output
		sum=myNumbers.getSum();
		System.out.println("The sum of the two numbers is " + sum);
	}

}