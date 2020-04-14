/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'UserPost' class to store user post
 */
public class UserPost {
	//Variable declaration
	private String Postid;
	private String Postdescription;
	private String Postuserid;
	
	//create constructor
	public UserPost(String Postid, String Postdescription, String Postuserid) {
		this.Postid=Postid;
		this.Postdescription=Postdescription;
		this.Postuserid=Postuserid;
	}
	
	//return post to add. 
	public String addPost() {
		Postid = "2";
		Postdescription= "This is a interesting post";
		Postuserid = "4";
		return Postid + "\n Post Description: "+ Postdescription + "\n Post User ID: "+ Postuserid;
	}
	
	//return post to edit. 
	public String editPost() {
		Postid = "3";
		return Postid;
	}
	
	//return post to delete. 
	public String deletePost() {
		Postid = "15";
		return Postid;
	}
	
	//return post to review. 
	public String reviewPost() {
		Postid = "12";
		return Postid;
	}
}
