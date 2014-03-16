public class AssignmentOneProblemFour {
	private double a;
	private double b;
	private double c;
	
	public AssignmentOneProblemFour(){};
	public AssignmentOneProblemFour(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void setA(double a){
		this.a = a;
	}
	public void setB(double b){
		this.b = b;
	}
	public void setC(double c){
		this.c = c;
	}
	public double area(){
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
