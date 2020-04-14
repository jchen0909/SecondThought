/**
 * 
 */
package fiu.edu.SecondThought;
/**
 * @author simon
 *
 */
public class SecondThought {
	/**
	 * @param args 
	 * SecondThought Application to run the result for each class	 * 
	 * In a main class 
	 * create a section for each class information
	 * create a new object for each class
	 * call subclass method from superclass
	 * print the necessary information
	 */
	
	public void getReview() {
		//method to return review
	}
	
	public void showUserPost() {
		//method to return User Post
	}
	
	public void showSocialMediaReview() {
		//method to return show media review
	}
	
	public void showConpanyReport() {
		//method to return company report
	}
	
	public void likePost() {
		//method to return like this post
	}
	
	public void sharePost() {
		//method to return share this post
	}
	
	public void commentPost() {
		//method to return leave comment to the post
	}
	
	public void subscribeCompany() {
		//method to return subscribe company
	}

	public void unsubscribeCompany() {
		//method to return unsubscribe company 
	}
	
	public void validateUserType() {
		//method to return validate user type
	}
	
	public void getUserSetting() {
		//method to return user setting
	}
	
	public void search() {
		//method to return search company
	}
	
	public void getFeed() {
		//method to return company feed		
	}
	
	public static void main(String[] args) {
		//employee information 
		System.out.println("Employee Information");
		Employee mary;
		mary=new Employee(1, "FIU", "This is a good company", "Acitived", "jchen122@fiu.edu");
		System.out.println("\n Company ID: "+mary.getCompanyID() +
				"\n Company Name: "+mary.getcampanyName() +
				"\n Employee Review: "+mary.giveReview() +
				"\n Employee E-mail: "+mary.getEmployeeEmail() +
				"\n Employee Status: "+mary.getStatus());
		
		//user information
		System.out.println();
		System.out.println("User Information");
		User register;
		register = new User("1", "fiu1222DGX@I06", "chenjiusheng1992@gmail.com", true, true, null);
		System.out.println("\n SignUp: "+register.signUp()+
				"\n Forget Password: "+register.forgetPassword()+
				"\n Forget User ID: "+register.forgetUserid() +
				"\n Authentication: "+register.Authentication() +
				"\n Payment: "+register.getPaymentstatus()+
				"\n Logout: "+register.Logout());
		
		//admin information 
		System.out.println();
		System.out.println("Admin Information");
		Admin myAdmin;
		myAdmin = new Admin("High");
		System.out.println("\n Access level: " +myAdmin.getAccesslevel()+
				"\n Company Registration: " +myAdmin.approveRegistration()+
				"\n Company Questions: " +myAdmin.manageCompanyquestions()+
				"\n Social Media: " +myAdmin.manageSocialmedia());
		
		//company information
		System.out.println();
		System.out.println("Company Information");
		Company myCompany;
		myCompany = new Company("1", "FIU", "11200 SW 8th St", "Miami", "FL", "US", "www.fiu.edu", true);
		System.out.println("\n Company Report: " +myCompany.getReport()+
				"\n Subscribe Report: " +myCompany.subscribeReport()+
				"\n Advertise: " +myCompany.advertiseCompany()+
				"\n register: " +myCompany.register());
		
		//guest information
		System.out.println();
		System.out.println("Guest Information");
		Guest myGuest;
		myGuest = new Guest("sam@gmail.com");
		System.out.println("\n "+myGuest.getstatus());
		
		//company information
	    System.out.println();
		System.out.println("Company Question");
		Questionnaire myQues;
		myQues= new Questionnaire(true, true, true);
		System.out.println("\n Culture Question: "+ myQues.getCulturequestions()+
				"\n Moral Question: "+ myQues.getMoralquestions()+
				"\n Daily Activity Question: "+ myQues.getDailyactivityquestions());
		
		//review
		System.out.println();
		System.out.println("Review");
		Review myReview;
		myReview= new Review(null);
		System.out.println("\n Emoji Type: " + myReview.selectHappyemoji()+
				"\n Emoji Type: " + myReview.selectNeutralemoji()+
				"\n Emoji Type: " + myReview.SelectSademoji()+
				"\n " +myReview.comment());
	
		//social media review
		System.out.println();
		System.out.println("Social Media Review");
		SocialMediaReview mySMR;
		mySMR= new SocialMediaReview(null, null);
		System.out.println(" \n " +mySMR.APIconnect()+
				" \n Reevirw for " +mySMR.getReviews()+
				" \n Analize Review for " +mySMR.analizeReviews());
		
		//user post
		System.out.println();
		System.out.println("User Post");
		UserPost myPost;
		myPost = new UserPost(null, null, null);
		System.out.println("\n Post ID: "+ myPost.addPost()+
				"\n Edit Post: "+ myPost.editPost()+
				"\n Delete Post: "+ myPost.deletePost()+
				"\n Review Post: "+ myPost.reviewPost());
		
		//user setting
		System.out.println();
		System.out.println("User Setting");
		UserSetting mysetting;
		mysetting= new UserSetting(null, "Yellow", null);
		System.out.println("\n " +mysetting.createDashboard()+
				"\n Background color change to: " +mysetting.changeBackgroundcolor()+
				"\n " +mysetting.changeGeneralinfomation()+
				"\n " +mysetting.communicationPreference());
		
		//payment
		System.out.println();
		System.out.println("Payment");
		Payment myPayment;
		myPayment = new Payment("Visa");
		System.out.println("\n Payment Method: " +myPayment.passPaymenttoprocessor());
		
		//function role
		System.out.println();
		System.out.println("Function Role");
		FunctionRole myrole;
		myrole = new FunctionRole("1", "Analytics");
		System.out.println("\n Add Function Role -- " +myrole.addFunctionrole()+
				"\n Delete Function Role -- " +myrole.deleteFunctionrole()+
				"\n Rename Function Role -- " +myrole.renameFunctionrole());
		
		//company report
		System.out.println();
		System.out.println("Company Report");
		CompanyReport myreport;
		myreport = new CompanyReport("FIU", "Analytics", "Daily activity", true, true, true);
		System.out.println("\n Happy Emoji: " + myreport.countHappyemoji()+
				"\n Neutral Emoji: " + myreport.countNeutralemoji()+
				"\n Sad Emoji: " + myreport.countSademoji());
	}

}
