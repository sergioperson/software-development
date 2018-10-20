/*
ServiceDay2.java
S. Rodriguez
October 20 2018
*/

public class ServiceDay2 {

	//declare variables
	private String service;
	private String location;
	private String serviceDay;

	//constructor
	public ServiceDay2(){
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

		if(service.equals("full")){

			if(location.equals("blanchardstown")){
				serviceDay="Monday";
			}else if(location.equals("stillorgan")){
				serviceDay="Tuesday";
			}else{
				serviceDay="Invalid Location";
			}

		}else if(service.equals("interim")){

			if(location.equals("blanchardstown")){
				serviceDay="Wednesday";
			}else if(location.equals("stillorgan")){
				serviceDay="Thursday";
			}else{
				serviceDay="Invalid Location";
			}

		}else if(service.equals("pre-nct")){

			if(location.equals("blanchardstown")){
				serviceDay.equals("Friday");
			}else if(location.equals("stillorgan")){
				serviceDay="Saturday";
			}else{
				serviceDay="Invalid Location";
			}

		}else{
			serviceDay="Invalid Service";
		}

	}

	//output
	public String getServiceDay2(){
		return serviceDay;
	}

}