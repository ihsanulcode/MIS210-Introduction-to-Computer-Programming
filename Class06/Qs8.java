import java.util.Scanner;

public class Qs8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter month: ");
		String month = input.nextLine();

		switch (month) {
		case "January":
		case "February":
		case "March":
		case "April":
			System.out.println("Spring Semester");
			break;
		case "May":
		case "June":
		case "July":
		case "August":
			System.out.println("Summer Semester");
			break;
		case "September":
		case "October":
		case "November":
		case "December":
			System.out.println("Fall Semester");
			break;
		default:
			System.out.println("Invalid month.");
		}

	}

}
