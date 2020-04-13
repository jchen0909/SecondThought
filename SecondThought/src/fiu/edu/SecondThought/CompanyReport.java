/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class CompanyReport {

	private String companyName;
	private String functionName;
	private String questionnaireType;
	private boolean isHappyemoji;
	private boolean isNeutralemoji;
	private boolean isSademoji;
	
	public CompanyReport(String companyName, String functionName, String questionnaireType, boolean isHappyemoji, boolean isNeutralemoji, boolean isSademoji) {
		this.companyName=companyName;
		this.functionName=functionName;
		this.questionnaireType=questionnaireType;
		this.isHappyemoji=isHappyemoji;
		this.isNeutralemoji=isNeutralemoji;
		this.isSademoji=isSademoji;
	}
	
	public boolean countHappyemoji() {
		return isHappyemoji;
	}
	
	public boolean countNeutralemoji() {
		return isNeutralemoji;
	}
	
	public boolean countSademoji() {
		return isSademoji;
	}
	
	public void preformAnalytics() {
		
	}
	
	public void drawBarchart() {
		
	}
	
	public void drawPiechart() {
		
	}
	
	public void drawTrendchart() {
		
	}
	
	public void drawTable() {
		
	}
}
