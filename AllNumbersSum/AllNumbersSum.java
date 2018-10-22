/*
*AllNumbersSum.java
*S. Rodriguez
*October 22 2018
*/

public class AllNumbersSum{

	//declare variables
	private int number;
	private int sum;

	//constructor
	public AllNumbersSum(){
		number=0;
		sum=0;
	}

	//setters
	public void setNumber(int number){
		this.number=number;
	}

	//process
	public void compute(){
		for(int i=0;i<=number;i++){
			sum+=i;
		}
	}

	//output
	public int getSum(){
		return sum;
	}

}