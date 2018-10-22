/*
AllNumbersSumApp.java
S. Rodriguez
October 22 2018
*/

import javax.swing.JOptionPane;
public class AllNumbersSumApp{

	public static void main(String[] args){

	//declare variables;
	int number;
	int sum;
	AllNumbersSum mySumApp;

	//declare objects
	number=0;
	sum=0;

	//create objects
	mySumApp=new AllNumbersSum();

	//input
	number=Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));
	mySumApp.setNumber(number);


	//process
	mySumApp.compute();

	//output
	sum=mySumApp.getSum();
	JOptionPane.showMessageDialog(null,"The sum is: "+sum);

	}
}