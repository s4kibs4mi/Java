// Faculty class is subclass of Employee class
public class Faculty extends Employee{
	public String officeHours;
	public String rank;
	
	public Faculty(){
		super(null,null,null,null,null,null);
		officeHours = null;
		rank = null;
	}
	
	public Faculty(String name,String address,String phoneNumber,String emailAddress,String officeSalary,String dateHired,String officeHours,String rank){
		super(name,address,phoneNumber,emailAddress,officeHours,rank);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString(){
		return "Class Name : Faculty, Faculty Name : " + name;
	}
}
