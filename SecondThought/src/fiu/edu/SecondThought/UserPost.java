/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'UserPost' class to store user post
 */
public class UserPost extends SecondThought{
	//Variable declaration
	private String Postid;
	private String Postdescription;
	private String Postuserid;
	
	//return post to add. 
	public String addPost() {
		Postid= "#1";
		return " " + Postid;
	}
	
	//return post to edit. 
	public String editPost() {
		Postid = "#3";
		return " "+ Postid;
	}
	
	//return post to delete. 
	public String deletePost() {
		Postid = "#15";
		return " " + Postid;
	}
	
	//return post to review. 
	public String reviewPost() {
		Postdescription= "This is a interesting post";
		return Postdescription;
	}


}