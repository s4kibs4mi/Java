public class ArrayTest {
	
	public static double averageOfArray(int a[]){
		int sum = 0 , i = 0;
		for(int x : a){
			sum += x;
			i++;
		}
		return sum/i;
	}
	
	public static void showOddNum(int a[]){
		for(int x : a){
			if(x%2 != 0)
				System.out.print(x + " ");
		}
		System.out.print("\n");
	}
	
	public static void main(String args[]){
		int a[] = { 10,20,15,7,18,13 };
		
		double s = averageOfArray(a);
		System.out.println(s);
		showOddNum(a);
	}
}
