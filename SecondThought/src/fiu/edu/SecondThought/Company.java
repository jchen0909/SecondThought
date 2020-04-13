/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class Company {
	private String companyID;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String website;
	private boolean IsPremium;
	
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
	
	public String getReport() {
		return companyID + " " +companyName+ " " + address + "," +city+ "," + state+ " "+ country+ "," + website;
	}
	
	public String subscribeReport() {
		return "subscribe company report";
	}
	
	public String advertiseCompany() {
		return "advertise company";
	}
	
	public String register() {
		return "register";
	}
}
