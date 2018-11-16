
//3 numbers  €100
//4 numbers	€250
//5 numbers	€1,000
//6 numbers	Won the Lottery

/*At the end of a game, the game should display the amount of numbers guessed correctly on each line played. Once a game has finished, 
 * the application asks the player if he/she would like to play another game. At the end of all the games, display a history of all 
 * games played. The history shows for each game the number of lines played and the number of lines won and the total winnings. All 
 * the history elements of the game should be coded using arrays.
 */

public class LotteryResults {
	
	//declare variables
	private int[][] guessedGame1 = new int[2][6];
	private int[][] guessedGame2 = new int[2][6];
	private int[][] guessedGame3 = new int[2][6];
	private int game1Guessed, game2Guessed, game3Guessed;
	
	//constructor
	public LotteryResults() {
		game1Guessed = 0;
		game2Guessed = 0;
		game3Guessed = 0;

	}
	
	//set method
	public void setGuessedGame1(int[][] guessedGame1) {
		this.guessedGame1=guessedGame1;
	}
	
	public void setGuessedGame2(int[][] guessedGame2) {
		this.guessedGame2=guessedGame2;
	}
	
	public void setGuessedGame3(int[][] guessedGame3) {
		this.guessedGame3=guessedGame3;
	}
	
	//compute method
	public void compute() {
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if((guessedGame1[0][i])==(guessedGame1[1][j])) {
					game1Guessed+=1;
				}
				if((guessedGame2[0][i])==(guessedGame2[1][j])) {
					game2Guessed+=1;
				}
				if((guessedGame3[0][i])==(guessedGame3[1][j])) {
					game3Guessed+=1;
				}
			}
		}
		
		//System.out.println(guessedGame1[1][1]);
		//System.out.println(guessedGame1[1][2]);
		//System.out.println(guessedGame1[0][1]);
		//System.out.println(guessedGame1[0][0]);
		
		//3 numbers  €100
		//4 numbers	€250
		//5 numbers	€1,000
		//6 numbers	Won the Lottery
		
		System.out.println("You guessed " + game1Guessed + " numbers on game One.");
		System.out.println("You guessed " + game2Guessed + " numbers on game Two.");
		System.out.println("You guessed " + game3Guessed + " numbers on game Three.");
		
		if(game1Guessed==3) {
			System.out.println("You got €100 on game One.");
		} else if (game1Guessed==4) {
			System.out.println("You got €250 on game One.");
		} else if (game1Guessed==5) {
			System.out.println("You got €1,000 on game One.");
		} else if (game1Guessed==6) {
			System.out.println("YOU WON THE LOTTERY ON GAME ONE!!!");
		}
		
		if(game2Guessed==3) {
			System.out.println("You got €100 on game Two.");
		} else if (game2Guessed==4) {
			System.out.println("You got €250 on game Two.");
		} else if (game2Guessed==5) {
			System.out.println("You got €1,000 on game Two.");
		} else if (game2Guessed==6) {
			System.out.println("YOU WON THE LOTTERY ON GAME TWO!!!");
		}
		
		if(game3Guessed==3) {
			System.out.println("You got €100 on game Three.");
		} else if (game3Guessed==4) {
			System.out.println("You got €250 on game Three.");
		} else if (game3Guessed==5) {
			System.out.println("You got €1,000 on game Three.");
		} else if (game3Guessed==6) {
			System.out.println("YOU WON THE LOTTERY ON GAME THREE!!!");
		}
		
	}
	
	//get method
	
}
