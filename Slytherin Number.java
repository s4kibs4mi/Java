import java.math.*;
import java.util.*;

public class Test {

	public static void Slytherin(BigInteger a, BigInteger b, long i, long n){
		System.out.print(a + " ");
		if(i < n){
			Slytherin(b, b.multiply(a), ++i, n);
		}
	}
	
	public static void main(String args[]){
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("2");
		Scanner sc = new Scanner(System.in);
		long n;
		System.out.print("Enter a Number : ");
		n = sc.nextLong();
		Slytherin(a,b,1,n);
		sc.close();
	}
}
