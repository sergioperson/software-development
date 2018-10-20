/*
ServiceDayApp2.java
S. Rodriguez
October 20 2018
*/

import javax.swing.JOptionPane;
public class ServiceDayApp2{

	public static void main(String[] args){

	//declare variables;
	String service;
	String location;
	String serviceDay;

	//declare objects
	service="";
	location="";
	serviceDay="";
	ServiceDay2 myServiceDay2;

	//create objects
	myServiceDay2=new ServiceDay2();

	//input
	service=JOptionPane.showInputDialog("Please type the service needed (full interim pre-nct): ");
	myServiceDay2.setService(service);

	location=JOptionPane.showInputDialog("Please type the location (blanchardstown stillorgan): ");
	myServiceDay2.setLocation(location);

	//process
	myServiceDay2.compute();

	//output
	serviceDay=myServiceDay2.getServiceDay2();
	JOptionPane.showMessageDialog(null,"The service day is: "+serviceDay);

	}
}