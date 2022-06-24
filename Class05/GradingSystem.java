import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter obtained mark: ");
		double mark = input.nextDouble();

		if(mark>100)
			System.out.println("Invalid mark!");
		else if (mark >= 93)
			System.out.println("Obtained grade: A");
		else if (mark >= 90)
			System.out.println("Obtained grade: A-");
		else if (mark >= 87)
			System.out.println("Obtained grade: B+");
		else if (mark >= 83)
			System.out.println("Obtained grade: B");
		else if (mark >= 80)
			System.out.println("Obtained grade: B-");
		else if (mark >= 77)
			System.out.println("Obtained grade: C+");
		else if (mark >= 73)
			System.out.println("Obtained grade: C");
		else if (mark >= 70)
			System.out.println("Obtained grade: C-");
		else if (mark >= 66)
			System.out.println("Obtained grade: D+");
		else if (mark >= 60)
			System.out.println("Obtained grade: D");
		else if (mark < 60)
			System.out.println("Obtained grade: F");

	}

}
