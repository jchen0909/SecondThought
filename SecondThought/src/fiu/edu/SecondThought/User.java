/**
 * 
 */
package fiu.edu.SecondThought;

import java.util.Scanner;

/**
 * @author simon
 *
 */
public class User {
	
	private String userId;
	private String password;
	private String email;
	private boolean isPremiummember;
	private boolean isAnomymous;
	private String displayName;
	
	public User(String userId, String password, String email, boolean isPremiummember, boolean isAnomymous, String displayName) {
		this.userId=userId;
		this.password=password;
		this.email=email;
		this.isPremiummember=isPremiummember;
		this.isAnomymous=isAnomymous;
		this.displayName=displayName;
	}
	public String signUp() {
		return  "UserID: " + userId +  "\t" + "Password: "+ password + "\t" + "E-mail: " + email;
	}
	
	public String forgetPassword() {
		return "click here to reset password";
	}
	
	public String forgetUserid() {
		return "click here to reset user id";
	}
	
	public String getPreferredcontact() {
		return "contect info is: 786-448-2828";
	}
	
	public String Authentication() {
		return "log in successfull";
	}
	
	public String getPaymentstatus() {
		return "payment received";
	}
	
	public String Logout() {
		return "Exit";
	}

}
