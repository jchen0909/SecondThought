/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 * create a 'CompanyReport' class store all company report
 */
public class CompanyReport {

	//variable declaration 
	private String companyName;
	private String functionName;
	private String questionnaireType;
	private boolean isHappyemoji;
	private boolean isNeutralemoji;
	private boolean isSademoji;
	
	//create constructor
	public CompanyReport(String companyName, String functionName, String questionnaireType, boolean isHappyemoji, boolean isNeutralemoji, boolean isSademoji) {
		this.companyName=companyName;
		this.functionName=functionName;
		this.questionnaireType=questionnaireType;
		this.isHappyemoji=isHappyemoji;
		this.isNeutralemoji=isNeutralemoji;
		this.isSademoji=isSademoji;
	}
	
	//return number of happy emoji
	public boolean countHappyemoji() {
		return isHappyemoji;
	}
	
	//return number of neutral emoji
	public boolean countNeutralemoji() {
		return isNeutralemoji;
	}
	
	//return number of sad emoji
	public boolean countSademoji() {
		return isSademoji;
	}
	
	//return analysis for company report
	public void preformAnalytics() {
		
	}
	
	//return bar chart for report
	public void drawBarchart() {
		
	}
	
	//return pie for report
	public void drawPiechart() {
		
	}
	
	//return trend for report
	public void drawTrendchart() {
		
	}
	
	//return table for report
	public void drawTable() {
		
	}
}
