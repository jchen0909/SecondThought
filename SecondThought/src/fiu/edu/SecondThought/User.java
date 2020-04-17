/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *create a 'User' class store all the user information
 */
public class User extends SecondThought{
	//variable declaration
	private String userId;
	private String password;
	private String email;
	private boolean isPremiummember;
	private boolean isAnomymous;
	private String displayName;
	
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
	
	//return social media user id and password
	public String socialMediaLogin() {
		userId = "jchen122";
		password = "chen@!CH92";
		email = "chenjiusheng1992@gmail.com";
		return "UserID: " + userId +  "\n" + " Password: "+ password + "\n" + " E-mail: " + email;
	}

}
