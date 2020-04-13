/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class SocialMediaReview {
	
	private String socialMediatype;
	private String companyName;
	
	public SocialMediaReview(String socialMediatype, String companyName) {
		this.socialMediatype=socialMediatype;
		this.companyName=companyName;
	}
	
	
	public String APIconnect() {
		socialMediatype= "Facebook, Instagram";
		return socialMediatype + " Connected";
	}
	
	public String getReviews() {
		companyName = "FIU";
		return companyName;
	}
	
	public String analizeReviews() {
		companyName = "FIU";
		return companyName;
	}
}
