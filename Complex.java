public class Complex {
	private long realNumber;
	private long imaginaryNumber;
	
	Complex(){}
	
	Complex(long realNumber){
		this.realNumber = realNumber;
	}
	Complex(long realNumber,long imaginaryNumber){
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	
	public void setRealNumber(long realNumber){
		this.realNumber = realNumber;
	}
	public void setImaginaryNumber(long imaginaryNumber){
		this.imaginaryNumber = imaginaryNumber;
	}
	
	public String addition(Complex numberA){
		Complex result = new Complex();
		result.realNumber = numberA.realNumber + realNumber;
		result.imaginaryNumber = numberA.imaginaryNumber + imaginaryNumber;
		return result.realNumber + " + " + result.imaginaryNumber + "i";
	}
	
	public String substrction(Complex numberA){
		Complex result = new Complex();
		result.realNumber = realNumber - numberA.realNumber;
		result.imaginaryNumber = imaginaryNumber - numberA.imaginaryNumber;
		return result.realNumber + " - " + result.imaginaryNumber + "i";
	}
}
