/*
Convert the carpet class to an interactive application.
Instead of assigning values to the length, width and price variables. accept them from
the user as input. Save the revised class as Carpet2.java.
*/
import java.util.Scanner;
class Carpet2 {

	public static void main (String args[]) {

		double roomLength;
		double roomWidth;
		double carpetPrice;
		double totalCost;

		Scanner scan = new Scanner(System.in);
		System.out.print("Room lenght in metre: ");
		roomLength=scan.nextDouble();
		System.out.print("Room width in metre: ");
		roomWidth=scan.nextDouble();
		System.out.print("Carpet price per metre in euros: ");
		carpetPrice=scan.nextDouble();

		totalCost=roomLength*roomWidth*carpetPrice;
		System.out.println("The price for carpeting the room is "+totalCost+" euros.");
	}
}