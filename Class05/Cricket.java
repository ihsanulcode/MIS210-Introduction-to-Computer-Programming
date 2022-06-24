import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter salary range: ");
		double salary = input.nextDouble();

		// conditional statements
		if (salary >= 800000 && salary <= 1000000)
			System.out.println("A grade.");
		else if (salary >= 500000 && salary <= 700000)
			System.out.println("B grade.");
		else if (salary >= 100000 && salary <= 400000)
			System.out.println("C grade.");

	}

}
