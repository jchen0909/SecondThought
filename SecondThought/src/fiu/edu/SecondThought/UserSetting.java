/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class UserSetting {
	
	private String theme;
	private String color;
	private String picture;
	
	public UserSetting(String theme, String color, String picture) {
		this.theme=theme;
		this.color=color;
		this.picture=picture;
	}
	public String createDashboard() {
		return "Dashboard created";
	}
	
	public String changeBackgroundcolor() {
		return color;
	}
	
	public void changeProfilepicture() {
		System.out.println("user change profile picture");
	}
	
	public String changeGeneralinfomation() {
		return "Info changed";
	}
	
	public String communicationPreference() {
		return "Communication Preference changed";
	}
}
