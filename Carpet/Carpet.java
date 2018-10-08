/*
Write a java class that declares variables to represent the length and the width
of a room in metres and the price of carpet per metre in euros. Assign appropriate
values to the variables. Compute and display the cost of carpeting the room.
Save the class as Carpet.java.
*/

class Carpet {

	public static void main (String args[]) {

		double roomLength;
		double roomWidth;
		double carpetPrice;
		double totalCost;

		roomLength=4.50;
		roomWidth=6.50;
		carpetPrice=5.20;
		totalCost=(roomLength*roomWidth)*carpetPrice;

		System.out.println("The price for carpeting the room is "+totalCost+" euros.");
	}
}