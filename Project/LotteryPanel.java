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
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class LotteryPanel {

	private JFrame frame = new JFrame();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private final JLabel labelOne = new JLabel("Welcome to the Lottery Game - Choose Six numbers for Three games.");
	private JLabel game1Label = new JLabel();
	private JLabel game2Label = new JLabel();
	private JLabel game3Label = new JLabel();
	private JLabel result = new JLabel();
	private JButton resultButton, exitButton;
	private JButton[] buttons = new JButton[40];
	private final int buttonNumbers[]= new int[40];
	private int[] game1Array = new int[6];
	private int[] game2Array = new int[6];
	private int[] game3Array = new int[6];
	private int count = 0;
	private String game1, game2, game3, resultNumbers = "";
	private String[] lotteryNumbers = new String[40];

	//process
	public LotteryPanel() {

		for (int i=0;i<40;i++) { //build an array with the button numbers
			buttonNumbers[i]=i+1;		
		}

		panel1.setPreferredSize(new Dimension(560, 300));
		panel2.setPreferredSize(new Dimension(560, 300));
		panel3.setPreferredSize(new Dimension(560, 300));
		panel4.setPreferredSize(new Dimension(560, 300));

		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(buttonNumbers[i]));
			buttons[i].setPreferredSize(new Dimension(50, 30));
			buttons[i].setActionCommand(Integer.toString(buttonNumbers[i]));
			panel2.add(buttons[i]);

			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String choice = e.getActionCommand();
					
					int buttonNumber=Integer.parseInt(choice);
					buttons[buttonNumber-1].setEnabled (false);
					
					if(count<6) {					
						game1Array[count]=Integer.parseInt(choice);
						game1 = "  Game 1:  "+game1Array[0]+"  "+game1Array[1]+"  "+game1Array[2]+"  "+game1Array[3]+"  "+game1Array[4]+"  "+game1Array[5];	 
					} else if ((count>5)&&(count<12)) { 
						game2Array[count-6]=Integer.parseInt(choice);
						game2 = "  Game 2:  "+game2Array[0]+"  "+game2Array[1]+"  "+game2Array[2]+"  "+game2Array[3]+"  "+game2Array[4]+"  "+game2Array[5]; 
					} else if ((count>11)&&(count<18)){
						game3Array[count-12]=Integer.parseInt(choice);
						game3 = "  Game 3:  "+game3Array[0]+"  "+game3Array[1]+"  "+game3Array[2]+"  "+game3Array[3]+"  "+game3Array[4]+"  "+game3Array[5];
					} 
					
					switch (count) {
					case 5:
					case 11:
						EnableButtons();
						break;
					case 17:
						DisableButtons();
						for(int i=0;i<40;i++) {
							if(lotteryNumbers[i]!="") {
								resultNumbers += lotteryNumbers[i]+" ";
								result.setText("The Lottery Numbers are:  " + resultNumbers);
							}
						}
						game1Label.setText(game1);
						game2Label.setText(game2);
						game3Label.setText(game3);
						
						//RESULTADO
						JOptionPane.showMessageDialog(null, "Congratulations, you got 100 euro!!!");
						break;
					}
					count++;
				}
			});
			
		}
		

		resultButton = new JButton("Play Again");
		resultButton.setPreferredSize(new Dimension(180, 30));
		resultButton.addActionListener(new ActionListener() {

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
		panel3.add(resultButton);
		panel3.add(exitButton, BorderLayout.LINE_END);
		exitButton.addActionListener(e -> System.exit(0));
		panel2.add(panel3);
		panel4.add(game1Label);
		panel4.add(game2Label);
		panel4.add(game3Label);
		panel3.add(panel4);
		panel5.add(result);
		panel4.add(panel5);
		frame.setLocation(435, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
				
	}
	
	public void setLotteryNumbers(String[] lotteryNumbers){
		this.lotteryNumbers=lotteryNumbers;
	}
	
	
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