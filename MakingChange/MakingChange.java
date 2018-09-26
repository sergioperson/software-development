/*
MakingChange.java
Sergio Rodriguez
*/

import java.util.Scanner;
public class MakingChange {

	public static void main(String[] args) {

	double totalCost,totalPaid,change,moneyAmmount;
	int moneyValue[]={50,20,10,5,2,1};

	Scanner in=new Scanner(System.in);

	System.out.print("Total cost of the shopping: ");
	totalCost=in.nextDouble();
	System.out.print("Total paid by customer: ");
	totalPaid=in.nextDouble();

	change=totalPaid-totalCost;

	System.out.println("Total change: " + Math.round(change));

	for (int i=0;i<moneyValue.length;i++){

		moneyAmmount=change/moneyValue[i];
		change=Math.round(change)%moneyValue[i];

		System.out.println(moneyValue[i]+" euro ammount: "+Math.floor(moneyAmmount));
	}

	}
}
