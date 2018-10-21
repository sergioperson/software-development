/*
ConvertToBinary.java
S. Rodriguez
October 21st 2018
*/

import java.util.*;
public class ConvertToBinary{

		int decimalNumber;
		String binaryNumber;
		int lastInt;
		Scanner scan;
		ArrayList<Integer> numbers;

		public ConvertToBinary(){
		decimalNumber = 0;
		binaryNumber = "";
		lastInt = 0;
		scan = new Scanner(System.in);
		numbers = new ArrayList<Integer>();
		}

		public void setDecimalNumber(int decimalNumber){
			this.decimalNumber=decimalNumber;

		}

		public void compute(){
			for (int x = 1, i = 0; x <= decimalNumber; x = x * 2, i++) {
				numbers.add(x);
				lastInt = i;
   			}

			for (int j = lastInt; j != -1; j--){

				if (numbers.get(j) <= decimalNumber) {
					binaryNumber += Integer.toString(1);
					decimalNumber = decimalNumber - numbers.get(j);
				}else{
					binaryNumber += Integer.toString(0);
				}

			}
		}

		public String getResult(){
			return binaryNumber;
		}

}