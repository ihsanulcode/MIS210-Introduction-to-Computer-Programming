import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		System.out.print("Enter d: ");
		double d = input.nextDouble();
		System.out.print("Enter e: ");
		double e = input.nextDouble();
		System.out.print("Enter f: ");
		double f = input.nextDouble();

		double result = (a * b) / f + (c * d) / b + (e * f / d);
		System.out.println("Result: " + result);

	}

}
