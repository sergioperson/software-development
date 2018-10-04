/*
Interest.java
S Rodriguez
10 03 2018
*/

public class Interest {

	private int numberOfMonths;
	private double amountOfMoney;
	private final double INTEREST_RATE;
	private double totalAmount;

	public Interest(){

	numberOfMonths=0;
	amountOfMoney=0;
	INTEREST_RATE=3.0;
	totalAmount=0;

	}

	public void setNumberOfMonths(int numberOfMonths){
		this.numberOfMonths=numberOfMonths;
	}

	public void setAmountOfMoney(double amountOfMoney){
		this.amountOfMoney=amountOfMoney;
	}

	public void calculate(){

	totalAmount=amountOfMoney*Math.pow((1+(INTEREST_RATE/100)),numberOfMonths);

	}

	public double getAmountToRepay(){
		return totalAmount;
	}

}