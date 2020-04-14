/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *Create 'Questionnaire' that store all company questions
 */
public class Questionnaire {
	//variable declaration
	private boolean isCulture;
	private boolean isMoral;
	private boolean isDailyactivity;
	
	//create constructor
	public Questionnaire(boolean isCulture, boolean isMoral, boolean isDailyactivity) {
		this.isCulture=isCulture;
		this.isMoral=isMoral;
		this.isDailyactivity=isDailyactivity;		
	}
	
	//return if is culture question
	public boolean getCulturequestions() {
		return isCulture;
	}
	
	//return if is moral question
	public boolean getMoralquestions() {
		return isMoral;
	}
	
	//return if is daily activity question
	public boolean getDailyactivityquestions() {
		return isDailyactivity;
	}
}
