
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SelectNumbers extends JFrame {

	static JPanel panel;
	int[] games = new int[18];
	int count = 0;


	public void SelectNumbers(){
		
		JButton[] buttons = new JButton[40];
		panel=new JPanel(new GridLayout(4,6));
		String numbers[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40"};

		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setSize(80, 80);
			buttons[i].setActionCommand(numbers[i]);
			buttons[i].addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {	
					String choice = e.getActionCommand();
					games[count]=Integer.parseInt(choice);
					if((count == 5)) {						
						JOptionPane.showMessageDialog(null, "You picked numbers: "+games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" Please OK to choose the next numbers.");
					} 
					if (count == 11) { 
						JOptionPane.showMessageDialog(null, "You picked numbers: "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]+" "+games[10]+" "+games[11]+" Please OK to choose the next numbers.");
					} 
					if (count == 17){ 
						JOptionPane.showMessageDialog(null, "You picked numbers: "+games[12]+" "+games[13]+" "+games[14]+" "+games[15]+" "+games[16]+" "+games[17]);
						System.exit(0);
					}
					count++;
				}
			});
			panel.add(buttons[i]);
			if(count==17) {

			}

		}


	}

	public static void main(String[] args){

		JOptionPane.showMessageDialog(null,"Please choose 6 numbers from the following box. Press OK to continue.");
		SelectNumbers numbersPanel=new SelectNumbers();
		numbersPanel.add(panel);
		numbersPanel.setVisible(true);    




		//input





	}

}


