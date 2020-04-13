/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *
 */
public class Employee {
	private int companyId;
	private String companyName;
	private String review;
	private String employeeEmail;
	private String status;
	private boolean IsCompanyAdministrator;
	
	public Employee (int companyId, String companyName, String employeeEmail, String status, String review){
		this.companyId=companyId;
		this.review=review;
		this.companyName=companyName;
		this.status=status;
		this.employeeEmail=employeeEmail;
	 }
	
	public String giveReview() {
		return review;
	}

	public int getCompanyID() {
		return companyId;
	}
	
	public String getcampanyName(){
		return companyName;
	    }
	
	public String getStatus() {
		return status;
	}
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}
}
