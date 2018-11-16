/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

public class LotteryGameApp {

	public static void main(String[] args) {
		
		LotteryPanel myLotteryPanel;
		myLotteryPanel = new LotteryPanel();
		
		LotteryNumbers myLotteryNumbers = new LotteryNumbers();
		int[] lotteryNumbers;
		lotteryNumbers = new int[6];
		
		//setter
		myLotteryPanel.setLotteryNumbers(lotteryNumbers);
		
		//process
		myLotteryNumbers.generate();
		
		for(int i=0;i<6;i++) {
			lotteryNumbers[i]=myLotteryNumbers.getLotteryNumbers()[i];
			System.out.println(lotteryNumbers[i]);
			}
		}
		
		//output
		
	
}