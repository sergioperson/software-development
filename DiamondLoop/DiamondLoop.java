/*
DiamondLoop.java
S. Rodriguez
October 22 2018
*/

import java.util.Scanner;
public class DiamondLoop{

	public static void main(String[] args){

		String str1 = "*";
		String str2 = " ";
		String line = "  *  ";
		boolean down = true;
		int diamonds = 1;
		int diamondLines = 4;
		Scanner scan = new Scanner(System.in);

		while(diamonds != 0){

			System.out.print("How many diamonds you want? ");
			diamonds = scan.nextInt();

			diamondLines = diamondLines * diamonds + 1;

			if(diamonds == 0){
				line = "";
			}

			for(int i = 0; i < diamondLines; i++){

				System.out.print(line);

				if(line.equals("  *  ")){
					line = str2 + str1 + str2 + str1 + str2;
				}else if((line.equals(" * * "))&&(down == true)) {
					line = str1 + str2 + str2 + str2 + str1;
					down = !down;
				}else if((line.equals(" * * "))&&(down == false)) {
					line = str2 + str2 + str1 + str2 + str2;
					down = !down;
				}else if(line.equals("*   *")) {
					line = str2 + str1 + str2 + str1 + str2;
				}
			System.out.println();
			}

			diamondLines = 4;
			line = "  *  ";

		}

	}
}


