/*
 *RockPaperScissors.java
 *@author Frances Sheridan
 *5th Nov 2012
 */

 public class RockPaperScissors{
	 private String player1;
	 private int player2;
	 private String winner;

	 public RockPaperScissors(){
		 player1 = new String();
		 player2 = 0;
		 winner = new String();
	 }

	 public void setPlayer1(String player1){
		 this.player1 = player1;
	 }

	 public void compute(){

		 player2 = (int)(Math.random()*3)+1;

		 if(player1.equalsIgnoreCase("Rock")){
			 if(player2 == 1){
				 winner = "draw";
			 }
			 else if(player2 == 2){
				 winner = "Player 2";
			 }
			 else{
				 winner = "Player 1";
			 }
		 }
		 else if(player1.equalsIgnoreCase("Paper")){
			 if(player2 == 1){
			 	 winner = "Player 1";
			 }
			 else if(player2 == 2){
			 	 winner = "draw";
			 }
			 else{
			 	 winner = "Player 2";
			 }
		 }
		 else if(player1.equalsIgnoreCase("Scissors")){
			 if(player2 == 1){
			 	 winner = "Player 2";
			 }
			 else if(player2 == 2){
			 	 winner = "Player 1";
			 }
			 else{
			 	 winner = "draw";
			 }
		 }
		 else{
			 winner = "Sorry, you have enered an invalid option.";
		 }
	 }


	 public String getWinner(){
		 return winner;
	 }
	 public int getPlayer2(){
	 	 return player2;
	 }
 }
