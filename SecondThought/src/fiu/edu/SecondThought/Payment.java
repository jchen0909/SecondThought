/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
	public class Payment {
		
		private String paymentMethod;
		
		public Payment(String paymentMethod) {
			this.paymentMethod=paymentMethod;
		}
		public String passPaymenttoprocessor() {
			return paymentMethod;
		}
}
