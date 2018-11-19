/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LotteryLayout {

	//Declare data members
	private JFrame frame;
	private JPanel panel;
	private final JLabel labelOne;
	private JLabel game1Label, game2Label, game3Label, lotteryResultLabel, lotteryFinalResult1Label, lotteryFinalResult2Label, lotteryFinalResult3Label;
	private JButton exitButton;
	private JButton[] buttons;
	private JButton playAgainButton; 

	
	public LotteryLayout() {
		frame = new JFrame("Lottery Game");
		panel = new JPanel();
		labelOne = new JLabel("Welcome to the Lottery Game - Choose Six numbers for Three games.");
		game1Label = new JLabel(" ");
		game2Label = new JLabel(" ");
		game3Label = new JLabel(" ");
		lotteryResultLabel = new JLabel(" ");
		lotteryFinalResult1Label = new JLabel(" ");
		lotteryFinalResult2Label = new JLabel(" ");
		lotteryFinalResult3Label = new JLabel(" ");
		exitButton = new JButton("Exit");
		buttons = new JButton[40];
		playAgainButton = new JButton("Play Again");

	}

	//compute
	public void compute() {
		
		playAgainButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				frame.dispose(); //destroy the previous frame
				LotteryGameApp.main(null);
			}
		});
		
		panel.setBounds(7,60,560,140);
		for(int i = 0; i < 40; i++) { //Create the buttons add the number and stores into the buttons array 
			buttons[i] = new JButton(Integer.toString(i+1));
			buttons[i].setPreferredSize(new Dimension(50, 30));
			panel.add(buttons[i]);
		}

		labelOne.setBounds(92,22,400,20);
		frame.add(labelOne);
		panel.setPreferredSize(new Dimension(580,186));
		frame.add(panel);
		game1Label.setBounds(13,215,186,20);
		frame.add(game1Label);
		game2Label.setBounds(202,215,186,20);
		frame.add(game2Label);
		game3Label.setBounds(394,215,186,20);
		frame.add(game3Label);		
		lotteryResultLabel.setBounds(140,265,500,20);
		frame.add(lotteryResultLabel);
		lotteryFinalResult1Label.setBounds(13,315,500,20);
		frame.add(lotteryFinalResult1Label);
		lotteryFinalResult2Label.setBounds(13,335,500,20);
		frame.add(lotteryFinalResult2Label);
		lotteryFinalResult3Label.setBounds(13,355,500,20);
		frame.add(lotteryFinalResult3Label);	

		playAgainButton.setPreferredSize(new Dimension(180,30));

		playAgainButton.setBounds(95,410,186,40);
		frame.add(playAgainButton);
		exitButton.setPreferredSize(new Dimension(180,30));
		exitButton.setBounds(295,410,188,40);
		frame.add(exitButton);
		exitButton.addActionListener(e -> System.exit(0));
		frame.setSize(580,510);
		frame.setLocation(435, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	//setters
	public void setGame1Label(String game1) {
		this.game1Label.setText(game1);
	}
	public void setGame2Label(String game2) {
		this.game2Label.setText(game2);
	}
	public void setGame3Label(String game3) {
		this.game3Label.setText(game3);
	}
	public void setLotteryResultLabel(String lotteryResult) {
		this.lotteryResultLabel.setText(lotteryResult);
	}
	public void setFinalResult1Label(String finalResult1) {
		this.lotteryFinalResult1Label.setText(finalResult1);
	}
	public void setFinalResult2Label(String finalResult2) {
		this.lotteryFinalResult2Label.setText(finalResult2);
	}
	public void setFinalResult3Label(String finalResult3) {
		this.lotteryFinalResult3Label.setText(finalResult3);
	}
	
	//getters
	public JButton[] getButtons() {
		return buttons;
	}
	public JButton getPlayAgainButton() {
		return playAgainButton;
	}
	
	//other 	
	public void DisableButtons() {
		for (int j=0;j<buttons.length;j++) {
			buttons[j].setEnabled (false);
		}
	}
	
	public void EnableButtons() {
		for (int j=0;j<buttons.length;j++) {
			buttons[j].setEnabled (true);
		}
	}

}