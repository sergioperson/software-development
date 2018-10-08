/*
Calculator.java
S Rodriguez
05/10/2018
*/

public class Calculator {


	private double number1;
	private double number2;
	private double result;

	//constructors - java will create default
	public Calculator(){
		//default constructor
	}

	//setters
	public void setNumber1(double number1) {
		this.number1=number1;
	}

	public void setNumber2(double number2) {
		this.number2=number2;
	}

	//processes
	public void add(){
		result=number1+number2;
	}

	public void subtract(){
		result=number1-number2;
	}

	//getters
	public double getResult(){
		return result;
	}
}