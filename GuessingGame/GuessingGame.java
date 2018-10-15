/*
GuessingGame.java
S. Rodriguez
Oct. 15 2018
*/

import javax.swing.JOptionPane;
public class GuessingGame{

	//declare variables
	private int userNumber;
	private int appNumber;
	private String result;

	//constructor
	public GuessingGame(){
		userNumber=0;
		appNumber=(int)(Math.random()*10);
		result="";
	}

	//setters
	public void setUserNumber(int userNumber){
		this.userNumber=userNumber;
	}

	//process
	public void compute(){
		if(appNumber==userNumber){
			result="Congratulations, you guessed correctly!";
		}else if(appNumber<userNumber){
			result="You guessed too high, sorry!";
		}else{
			result="You guessed to low, sorry!";
		}
	}

	//output
	public String getResult(){
		return result;
	}

	public int getAppNumber(){
		return appNumber;
	}
}
