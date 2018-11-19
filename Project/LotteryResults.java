/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

public class LotteryResults {
	
	//declare variables
	private int[][] guessedGame1, guessedGame2, guessedGame3;
	private int game1Guessed, game2Guessed, game3Guessed;
	private final String prize1, prize2, prize3, lotteryWin;
	private String game1FinalResult, game2FinalResult, game3FinalResult;
	
	//constructor
	public LotteryResults() {
		guessedGame1 = new int[2][6];
		guessedGame2 = new int[2][6];
		guessedGame3 = new int[2][6];
		game1Guessed = 0;
		game2Guessed = 0;
		game3Guessed = 0;
		prize1="€100";
		prize2="€250";
		prize3="€1,000";
		lotteryWin="$$$ YOU WON THE LOTTERY $$$";
		game1FinalResult = "";
		game2FinalResult = "";
		game3FinalResult = "";
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
		
		switch (game1Guessed) {
		case 3: game1FinalResult = "You guessed " + game1Guessed + " number(s) on game one and got " + prize1 + ".";
		break;
		case 4: game1FinalResult = "You guessed " + game1Guessed + " number(s) on game one and got " + prize2 + ".";
		break;
		case 5: game1FinalResult = "You guessed " + game1Guessed + " number(s) on game one and got " + prize3 + ".";
		break;
		case 6: game1FinalResult = "You guessed " + game1Guessed + " number(s) on game one. " + lotteryWin + ".";
		break;
		default: game1FinalResult = "You guessed " + game1Guessed + " number(s) on game one, better luck next time.";
		}
		
		switch (game2Guessed) {
		case 3: game2FinalResult = "You guessed " + game2Guessed + " number(s) on game two and got " + prize1 + ".";
		break;
		case 4: game2FinalResult = "You guessed " + game2Guessed + " number(s) on game two and got " + prize2 + ".";
		break;
		case 5: game2FinalResult = "You guessed " + game2Guessed + " number(s) on game two and got " + prize3 + ".";
		break;
		case 6: game2FinalResult = "You guessed " + game2Guessed + " number(s) on game two. " + lotteryWin + ".";
		break;
		default: game2FinalResult = "You guessed " + game2Guessed + " number(s) on game two, better luck next time.";
		}
		
		switch (game3Guessed) {
		case 3: game3FinalResult = "You guessed " + game3Guessed + " number(s) on game three and got " + prize1 + ".";
		break;
		case 4: game3FinalResult = "You guessed " + game3Guessed + " number(s) on game three and got " + prize2 + ".";
		break;
		case 5: game3FinalResult = "You guessed " + game3Guessed + " number(s) on game three and got " + prize3 + ".";
		break;
		case 6: game3FinalResult = "Game 3: You guessed " + game3Guessed + " number(s) on game three. " + lotteryWin + ".";
		break;
		default: game3FinalResult = "You guessed " + game3Guessed + " number(s) on game three, better luck next time.";
		}
		
	}
	
	//get method
	public String getGame1FinalResult(){
		return game1FinalResult;
	}
	public String getGame2FinalResult(){
		return game2FinalResult;
	}
	public String getGame3FinalResult(){
		return game3FinalResult;
	}
	
}
