import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = input.nextInt();
		System.out.print("Enter second integer: ");
		int b = input.nextInt();

		int sum = a + b;
		System.out.printf("\nSum is %d", sum);
	}

}
