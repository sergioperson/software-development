/*
CalculatorIf.java
S Rodriguez
10/06/2018
*/

public class CalculatorIf {

	//declare variables
	private double firstNumber;
	private double secondNumber;
	private double result;

	//Constructor
	public CalculatorIf() {

	}

	//Setters
	public void setFirstNumber(double firstNumber){
		this.firstNumber=firstNumber;
	}

	public void setSecondNumber(double secondNumber){
		this.secondNumber=secondNumber;
	}

	//Process
	public void Sum(){
		result=firstNumber+secondNumber;
	}

	public void Subtract(){
		result=firstNumber-secondNumber;
	}

	public void Multiply(){
		result=firstNumber*secondNumber;
	}

	public void Divide(){
		result=firstNumber/secondNumber;
	}

	//Getters
	public double getResult(){
		return result;
	}
}