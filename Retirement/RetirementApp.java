import java.util.Scanner;
public class RetirementApp{

	public static void main(String[] args){

	//declare variables
	int age;
	int yearsOfContribution;

	//declare objects
	Scanner scan=new Scanner(System.in);
	Retirement retirement=new Retirement();

	//input data
	System.out.print("Age: ");
	age=scan.nextInt();
	System.out.print("Years of contribution: ");
	yearsOfContribution=scan.nextInt();

	//set values
	retirement.setAge(age);
	retirement.setYearsOfContribution(yearsOfContribution);

	//process
	retirement.calculate();

	//output
	System.out.println(retirement.Result());

	}


}