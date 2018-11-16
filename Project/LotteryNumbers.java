/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

import java.util.Arrays;

public class LotteryNumbers {

	private String lotteryNumbers[];
	private int randomNumber;
	private int count;
	private String StringNumber;

	public LotteryNumbers() {
		lotteryNumbers = new String[40];
		randomNumber=0;
		count=0;
		StringNumber="";
	}

	public void generate() {
		Arrays.fill(lotteryNumbers, ""); // fills the array with empty strings
		do {
			randomNumber=(int)(Math.random() * ((40 - 1) + 1)) + 1;
			StringNumber = String.valueOf(randomNumber); //convert int to String
			
			if(lotteryNumbers[randomNumber-1].equals("")) {
				lotteryNumbers[randomNumber-1] = StringNumber;
				count++;
			}			
		} while(count<6);
		
		
		/*for(int i=0;i<40;i++) {
			if(lotteryNumbers[i]!="") {
				System.out.println(lotteryNumbers[i]);
			}
		}*/
		
	}
	
	public String[] getLotteryNumbers() {
		return lotteryNumbers;
	}
	

}