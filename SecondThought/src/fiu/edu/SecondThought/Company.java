/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create a 'Company' class that store the company information
 */
public class Company {
	//variable declaration 
	private String companyID; 
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String website;
	private boolean IsPremium;
	
	//create constructor
	public Company(String companyID, String companyName, String address, String city, String state,String country, String website, Boolean IsPremium) {
		this.companyID=companyID;
		this.companyName=companyName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.country=country;
		this.website=website;
		this.IsPremium=IsPremium;
	}
	
	//return the Report for company
	public String getReport() {
		return companyID + " " +companyName+ " " + address + "," +city+ "," + state+ " "+ country+ "," + website;
	}
	
	//return subscribe report
	public String subscribeReport() {
		return "subscribe company report";
	}
	//return advertise company 
	public String advertiseCompany() {
		return "advertise company";
	}
	//return register
	public String register() {
		return "register";
	}
}
