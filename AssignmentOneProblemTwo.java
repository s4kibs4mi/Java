public class NamingConventionCheck {
	private String className;
	private String methodName;
	
	public NamingConventionCheck(){
		className = null;
		methodName = null;
	}
	
	public NamingConventionCheck(String className , String methodName){
		this.className = className;
		this.methodName = methodName;
	}
	
	public void setClassName(String className){
		this.className = className;
	}
	
	public void setMethodName(String methodName){
		this.methodName = methodName;
	}
	
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
	
	public boolean isMethodOk(){
		
		return true;
	}
	
}
