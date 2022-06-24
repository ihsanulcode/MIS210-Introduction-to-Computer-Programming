import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		if (n > 0)
			System.out.println("Positive number.");
		else if (n < 0)
			System.out.println("Negative number.");
		else if (n == 0)
			System.out.println("It's Zero!");

	}

}
