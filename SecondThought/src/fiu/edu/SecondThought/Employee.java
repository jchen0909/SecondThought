/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *create a 'Employee' class store employee information
 */
public class Employee extends SecondThought{
	// variable declaration 
	protected String companyId = "1";
	protected String companyName = "FIU";
	protected String review = "This is a good company";
	protected String employeeEmail = "jchen122@fiu.edu";
	protected String status = "Activated";
	protected boolean IsCompanyAdministrator;
	
	
	//return review
	public String giveReview() {
		return review;
	}

	//return company id
	public String getCompanyID() {
		return companyId;
	}
	
	//return company name
	public String getcampanyName(){
		return companyName;
	    }
	
	//return status
	public boolean getStatus() {
		IsCompanyAdministrator = true;
		return IsCompanyAdministrator;
	}
	
	//return employee email
	public String getEmployeeEmail() {
		return employeeEmail;
	}


}
