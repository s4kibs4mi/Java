import java.util.Scanner;

public class OwnExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		while (sc.hasNext()) {
			age = sc.nextInt();
			try {
				if (age >= 20 && age <= 50)
					System.out.println(age);
				else
					throw new OwnException("Age Error");
			} catch (OwnException ex) {
				System.out.println("Exception Found : " + ex);
				System.out.println(ex.getMessage());
				System.out.println(ex.getLocalizedMessage());
			}
		}
	}
}
