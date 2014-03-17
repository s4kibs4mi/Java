public class Test {

	public static void main(String args[]){
		Complex c1 = new Complex(8,6);
		Complex c2 = new Complex(5,2);
		System.out.println("Number A : " + c1.displayNumber());
		System.out.println("Number B : " + c2.displayNumber());
		System.out.println("Addition : " + c1.addition(c2));
		System.out.println("Substraction " + c1.substrction(c2));
		System.out.println("Multiplication : " + c1.multiplication(c2));
	}
}
