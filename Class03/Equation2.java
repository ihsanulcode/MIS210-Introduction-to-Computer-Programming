import java.util.Scanner;

public class Equation2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter value of b: ");
		double b = input.nextDouble();
		System.out.print("Enter value of c: ");
		double c = input.nextDouble();
		System.out.print("Enter value of d: ");
		double d = input.nextDouble();

		double answer = ((a + b) / 3.0) + ((b + c) / 2.0) + ((d + c) / 4.0);
		System.out.printf("Result of the equation is %.4f", answer);
	}

}
