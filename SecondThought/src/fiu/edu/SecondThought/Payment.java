/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 * create 'Payment' class store payment information
 */
	public class Payment {
		//variable declaration
		private String paymentMethod;
		
		//create constructor
		public Payment(String paymentMethod) {
			this.paymentMethod=paymentMethod;
		}
		
		//return payment method
		public String passPaymenttoprocessor() {
			return paymentMethod;
		}
}
