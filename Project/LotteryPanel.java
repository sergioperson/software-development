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
	private JPanel panelOne = new JPanel();
	private JPanel panelTwo = new JPanel();
	private JPanel panelThree = new JPanel();
	private JPanel panelFour = new JPanel();
	private JPanel panelFive = new JPanel();
	private final JLabel labelOne = new JLabel("Welcome to the Lottery Game - Choose Six numbers for Three games.");
	private JLabel gameOneLabel = new JLabel();
	private JLabel gameTwoLabel = new JLabel();
	private JLabel gameThreeLabel = new JLabel();
	private String gameOne, gameTwo, gameThree = "";
	private JLabel result = new JLabel();
	private JButton resultButton, exitButton;
	private JButton[] buttons = new JButton[40];
	private final String numbers[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
			"22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40"};
	int[] games = new int[18];
	int count = 0;

	public LotteryPanel() {

		panelOne.setPreferredSize(new Dimension(560, 300));
		panelTwo.setPreferredSize(new Dimension(560, 300));
		panelThree.setPreferredSize(new Dimension(560, 300));
		panelFour.setPreferredSize(new Dimension(560, 300));


		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setPreferredSize(new Dimension(50, 30));
			buttons[i].setActionCommand(numbers[i]);
			panelTwo.add(buttons[i]);

			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String choice = e.getActionCommand();
					games[count]=Integer.parseInt(choice);
					if((count == 5)) {						
						gameOne = "  Game 1:  "+games[0]+"  "+games[1]+"  "+games[2]+"  "+games[3]+"  "+games[4]+"  "+games[5];	
						gameOneLabel.setText(gameOne); 		
					} 
					if (count == 11) { 
						gameTwo = "  Game 2: "+games[6]+"  "+games[7]+"  "+games[8]+"  "+games[9]+"  "+games[10]+"  "+games[11];
						gameTwoLabel.setText(gameTwo); 
					} 
					if (count == 17){ 
						gameThree = "  Game 3: "+games[12]+"  "+games[13]+"  "+games[14]+"  "+games[15]+"  "+games[16]+"  "+games[17];
						gameThreeLabel.setText(gameThree); 
						result.setText("The Lottery Numbers are 2 34 65 78 34.");
						JOptionPane.showMessageDialog(null, "Congratulations, you got 100 euro!!!");
					}
					count++;
				}
			});
			
			if(count==17) {
				System.out.println("NO MORE GAMES");
			}
		}

		resultButton = new JButton("Play Again");
		resultButton.setPreferredSize(new Dimension(180, 30));
		resultButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				LotteryPanel myUserDetail;
				myUserDetail = new LotteryPanel();
			}
		});
		exitButton = new JButton("Exit");
		exitButton.setPreferredSize(new Dimension(180, 30));

		panelOne.add(labelOne);
		frame.add(panelOne);
		panelOne.add(panelTwo);
		panelThree.add(resultButton);
		panelThree.add(exitButton, BorderLayout.LINE_END);
		exitButton.addActionListener(e -> System.exit(0));
		panelTwo.add(panelThree);
		panelFour.add(gameOneLabel);
		panelFour.add(gameTwoLabel);
		panelFour.add(gameThreeLabel);
		panelThree.add(panelFour);
		panelFive.add(result);
		panelFour.add(panelFive);
		frame.setLocation(435, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		LotteryPanel myUserDetail;
		myUserDetail = new LotteryPanel();

	}
}