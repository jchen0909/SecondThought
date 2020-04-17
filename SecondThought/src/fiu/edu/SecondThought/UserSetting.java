/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'UserSetting' class to store all user settings
 */
public class UserSetting extends SecondThought{
	//variable declaration
	private String theme;
	private String color;
	private String picture;
	
	//create constructor
	public UserSetting(String theme, String color, String picture) {
		this.theme=theme;
		this.color=color;
		this.picture=picture;
	}
	
	//return create dash board
	public String createDashboard() {
		return " Dashboard created: " + theme + " theme " + color + " color";
	}
	
	//return color 
	public String changeBackgroundcolor() {
		return color;
	}
	
	//return user change profile picture
	public void changeProfilepicture() {
		System.out.println("user change profile picture");
	}
	
	//return change general information
	public String changeGeneralinfomation() {
		return "User Infomation changed";
	}
	
	//return communication preference 
	public String communicationPreference() {
		return "Communication Preference changed";
	}
}
