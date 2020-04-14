/**
 * 
 */
package fiu.edu.SecondThought;

/**
 * @author simon
 *create "FunctionRole" class store company function role information
 */
public class FunctionRole {
	
	//variable declaration
	private String functionID;
	private String functionName;
	
	//create constructor
	public FunctionRole(String functionID, String functionName) {
		this.functionID=functionID;
		this.functionName=functionName;
	}
	
	// return function role and function name to add
	public String addFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
	
	// return function role and function name to delete
	public String deleteFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
	
	// return function role and function name to rename
	public String renameFunctionrole() {
		return "Function ID: " + functionID + "\t Function Name: "+ functionName;
	}
}
