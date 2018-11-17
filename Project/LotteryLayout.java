/*
 * LotteryGameApp.java
 * S. Rodriguez
 * Nov. 16 2018
 */

import java.awt.BorderLayout;
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
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
	private final JLabel labelOne;
	private JLabel game1Label, game2Label, game3Label, lotteryResultLabel, lotteryFinalResult1Label, lotteryFinalResult2Label, lotteryFinalResult3Label;
	private JButton playAgainButton, exitButton;
	private JButton[] buttons;

	public LotteryLayout() {

		frame = new JFrame();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		labelOne = new JLabel("Welcome to the Lottery Game - Choose Six numbers for Three games.");
		game1Label = new JLabel(" ");
		game2Label = new JLabel(" ");
		game3Label = new JLabel(" ");
		lotteryResultLabel = new JLabel(" ");
		lotteryFinalResult1Label = new JLabel(" ");
		lotteryFinalResult2Label = new JLabel(" ");
		lotteryFinalResult3Label = new JLabel(" ");
		playAgainButton = new JButton();
		exitButton = new JButton();
		buttons = new JButton[40];

		playAgainButton.setLayout(null);
		playAgainButton.setLocation(600, 600);
		exitButton.setLayout(null);
		exitButton.setLocation(800, 600);
		panel1.setPreferredSize(new Dimension(580, 360)); //Set the dimension for each panel
		panel2.setPreferredSize(new Dimension(580, 360));
		panel3.setPreferredSize(new Dimension(580, 360));
		panel4.setPreferredSize(new Dimension(580, 360));
		panel5.setPreferredSize(new Dimension(580, 360));
		panel6.setPreferredSize(new Dimension(580, 360));
		panel7.setPreferredSize(new Dimension(580, 360));

		for(int i = 0; i < 40; i++) { //Create the buttons add the number and stores into the buttons array 
			buttons[i] = new JButton(Integer.toString(i+1));
			buttons[i].setPreferredSize(new Dimension(50, 30));
			panel2.add(buttons[i]);
		}

		playAgainButton = new JButton("Play Again");

		playAgainButton.setPreferredSize(new Dimension(180, 30));
		playAgainButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //destroy the previous frame
				LotteryGameApp.main(null);
			}
		});
		exitButton = new JButton("Exit");
		exitButton.setPreferredSize(new Dimension(180, 30));

		panel1.add(labelOne);
		frame.add(panel1);
		panel1.add(panel2);
		panel3.add(game1Label);
		panel3.add(game2Label);
		panel3.add(game3Label);
		panel2.add(panel3);
		
		panel4.add(lotteryResultLabel);
		panel3.add(panel4);
		panel5.add(lotteryFinalResult1Label);
		panel4.add(panel5);
		panel6.add(lotteryFinalResult2Label);
		panel5.add(panel6);
		panel7.add(lotteryFinalResult3Label);
		panel6.add(panel7);
		
		panel8.add(playAgainButton,BorderLayout.SOUTH);
		panel8.add(exitButton,BorderLayout.SOUTH);
		exitButton.addActionListener(e -> System.exit(0));
		panel7.add(panel8);
		
		frame.setLocation(435, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
		frame.setResizable(false);
		frame.pack();
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