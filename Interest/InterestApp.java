/*
Interest.java
S Rodriguez
10 03 2018
*/

import java.util.*;
public class InterestApp {

	public static void main(String[] args){

	int numberOfMonths;
	double amountOfMoney;
	double amountToRepay;

	Scanner scanner=new Scanner(System.in);
	Interest myInterest;
	myInterest=new Interest();

	System.out.print("Number of months: ");
	numberOfMonths=scanner.nextInt();

	myInterest.setNumberOfMonths(numberOfMonths);

	System.out.print("Amount of Money: ");
	amountOfMoney=scanner.nextDouble();

	myInterest.setAmountOfMoney(amountOfMoney);

	myInterest.calculate();

	amountToRepay=myInterest.getAmountToRepay();
	System.out.println("The amount value to repay is "+amountToRepay);

	}
}