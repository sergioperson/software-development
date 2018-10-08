/*
Numbers.java
S Rodriguez
1 10 2018
*/

public class Numbers{

	//Data member should be private
	private int number1;
	private int number2;
	private int sum;

	//Constructor
	public Numbers(){
	number1=0;
	number2=0;
	sum=0;
	}

	//Setters - input
	public void setNumber1(int number1){
		this.number1=number1;
	}

	public void setNumber2(int number2){
		this.number2=number2;
	}

	//Compute - Calculations
	public void compute(){
		sum=number1+number2;
	}

	//Getters - output
	public int getSum(){
		return sum;
	}

}