public class FamilyBudget{

	//declare variables
	private double electricityBill,waterBill,phoneBill,school,creditCard,superMarket,result;

	//constructor
	public FamilyBudget(){
		result=0;
	}

	//setters
	public void setElectricityBill(double electricityBill){
		this.electricityBill=electricityBill;
	}

	public void setWaterBill(double waterBill){
		this.waterBill=waterBill;
	}

	public void setPhoneBill(double phoneBill){
		this.phoneBill=phoneBill;
	}

	public void setSchool(double school){
		this.school=school;
	}

	public void setCreditCard(double creditCard){
		this.creditCard=creditCard;
	}

	public void setSuperMarket(double superMarket){
		this.superMarket=superMarket;
	}

	//process
	public void calculate(){
		result+=electricityBill;
		result+=waterBill;
		result+=phoneBill;
		result+=school;
		result+=creditCard;
		result+=superMarket;
	}

	//getters
	public double getResult(){
		return result;
	}



}