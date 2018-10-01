/*
Eggs.java
S Rodriguez
10 01 2018
*/

public class Eggs{

	private int eggsCollected;
	private int boxesNeeded;
	private int eggsLeftOver;
	private final int BOX;

	//Constructor
	public Eggs(){
	eggsCollected=0;
	boxesNeeded=0;
	eggsLeftOver=0;
	BOX=12;

	}

	//Setters - input
	public void setEggsCollected(int eggsCollected){
		this.eggsCollected=eggsCollected;
	}

	//Compute - Calculations
	public void calculate(){
		boxesNeeded=eggsCollected/BOX;
		eggsLeftOver=eggsCollected%BOX;
	}

	//Getters - output
	public int getBoxesNeeded(){
		return boxesNeeded;
	}

	public int getEggsLeftOver(){
		return eggsLeftOver;
	}

}

