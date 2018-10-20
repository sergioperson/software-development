/*
ServiceDay.java
S. Rodriguez
October 20 2018
*/

public class ServiceDay {

	//declare variables
	private String service;
	private String location;
	private String serviceDay;

	//constructor
	public ServiceDay(){
		service="";
		location="";
		serviceDay="";
	}

	//setters
	public void setService(String service){
		this.service=service;
	}
	public void setLocation(String location){
		this.location=location;
	}

	//process
	public void compute(){

		switch(service){

			case "full":
				if(location.equals("blanchardstown")){
					serviceDay="Monday";
				}else if(location.equals("stillorgan")){
					serviceDay="Tuesday";
				}else{
					serviceDay="Invalid Location";
				}
			break;
			case "interim":
				if(location.equals("blanchardstown")){
					serviceDay="Wednesday";
				}else if(location.equals("stillorgan")){
					serviceDay="Thursday";
				}else{
					serviceDay="Invalid Location";
				}
			break;
			case "pre-nct":
				if(location.equals("blanchardstown")){
					serviceDay.equals("Friday");
				}else if(location.equals("stillorgan")){
					serviceDay="Saturday";
				}else{
					serviceDay="Invalid Location";
				}
			break;
			default:
				serviceDay="Invalid Service";
			break;
		}
	}

	//output
	public String getServiceDay(){
		return serviceDay;
	}

}