/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *create a 'Employee' class store employee information
 */
public class Employee {
	// variable declaration 
	private int companyId;
	private String companyName;
	private String review;
	private String employeeEmail;
	private String status;
	private boolean IsCompanyAdministrator;
	
	//create constructor
	public Employee (int companyId, String companyName, String employeeEmail, String status, String review){
		this.companyId=companyId;
		this.review=review;
		this.companyName=companyName;
		this.status=status;
		this.employeeEmail=employeeEmail;
	 }
	
	//return review
	public String giveReview() {
		return review;
	}

	//return company id
	public int getCompanyID() {
		return companyId;
	}
	
	//return company name
	public String getcampanyName(){
		return companyName;
	    }
	
	//return status
	public String getStatus() {
		return status;
	}
	
	//return employee email
	public String getEmployeeEmail() {
		return employeeEmail;
	}
}
