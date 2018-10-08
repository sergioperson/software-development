/*
Pay.java
S Rodriguez
10/08/2018
*/

public class Pay{

	//declare variables
	private double basicPayRate;
	private final double OVERTIMERATE;
	private double basicHoursPerWeek;
	private double overTimeHoursPerWeek;
	private double basicPayWeek;
	private double payOverTime;
	private double totalPay;

	//constructor
	public Pay(){
		basicPayRate=0.0;
		OVERTIMERATE=1.5;
		basicHoursPerWeek=0;
		overTimeHoursPerWeek=0;
		basicPayWeek=0;
		payOverTime=0;
		totalPay=0;
	}

	//setters
	public void setBasicPayRate(double basicPayRate){
		this.basicPayRate=basicPayRate;
	}
	public void setBasicHoursPerWeek(double basicHoursPerWeek){
		this.basicHoursPerWeek=basicHoursPerWeek;
	}
	public void setOverTimeHoursPerWeek(double overTimeHoursPerWeek){
		this.overTimeHoursPerWeek=overTimeHoursPerWeek;
	}

	//process
	public void compute(){
		basicPayWeek=basicHoursPerWeek*basicPayRate;
		payOverTime=(basicPayRate*OVERTIMERATE)*overTimeHoursPerWeek;
		totalPay=basicPayWeek+payOverTime;
	}

	//output
	public double getBasicPayWeek(){
		return basicPayWeek;
	}

	public double getPayOverTime(){
		return payOverTime;
	}

	public double getTotalPay(){
		return totalPay;
	}


}