import java.util.Scanner;

public class Billing2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter price of a: ");
		double p = input.nextDouble();
		System.out.print("Enter price of b: ");
		double q = input.nextDouble();
		System.out.print("Enter price of c: ");
		double r = input.nextDouble();

		double totalCost = p + q + r;
		System.out.println("Total Bill: " + totalCost);

		System.out.println("\nEnter amount: ");
		double takenMoney = input.nextDouble();

		double returnMoney = takenMoney - totalCost;
		System.out.println("Amount Returned: " + returnMoney);
	}

}
