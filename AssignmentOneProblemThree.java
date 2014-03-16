public class AssignmentOneProblemThree {
	private String className;
	
	// Constructor default
	public AssignmentOneProblemThree(){}
	
	// Parametric Constructor
	public AssignmentOneProblemThree(String className){
		this.className = className;
	}
	
	// method to set class name
	public void setClassName(String className){
		this.className = className;
	}
	
	// Method to check is class name OK
	public boolean isClassNameOk(){
		int n = className.length();
		
		if(n == 0)
			return false;
		
		if(Character.isLowerCase(className.charAt(0)))
			return false;
		
		if(className.toLowerCase().equals(className))
			return false;
		
		if(className.toUpperCase().equals(className))
			return false;
		
		if(n > 1 && Character.isUpperCase(className.charAt(n-1)))
			return false;
		
		for(int i = 0; i < n; i++){
			
			if(className.charAt(i) == ' ')
				return false;
		}
		return true;
	}
}
