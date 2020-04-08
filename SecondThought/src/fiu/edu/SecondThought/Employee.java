/**
 * 
 */
package fiu.edu.SecondThought;

import java.util.Scanner;

/**
 * @author simon
 *
 */
public class Employee {
	
	private String companyName;
	private String employeeEmail;
	
	public void giveReview() {
		
		Scanner myReivew = new Scanner(System.in);  
		String Review;
		
		 // Enter review and press Enter
	    System.out.print("Enter Review: "); 
	    Review = myReivew.nextLine();
	    
		System.out.println("Employee Review is: " + Review);
	}

}
