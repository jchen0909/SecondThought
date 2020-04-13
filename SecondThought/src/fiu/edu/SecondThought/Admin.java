/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class Admin {
	
	private String adminLevel;
	
	public Admin(String adminLevel) {
		this.adminLevel=adminLevel;
	}
	
	public String getAccesslevel() {
		return adminLevel;
	}
	
	public String approveRegistration() {
		return "Company approved";
	}
	
	public String manageCompanyquestions() {
		return "Campany has 20 questions";
	}
	
	public String manageSocialmedia() {
		return "Social media available";
	}
}
