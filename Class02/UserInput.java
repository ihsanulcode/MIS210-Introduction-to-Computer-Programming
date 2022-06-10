import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter Id: ");
		int id = input.nextInt();
		System.out.print("Enter Cgpa: ");
		double cgpa = input.nextDouble();
		System.out.print("Enter Grade: ");
		char grade = input.next().charAt(0);
		System.out.print("isGraduate? : ");
		boolean isGraduate = input.nextBoolean();
		
		//printing
		System.out.println("\tYour Information:");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("CGPA: " + cgpa);
		System.out.println("Grade: " + grade);
		System.out.println("isGraduate: " + isGraduate);
	}

}
