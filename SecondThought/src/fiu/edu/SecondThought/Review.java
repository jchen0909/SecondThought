/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class Review {
	
	private String emojiType;
	
	public Review(String emojiType) {
		this.emojiType=emojiType;
	}
	
	public String selectHappyemoji() {
		emojiType = "Happy";
		return emojiType;
	}
	
	public String selectNeutralemoji() {
		emojiType = "Neutral";
		return emojiType;
	}
	
	public String SelectSademoji() {
		emojiType = "Sad";
		return emojiType;
	}
	
	public String comment() {
		return "Any comment?";
	}
}
