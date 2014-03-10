// Employee class is subclass of Person Class
public class Employee extends Person{
	public String officeSalary;
	public String dateHired;
	
	public Employee(){
		super(null,null,null,null);
		officeSalary = null;
		dateHired = null;
	}
	
	public Employee(String name,String address,String phoneNumber,String emailAddress,String officeSalary,String dateHired){
		super(name,address,phoneNumber,emailAddress);
		this.officeSalary = officeSalary;
		this.dateHired = dateHired;
	}
	
	public String toString(){
		return "Class Name : Employee, Employee Name : " + name;
	}
}
