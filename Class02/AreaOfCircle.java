
//Question: Write a Java program to calculate the area of a circle. Get the radius from user.
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting user input
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();

		// calculate
		// double area = 3.1416*radius*radius;
		double area = Math.PI * Math.pow(radius, 2);

		// output
		System.out.println("Area: " + area);
	}

}
