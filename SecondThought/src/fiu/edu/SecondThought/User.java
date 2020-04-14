/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *create a 'User' class store all the user information
 */
public class User {
	//variable declaration
	private String userId;
	private String password;
	private String email;
	private boolean isPremiummember;
	private boolean isAnomymous;
	private String displayName;
	
	//create constructor
	public User(String userId, String password, String email, boolean isPremiummember, boolean isAnomymous, String displayName) {
		this.userId=userId;
		this.password=password;
		this.email=email;
		this.isPremiummember=isPremiummember;
		this.isAnomymous=isAnomymous;
		this.displayName=displayName;
	}
	
	//return userid, password, email information to signup 
	public String signUp() {
		return  "UserID: " + userId +  "\t" + "Password: "+ password + "\t" + "E-mail: " + email;
	}
	
	//return forget password
	public String forgetPassword() {
		return "click here to reset password";
	}
	
	//return forget user id
	public String forgetUserid() {
		return "click here to reset user id";
	}
	
	//return user contact information 
	public String getPreferredcontact() {
		return "contect info is: 786-448-2828";
	}
	
	//return user login authentication 
	public String Authentication() {
		return "log in successfull";
	}
	
	//return user payment status
	public String getPaymentstatus() {
		return "payment received";
	}
	
	//return user log out
	public String Logout() {
		return "Exit";
	}

}
