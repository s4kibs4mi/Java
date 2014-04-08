public class NestedClass {
	private String message = "Outer Class";
	public NestedClass(){}
	public NestedClass(String message){
		this.message = message;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
	
	// Inner Class started here
	public class InnerClass{
		private String message = "Inner Class";
		public InnerClass(){}
		public InnerClass(String message){
			this.message = message;
		}
		public void setMessage(String message){
			this.message = message;
		}
		public String getMessage(){
			return message;
		}
		
		// Another Inner Class
		public class ChildClass{
			private String message = "Inner Class";
			public ChildClass(){}
			public ChildClass(String message){
				this.message = message;
			}
			public void setMessage(String message){
				this.message = message;
			}
			public String getMessage(){
				return message;
			}
		}
	}
}
