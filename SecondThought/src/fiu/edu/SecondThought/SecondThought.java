/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *
 */
class SecondThought {
	/**
	 * @param args SecondThought Application to run the result for each class	 * 
	 * In a main class 
	 * create a section for each class information
	 * create a new object for each class
	 * call subclass method from superclass
	 * print the necessary information
	 */
	
	public void getReview() {
		//method to return review
		System.out.println("Employee review is:");
	}
	
	public void showUserPost() {
		//method to return User Post
		System.out.println("User Post is:");
	}
		
	public void showConpanyReport() {
		//method to return company report
		System.out.println("This is the company report:");
	}
	
	public void likePost() {
		//method to return like this post
		System.out.println("Which post does user like? ");
	}
	
	public void sharePost() {
		//method to return share this post
		System.out.println("Which post does user want to share? ");
	}
	
	public void commentPost() {
		//method to return leave comment to the post
		System.out.println("Which post does user want to leave comment? ");
	}
	
	public void subscribeCompany() {
		//method to return subscribe company
		System.out.println("Which company do you want to subscribe? ");
	}

	public void unsubscribeCompany() {
		//method to return unsubscribe company
		System.out.println("Which company do you want to unsubscribe? ");
	}
	
	public void validateUserType() {
		//method to return validate user type
		System.out.println("Is user administrator: ");
	}
	
	public void getUserSetting() {
		//method to return user setting
		System.out.println("User Setting");
	}
	
	public void search() {
		//method to return search company
		System.out.println("Which company do you want to search? ");
	}
	
	public void getFeed() {
		//method to return company feed		
		System.out.println("Feedback? ");
	}
	
	public void showPopUpMessage() {
		//return the method to show whether the post is successful or not.
		System.out.println("Post Confirmation ");
	}



	public static void main(String[] args) {
		
		System.out.println("This is SecondThought Application \n");
		//create myEmp object
		Employee myEmp = new Employee();
			
		// Call the getReview() method (from the SecondThought class) on the myEmp object
		myEmp.getReview();
			
		// Display the value of the review attribute (from the Employee class) and getReview() method from the SecondThought class
		System.out.println(myEmp.giveReview()+"\n");
		
		UserPost myUP = new UserPost();
		myUP.showUserPost();
		System.out.println(myUP.reviewPost()+"\n ");	
		
		CompanyReport myCR = new CompanyReport("FIU", "Analytics", "Daily Activity", true, false, false);
		myCR.showConpanyReport();
		System.out.println(myCR.preformAnalytics()+"\n");
		
		UserPost myLP = new UserPost();
		myLP.likePost();
		System.out.println(myLP.addPost()+"\n");   
		
		UserPost mySP = new UserPost();
		mySP.sharePost();
		System.out.println(mySP.editPost()+"\n");
		
		UserPost myCP = new UserPost();
		myCP.commentPost();
		System.out.println(myCP.deletePost()+"\n");
		
		Company mysc = new Company();
		mysc.subscribeCompany();
		System.out.println(mysc.subscribeReport()+"\n");
		
		Company mync = new Company();
		mync.unsubscribeCompany();
		System.out.println(mync.getReport()+"\n");
		
		Employee myEmp1 = new Employee();
		myEmp1.validateUserType();
		System.out.println(" "+myEmp.getStatus()+"\n");
		
		UserSetting mysetting = new UserSetting("dog", "black", "myPicture");
		mysetting.getUserSetting();
		System.out.println(mysetting.createDashboard() +"\n");
		
		Company mySearch = new Company();
		mySearch.search();
		System.out.println(" "+mySearch.getReport()+ "\n");
		
		Review myReview = new Review();
		myReview.getFeed();
		System.out.println(" " + myReview.comment()+"\n");
		
		User myuser = new User();
		myuser.showPopUpMessage();
		System.out.println(" " +myuser.socialMediaLogin());
		
		}
	}








