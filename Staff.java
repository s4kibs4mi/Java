// Staff class is subclass of Employee class
public class Staff extends Employee{
	public String title;
	
	public Staff(){
		super(null,null,null,null,null,null);
		title = null;
	}
	
	public Staff(String name,String address,String phoneNumber,String emailAddress,String officeSalary,String dateHired,String title){
		super(name,address,phoneNumber,emailAddress,officeSalary,dateHired);
		this.title = title;
	}
	
	public String toString(){
		return "Class Name : Staff, Staff Name : " + name;
	}
}
