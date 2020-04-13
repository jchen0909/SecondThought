/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class Questionnaire {
	
	private boolean isCulture;
	private boolean isMoral;
	private boolean isDailyactivity;
	
	public Questionnaire(boolean isCulture, boolean isMoral, boolean isDailyactivity) {
		this.isCulture=isCulture;
		this.isMoral=isMoral;
		this.isDailyactivity=isDailyactivity;		
	}
	
	public boolean getCulturequestions() {
		return isCulture;
	}
	
	public boolean getMoralquestions() {
		return isMoral;
	}
	
	public boolean getDailyactivityquestions() {
		return isDailyactivity;
	}
}
