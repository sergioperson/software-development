/*
create a program that allows the staff member to enter the total cost of the shopping and the amount the customer has paid.
The program should then calculate and output how many 50, 20, 10, 5 notes, and how many 2, and 1 coins to give the customer
as change. Mr. Cashman refuses to deal with small coins so although the staff member enters a decimal value for the cost of
the shopping he rounds all of his prices down to the nearest euro and doesn't bother with 50c, 20c, 10c, 5c, 2c or 1c coins.

Write, compile and test the application as per Mr Cashmans requirements and save the class as MakingChange.java
*/

import java.util.Scanner;
public class MakingChange {

	public static void main(String[] args) {

	double totalCost, totalPaid, change, note50, note20, note10, note5, coin2, coin1;

	Scanner in = new Scanner(System.in);

	System.out.print("Total cost of the shopping: ");
	totalCost=in.nextDouble();

	System.out.print("Total paid by customer: ");
	totalPaid=in.nextDouble();

	change=totalPaid-totalCost;

	System.out.println("Total change: " + Math.round(change));

	note50=change/50;
	change = Math.round(change)%50;

	note20=change/20;
	change = Math.round(change)%20;

	note10=change/10;
	change = Math.round(change)%10;

	note5=change/5;
	change=Math.round(change)%5;

	coin2=change/2;
	change=Math.round(change)%2;

	coin1=change/1;
	change=Math.round(change)%1;

	System.out.println("50 euro notes: " + Math.floor(note50));
	System.out.println("20 euro notes: " + Math.floor(note20));
	System.out.println("10 euro notes: " + Math.floor(note10));
	System.out.println(" 5 euro notes: " + Math.floor(note5));
	System.out.println(" 2 euro coins: " + Math.floor(coin2));
	System.out.println(" 1 euro coins: " + Math.floor(coin1));

	}
}