import java.util.Scanner;

public class FeverTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter degree celcius: ");
		double c = input.nextDouble();

		if (c > 100)
			System.out.println("You have fever!");
		else if (c == 100)
			System.out.println("Medium fever!");
		else if (c < 100)
			System.out.println("Normal!");

	}

}
