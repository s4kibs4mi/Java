// Student Class is subclass of Person class
public class Student extends Person {
	public String status;
	
	public Student(){
		super(null,null,null,null);
		status = null;
	}
	
	public Student(String name,String address,String phoneNumber,String emailAddress,String status){
		super(name,address,phoneNumber,emailAddress);
		this.status = status;
	}
	
	public String toString(){
		return "Class Name : Student, Student Name : " + name;
	}
}
