/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'Guest' class store guest information
 */
public class Guest {
	
	//variable declaration
	private String guestEmail;
		
	//create constructor
	public Guest(String guestEmail) {
		this.guestEmail=guestEmail;
	}
		
	//return guest email
	public String getstatus() {
		return "Guest Access, Guest email is: " + guestEmail;
		}
}
