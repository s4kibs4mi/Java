public class Assignment1_Problem1 {
	private int a;
	private int b;
	
	public Assignment1_Problem1(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public int greaterNumber(){
		if(a > b) return a;
		else return b;
	}
	
	public String findRangeA(){
		if(a >= 0 && a <= 127)
			return "Range :	0 - 127";
		else if(a >= 128 && a <= 255)
			return "Range :	128 - 255";
		return "256 - infinite";
	}
	
	public String findRangeB(){
		if(b >= 0 && b <= 127)
			return "Range :	0 - 127";
		else if(b >= 128 && b <= 255)
			return "Range :	128 - 255";
		return "256 - infinite";
	}
	
	public void asciCharA(){
		if(a >= 0 && a <= 255)
			System.out.printf("%c - ASCI\n",a);
		else System.out.printf("%c - Extended ASCI\n",a%255);
	}
	
	public void asciCharB(){
		if(b >= 0 && b <= 255)
			System.out.printf("%c - ASCI\n",b);
		else System.out.printf("%c - Extended ASCI\n",b%255);
	}
}
