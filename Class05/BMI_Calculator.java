import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in Kg: ");
		double weight = input.nextDouble();
		System.out.print("Enter your height in Meters: ");
		double height = input.nextDouble();

		double BMI = weight / (height * height);
		System.out.printf("\nYour BMI is %.4f", BMI);

		if (BMI < 18.5) {
			System.out.println("\nYou are underweight!");
		} else if (BMI > 18.5 && BMI <= 25) {
			System.out.println("\nYou are normal!");
		} else if (BMI > 25 && BMI <= 30) {
			System.out.println("\nYou are overweight!");
		} else if (BMI > 30) {
			System.out.println("\nYou are Obesed!");
		}

	}

}
