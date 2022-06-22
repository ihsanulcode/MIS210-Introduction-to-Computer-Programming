import java.util.Scanner;

public class Equation2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("x = ");
		double x = input.nextDouble();

		double answer = Math.sqrt((x - 1) * (x - 2)) + Math.sqrt((x - 3) * (x - 4));
		System.out.println("Answer: " + answer);
	}

}
