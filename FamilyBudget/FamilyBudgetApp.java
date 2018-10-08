import java.util.Scanner;
public class FamilyBudgetApp{

	public static void main(String[] args){

	//declare variables
	double electricityBill,waterBill,phoneBill,school,creditCard,superMarket;

	//declare objects
	Scanner scan=new Scanner(System.in);
	FamilyBudget budget=new FamilyBudget();

	//input values
	System.out.print("Electricity bill: ");
	electricityBill=scan.nextDouble();

	System.out.print("Water bill: ");
	waterBill=scan.nextDouble();

	System.out.print("Phone bill: ");
	phoneBill=scan.nextDouble();

	System.out.print("School : ");
	school=scan.nextDouble();

	System.out.print("Credit card: ");
	creditCard=scan.nextDouble();

	System.out.print("Super market: ");
	superMarket=scan.nextDouble();

	//set values
	budget.setElectricityBill(electricityBill);
	budget.setWaterBill(waterBill);
	budget.setPhoneBill(phoneBill);
	budget.setSchool(school);
	budget.setCreditCard(creditCard);
	budget.setSuperMarket(superMarket);

	//execute
	budget.calculate();

	//output
	System.out.println("The amount is: " + budget.getResult());

	}
}