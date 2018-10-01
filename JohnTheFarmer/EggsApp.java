/*
EggsApp.java
S Rodriguez
10 01 2018
*/

import java.util.*;
public class EggsApp{

	public static void main(String[] args) {

		int eggsCollected;
		int boxesNeeded;
		int eggsLeftOver;

		Scanner input;
		input=new Scanner(System.in);

		Eggs myEggs;
		myEggs=new Eggs();

		System.out.print("Number of eggs collected: ");
		eggsCollected=input.nextInt();

		myEggs.setEggsCollected(eggsCollected);

		myEggs.calculate();

		boxesNeeded=myEggs.getBoxesNeeded();
		System.out.println("Box(es) needed: "+boxesNeeded+".");

		eggsLeftOver=myEggs.getEggsLeftOver();
		System.out.println("Remaining egg(s): "+eggsLeftOver+".");

	}
}