import java.util.Scanner;

public class Equation3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter base: ");
		double base = input.nextDouble();

		System.out.println("Enter height: ");
		double height = input.nextDouble();

		double areaOfTriangle = 0.5 * base * height;
		System.out.println("Area of Triangle: " + areaOfTriangle);

	}

}
