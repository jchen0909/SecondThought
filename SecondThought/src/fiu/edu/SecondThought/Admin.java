/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 * create a class called 'Admin' that has all the function.
 *
 */
public class Admin {
	//variable declaration 
	private String adminLevel;       
	
	//create constructor
	public Admin(String adminLevel) { 
		this.adminLevel=adminLevel;
	}
	
	public String getAccesslevel() {
		//create the getAccesslevel method and return access level for admin
		return adminLevel;
	}
	
	public String approveRegistration() {
		//create the approveRegistration method and return whether company is been approved
		return "Company approved";
	}
	
	public String manageCompanyquestions() {
		//create manageCompanyquestion method and return the number for company questions
		return "Campany has 20 questions";
	}
	
	public String manageSocialmedia() {
		//create the manageSocialmedia function to return the social media integration 
		return "Social media available";
	}
}
