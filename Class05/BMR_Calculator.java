import java.util.Scanner;

public class BMR_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in lbs: ");
		double weight = input.nextDouble();
		System.out.print("Enter your height in Inches: ");
		double height = input.nextDouble();
		System.out.print("Enter your age: ");
		double age = input.nextDouble();

		double BMR = (4.536 * weight) + (15.88 * height) - (5 * age) + 5;
		System.out.printf("\nYour BMR is %.4f", BMR);

	}

}
