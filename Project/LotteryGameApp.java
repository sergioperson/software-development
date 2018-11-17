/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

public class LotteryGameApp {

	public static void main(String[] args) {
		
		//declare variables
		int[] lotteryNumbers;
		
		//declare and create objects
		LotteryGame myLotteryPanel;
		myLotteryPanel = new LotteryGame();
		LotteryNumbers myLotteryNumbers;
		myLotteryNumbers = new LotteryNumbers();	
		lotteryNumbers = new int[6];
		
		//setter
		myLotteryPanel.setLotteryNumbers(lotteryNumbers);
		
		//process
		myLotteryNumbers.generate();
		
		//TEST
		for(int i=0;i<6;i++) {
			lotteryNumbers[i]=myLotteryNumbers.getLotteryNumbers()[i];
			System.out.println(lotteryNumbers[i]);
			}
		}
		
		//output
		
	
}