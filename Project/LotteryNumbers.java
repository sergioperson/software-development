/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

public class LotteryNumbers {

	private int[] lotteryNumbersArray;
	private int[] lotteryNumbers;
	private int randomNumber;
	private int count;

	public LotteryNumbers() {
		lotteryNumbersArray = new int[40];
		lotteryNumbers = new int[6];
		randomNumber=0;
		count=0;
	}

	public void generate() {

		do {
			randomNumber=(int)(Math.random() * ((40 - 1) + 1)) + 1;
			
			if(lotteryNumbersArray[randomNumber-1]==0) {
				lotteryNumbersArray[randomNumber-1] = randomNumber;
				count++;
			}			
		} while(count<6);
			
		count=0;
		for(int i=0;i<40;i++) {
			if(lotteryNumbersArray[i]!=0) {
				lotteryNumbers[count]=lotteryNumbersArray[i];
				count++;			
			}
		}
	}
	
	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}

}