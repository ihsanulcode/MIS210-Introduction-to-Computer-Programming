import java.util.Scanner;

public class Qs6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = input.nextInt();

		if (age < 18)
			System.out.println("Not Eligible for car insurance.");
		else if (age > 65)
			System.out.println("Not Eligible for health insurance.");
		else if (age > 18 && age < 65)
			System.out.println("Can apply for any insurance");

	}

}
