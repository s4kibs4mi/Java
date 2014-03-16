public class AssignmentOneProblemFive {
	private long number1;
	private long number2;
	
	public AssignmentOneProblemFive(){};
	
	public AssignmentOneProblemFive(long number1,long number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	public void setA(long number1){
		this.number1 = number1;
	}
	public void setB(long number2){
		this.number2 = number2;
	}
	public boolean isGreater(){
		if(number1 > number2)
			return true;
		else return false;
	}
}
