/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LotteryGame {

	//declare variables
	private LotteryLayout myLotteryLayout;
	private LotteryResults myLotteryResults;
	private JButton[] buttons;
	private int[] game1Array, game2Array, game3Array, lotteryNumbers;
	private int count;
	private String game1, game2, game3, resultNumbers, lotteryResult, choice;
	private int[][] guessedGame1, guessedGame2, guessedGame3;

	//constructor
	public LotteryGame() {
		myLotteryLayout = new LotteryLayout();
		myLotteryResults = new LotteryResults();
		buttons = new JButton[40];
		buttons = myLotteryLayout.getButtons();
		game1Array = new int[6];
		game2Array = new int[6];
		game3Array = new int[6];
		lotteryNumbers = new int[6];
		count = 0;
		game1="";
		game2="";
		game3="";
		resultNumbers="";
		lotteryResult="";
		guessedGame1 = new int[0][0];
		guessedGame2 = new int[0][0];
		guessedGame3 = new int[0][0];
		choice = "";
	}

	public void compute(){

		myLotteryLayout.compute();
	
		for(int i=0; i<40; i++) {

			buttons[i].setActionCommand(Integer.toString(i+1));
			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					choice = e.getActionCommand();

					int buttonNumber=Integer.parseInt(choice);
					buttons[buttonNumber-1].setEnabled (false);

					if(count<6) { //The counter checks how many button presses occurred				
						game1Array[count]=Integer.parseInt(choice);
						game1 = "Game 1:  "+game1Array[0]+"  "+game1Array[1]+"  "+game1Array[2]+"  "+game1Array[3]+"  "+game1Array[4]+"  "+game1Array[5];
					} else if ((count>5)&&(count<12)) { 
						game2Array[count-6]=Integer.parseInt(choice);
						game2 = "Game 2:  "+game2Array[0]+"  "+game2Array[1]+"  "+game2Array[2]+"  "+game2Array[3]+"  "+game2Array[4]+"  "+game2Array[5]; 
					} else if ((count>11)&&(count<18)){
						game3Array[count-12]=Integer.parseInt(choice);
						game3 = "Game 3:  "+game3Array[0]+"  "+game3Array[1]+"  "+game3Array[2]+"  "+game3Array[3]+"  "+game3Array[4]+"  "+game3Array[5];
					} 

					myLotteryLayout.setGame1Label(game1);
					myLotteryLayout.setGame2Label(game2);
					myLotteryLayout.setGame3Label(game3);


					switch (count) {
					case 5:
					case 11:
						myLotteryLayout.EnableButtons();
						break;
					case 17:

						for(int i=0;i<6;i++) {
							resultNumbers += lotteryNumbers[i]+" ";
							lotteryResult = "The Lottery Winning Numbers are:  " + resultNumbers;
							myLotteryLayout.setLotteryResultLabel(lotteryResult);
						}
						
						guessedGame1 = new int[][] { lotteryNumbers, game1Array };
						guessedGame2 = new int[][] { lotteryNumbers, game2Array };
						guessedGame3 = new int[][] { lotteryNumbers, game3Array };

						myLotteryResults.setGuessedGame1(guessedGame1);
						myLotteryResults.setGuessedGame2(guessedGame2);
						myLotteryResults.setGuessedGame3(guessedGame3);
						myLotteryLayout.DisableButtons();
						myLotteryResults.compute();

						myLotteryLayout.setFinalResult1Label(myLotteryResults.getGame1FinalResult());
						myLotteryLayout.setFinalResult2Label(myLotteryResults.getGame2FinalResult());
						myLotteryLayout.setFinalResult3Label(myLotteryResults.getGame3FinalResult());

						break;
					}
					count++;
				}
			});

		}

	}

	//set methods
	public void setLotteryNumbers(int[] lotteryNumbers){
		this.lotteryNumbers=lotteryNumbers;
	}


	//get methods
	public String getResultNumbers(){
		return resultNumbers;
	}

}