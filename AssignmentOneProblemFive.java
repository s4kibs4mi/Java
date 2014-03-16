public class AssignmentOneProblemFive {
	private long number1;
	private long number2;
	
	public AssignmentOneProblemFive(){};
	
	public AssignmentOneProblemFive(long number1,long number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	public void setNumber1(long number1){
		this.number1 = number1;
	}
	public void setNumber2(long number2){
		this.number2 = number2;
	}
	public boolean isGreater(){
		if(number1 > number2)
			return true;
		else return false;
	}
}
