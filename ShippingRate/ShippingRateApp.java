/*
ShippingRateApp.java
S Rodriguez
06/10/2018
*/

import java.util.Scanner;
public class ShippingRateApp{

	public static void main(String args[]){

	//declare variables
	double purchaseValue,result;

	//declare objects
	Scanner scan=new Scanner(System.in);
	ShippingRate shipping=new ShippingRate();

	System.out.print("Purchase value: ");
	purchaseValue=scan.nextDouble();

	//call methods
	shipping.setPurchaseValue(purchaseValue);
	shipping.Calculate();

	//output
	System.out.println("The total price including shipping is: " + shipping.getResult());


}
}