/*
GuessingGameApp.java
S. Rodriguez
Oct. 15 2018
*/

import javax.swing.JOptionPane;
public class GuessingGameApp{

	public static void main(String[] args){

	//declare variables;
	int userNumber;
	int appNumber;
	String result;

	//declare objects
	userNumber=0;
	appNumber=0;
	result="";
	GuessingGame myGuessingGame;

	//create objects
	myGuessingGame=new GuessingGame();

	//input
	userNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please type a number from 1 to 10: "));
	myGuessingGame.setUserNumber(userNumber);

	//process
	myGuessingGame.compute();

	//output
	appNumber=myGuessingGame.getAppNumber();
	JOptionPane.showMessageDialog(null,"The secret number was: "+appNumber);

	result=myGuessingGame.getResult();
	JOptionPane.showMessageDialog(null,result);

	}
}
