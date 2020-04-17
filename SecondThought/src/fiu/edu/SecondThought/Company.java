/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create a 'Company' class that store the company information
 */
public class Company extends SecondThought {
	//variable declaration 
	private String companyID; 
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String website;
	private boolean IsPremium;
		
	//return the Report for company
	public String getReport() {
		companyName="IBM";
		return " " + companyName;
	}
	
	//return subscribe report
	public String subscribeReport() {
		companyName="Google";
		return " " + companyName;
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
