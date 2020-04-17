/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'SocialMediaReview' class store all the review in social media
 */
public class SocialMedia {
	// variable declaration 
	private String socialMediatype;
	private String companyName;
	
	//create constructor
	public SocialMedia(String socialMediatype, String companyName) {
		this.socialMediatype=socialMediatype;
		this.companyName=companyName;
	}
	
	//return social media type for connection
	public String APIconnect() {
		socialMediatype= "Facebook, Instagram";
		return socialMediatype + " Connected";
	}
	
	//return social media account information
	public String getUserSocialMediaAcct() {
		return "ID= \t  password=   ";
				
	}
}
