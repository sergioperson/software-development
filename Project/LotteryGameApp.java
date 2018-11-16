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
		String[] lotteryNumbers;
		lotteryNumbers = new String[40];
		
		//setter
		myLotteryPanel.setLotteryNumbers(lotteryNumbers);
		
		//process
		myLotteryNumbers.generate();
		
		for(int i=0;i<40;i++) {
			lotteryNumbers[i]=myLotteryNumbers.getLotteryNumbers()[i];

			/*if(lotteryNumbers[i]!="") {
				System.out.println(lotteryNumbers[i]);
			}*/
		}
		
		//output
		
		

	}
	
}