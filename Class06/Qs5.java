import java.util.Scanner;

public class Qs5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in kg: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in meters: ");
		double height = input.nextDouble();

		double BMI = weight / (height * height);

		if (BMI < 18.5)
			System.out.println("Underweight");
		else if (BMI >= 18.5 && BMI <= 25)
			System.out.println("Normal");
		else if (BMI > 25 && BMI <= 30)
			System.out.println("Overwight");
		else
			System.out.println("Obese");

	}

}
