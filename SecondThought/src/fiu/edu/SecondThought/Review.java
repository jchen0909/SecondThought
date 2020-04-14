/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create 'review' class store rating emoji for company
 */
public class Review {
	
	//variable declaration 
	private String emojiType;
	
	//create constructor
	public Review(String emojiType) {
		this.emojiType=emojiType;
	}
	
	//return emoji type
	public String selectHappyemoji() {
		emojiType = "Happy";
		return emojiType;
	}
	
	//return emoji type
	public String selectNeutralemoji() {
		emojiType = "Neutral";
		return emojiType;
	}
	
	//return emoji type
	public String SelectSademoji() {
		emojiType = "Sad";
		return emojiType;
	}
	
	//return comment
	public String comment() {
		return "Any comment?";
	}
}
