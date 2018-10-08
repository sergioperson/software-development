/*
PayApp.java
S Rodriguez
10/08/2018
*/
import java.util.Scanner;
public class PayApp{

	public static void main(String[] args){

	//declare variables
	double basicPayRate;
	final double OVERTIMERATE;
	double basicHoursPerWeek;
	double overTimeHoursPerWeek;
	double basicPayWeek;
	double payOverTime;
	double totalPay;

	//declare objects
	Scanner keyboard;
	Pay myPay;

	//create objects
	keyboard=new Scanner(System.in);
	myPay=new Pay();

	//input
	System.out.print("Enter the basic pay rate: ");
	basicPayRate=keyboard.nextDouble();
	myPay.setBasicPayRate(basicPayRate);

	System.out.print("Enter the amount of basic hours per week: ");
	basicHoursPerWeek=keyboard.nextDouble();
	myPay.setBasicHoursPerWeek(basicHoursPerWeek);

	System.out.print("Enter the amount of over-time hours per week: ");
	overTimeHoursPerWeek=keyboard.nextDouble();
	myPay.setOverTimeHoursPerWeek(overTimeHoursPerWeek);

	//process
	myPay.compute();
	basicPayWeek=myPay.getBasicPayWeek();
	payOverTime=myPay.getPayOverTime();
	totalPay=myPay.getTotalPay();

	//output
	System.out.println("The base pay for the week is: "+basicPayWeek);
	System.out.println("The over-time pay for the week is: "+payOverTime);
	System.out.println("The total pay including over-time is: "+totalPay);

	}

}