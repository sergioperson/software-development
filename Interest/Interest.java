public class Interest {

	private int numberOfMonths;
	private double amountOfMoney;
	private final double INTEREST_RATE;
	private double interestValue;

	public Interest(){

	numberOfMonths=0;
	amountOfMoney=0;
	INTEREST_RATE=3.0;
	interestValue=0;

	}

	public void setNumberOfMonths(int numberOfMonths){
		this.numberOfMonths=numberOfMonths;
	}

	public void setAmountOfMoney(double amountOfMoney){
		this.amountOfMoney=amountOfMoney;
	}

	public void calculate(){

		for (int i=0;i<numberOfMonths;i++){
			interestValue=amountOfMoney*INTEREST_RATE/100;
			amountOfMoney=amountOfMoney+interestValue;
		}
	}

	public double getAmountToRepay(){
		return amountOfMoney;
	}

}