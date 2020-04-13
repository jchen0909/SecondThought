/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class Guest {

	private String guestEmail;
		
	public Guest(String guestEmail) {
		this.guestEmail=guestEmail;
	}
		
		public String getstatus() {
			return "Guest Access, Guest email is: " + guestEmail;
		}
}
