/*
ServiceDayApp.java
S. Rodriguez
October 20 2018
*/

import javax.swing.JOptionPane;
public class ServiceDayApp{

	public static void main(String[] args){

	//declare variables;
	String service;
	String location;
	String serviceDay;

	//declare objects
	service="";
	location="";
	serviceDay="";
	ServiceDay myServiceDay;

	//create objects
	myServiceDay=new ServiceDay();

	//input
	service=JOptionPane.showInputDialog("Please type the service needed (full interim pre-nct): ");
	myServiceDay.setService(service);

	location=JOptionPane.showInputDialog("Please type the location (blanchardstown stillorgan): ");
	myServiceDay.setLocation(location);

	//process
	myServiceDay.compute();

	//output
	serviceDay=myServiceDay.getServiceDay();
	JOptionPane.showMessageDialog(null,"The service day is: "+serviceDay);

	}
}