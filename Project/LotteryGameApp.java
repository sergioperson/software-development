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
		LotteryNumbers myLotteryNumbers = new LotteryNumbers();
		LotteryGame myLotteryGame = new LotteryGame();
		lotteryNumbers = new int[6];
		
		//process
		myLotteryGame.setLotteryNumbers(lotteryNumbers);
		myLotteryGame.compute();
		myLotteryNumbers.compute();
		
		//TEST
		for(int i=0;i<6;i++) {
			lotteryNumbers[i]=myLotteryNumbers.getLotteryNumbers()[i];
			System.out.println(lotteryNumbers[i]);
			}
		}

}