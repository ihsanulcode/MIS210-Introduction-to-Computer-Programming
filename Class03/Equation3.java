import java.util.Scanner;

public class Equation3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter value of b: ");
		double b = input.nextDouble();
		System.out.print("Enter value of c: ");
		double c = input.nextDouble();

		double answer = (((a * a) + (b * b)) / 3.0) + (((b * b) + (c * c)) / 4.0) + (((a - b) * (a - b)) / 2.0);
		System.out.printf("Result of the equation is %.4f", answer);

	}

}
