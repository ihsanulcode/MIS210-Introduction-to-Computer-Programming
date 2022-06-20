import java.util.Scanner;

public class Equation1 {

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
		System.out.print("Enter value of e: ");
		double e = input.nextDouble();
		System.out.print("Enter value of f: ");
		double f = input.nextDouble();

		double answer = ((a * b) / f) + ((c * d) / b) + ((e * f) / d);

		// System.out.println("Result of the equation is : "+answer);
		System.out.printf("Result of the equation is %.2f", answer);

	}

}

// %d integer 
// %s string
// %f double or float