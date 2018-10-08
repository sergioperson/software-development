/*
ShippingRate.java
S Rodriguez
10/06/2018
*/

public class ShippingRate{

	//declare variables
	private final double RATE;
	private double purchaseValue,result;

	//constructor
	public ShippingRate(){
	RATE=15;
	}

	//Setters
	public void setPurchaseValue(double purchaseValue){
	this.purchaseValue=purchaseValue;
	}

	//Calculate
	public void Calculate(){
		if(purchaseValue>=100){
			result=purchaseValue;
		}else{
			result=purchaseValue+15;
		}
	}

	//Output
	public double getResult(){
		return result;
	}

}