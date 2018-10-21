/*
ConvertToBinaryApp.java
S. Rodriguez
October 21st 2018
*/

import java.util.*;
public class ConvertToBinaryApp{

	public static void main(String[] args){

		int decimalNumber;
		String binaryNumber;
		Scanner scan;
		ConvertToBinary myBinary;

		decimalNumber = 0;
		binaryNumber = "";
		scan = new Scanner(System.in);
		myBinary = new ConvertToBinary();

		System.out.print("Type a decimal number: ");
		decimalNumber = scan.nextInt();

		myBinary.setDecimalNumber(decimalNumber);

		myBinary.compute();

		System.out.println("The number " + decimalNumber + " in binary is: " + myBinary.getResult());

	}

}