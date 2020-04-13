/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class UserPost {
		
	private String Postid;
	private String Postdescription;
	private String Postuserid;
	
	public UserPost(String Postid, String Postdescription, String Postuserid) {
		this.Postid=Postid;
		this.Postdescription=Postdescription;
		this.Postuserid=Postuserid;
	}
	
	public String addPost() {
		Postid = "2";
		Postdescription= "This is a interesting post";
		Postuserid = "4";
		return Postid + "\n Post Description: "+ Postdescription + "\n Post User ID: "+ Postuserid;
	}
	
	public String editPost() {
		Postid = "3";
		return Postid;
	}
	
	public String deletePost() {
		Postid = "15";
		return Postid;
	}
	
	public String reviewPost() {
		Postid = "12";
		return Postid;
	}
}
