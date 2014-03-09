public class NamingConventionCheck {
	private String className;
	private String fieldName;
	
	// Constructor default
	public NamingConventionCheck(){
		className = null;
		fieldName = null;
	}
	
	// Parametric Constructor
	public NamingConventionCheck(String className , String fieldName){
		this.className = className;
		this.fieldName = fieldName;
	}
	
	// method to set class name
	public void setClassName(String className){
		this.className = className;
	}
	
	// method to set field name
	public void setfieldName(String fieldName){
		this.fieldName = fieldName;
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
	
	// method to check is field name OK
	public boolean isfieldNameOk(){
		int n = fieldName.length();
		
		if(n == 0)
			return false;
		
		if(Character.isUpperCase(fieldName.charAt(0)))
			return false;
		
		if(fieldName.toUpperCase().equals(fieldName))
			return false;
		
		if(n > 1 && Character.isUpperCase(fieldName.charAt(n-1)))
			return false;
		
		for(int i = 0; i < n; i++){
			
			if(fieldName.charAt(i) == ' ')
				return false;
		}
		return true;
	}
	
}
