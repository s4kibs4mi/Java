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
	
	public String displayNumber(){
		return realNumber + " + " + imaginaryNumber + "i";
	}
	public long getRealNumber(){
		return realNumber;
	}
	
	public long getImaginaryNumber(){
		return imaginaryNumber;
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
		return result.realNumber + " + " + result.imaginaryNumber + "i";
	}
	
	public String multiplication(Complex numberA){
		Complex result = new Complex();
		result.realNumber = this.realNumber * numberA.realNumber;
		result.imaginaryNumber += this.realNumber * numberA.imaginaryNumber;
		result.imaginaryNumber += this.imaginaryNumber * numberA.realNumber;
		result.realNumber -= this.imaginaryNumber * numberA.imaginaryNumber;
		return result.realNumber + " + " + result.imaginaryNumber + "i";
	}
	public String division(Complex numberA){
		Complex result = new Complex();
		
		return "";
	}
}
