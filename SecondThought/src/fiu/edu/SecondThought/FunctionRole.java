/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *
 */
public class FunctionRole {
	
	private String functionID;
	private String functionName;
	
	public FunctionRole(String functionID, String functionName) {
		this.functionID=functionID;
		this.functionName=functionName;
	}
	
	public String addFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
	
	public String deleteFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
	
	public String renameFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
}
