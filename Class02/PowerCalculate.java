import java.util.Scanner;

public class PowerCalculate {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// Power Calculator
		System.out.print("Enter base: ");
		double base = input.nextDouble();
		System.out.print("Enter power: ");
		double power = input.nextDouble();

		// calculation
		double answer = Math.pow(base, power);

		// output
		System.out.println(base + "^" + power + " = " + answer);

	}

}
