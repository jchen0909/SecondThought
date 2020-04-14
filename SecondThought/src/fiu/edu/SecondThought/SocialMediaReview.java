/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'SocialMediaReview' class store all the review in social media
 */
public class SocialMediaReview {
	// variable declaration 
	private String socialMediatype;
	private String companyName;
	
	//create constructor
	public SocialMediaReview(String socialMediatype, String companyName) {
		this.socialMediatype=socialMediatype;
		this.companyName=companyName;
	}
	
	//return social media type for connection
	public String APIconnect() {
		socialMediatype= "Facebook, Instagram";
		return socialMediatype + " Connected";
	}
	
	//return the company name to get review
	public String getReviews() {
		companyName = "FIU";
		return companyName;
	}
	
	//return the company name to analyze review
	public String analizeReviews() {
		companyName = "FIU";
		return companyName;
	}
}
