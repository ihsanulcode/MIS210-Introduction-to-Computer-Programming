import java.util.Scanner;
import javax.swing.JOptionPane;

public class Shopping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter total budget: ");
		double totalBudget = input.nextDouble();

		System.out.print("\nEnter price of Rice(Per KG): ");
		double ricePerKG = input.nextDouble();
		System.out.print("Rice Purchased (In KG): ");
		double ricePurchased = input.nextDouble();

		System.out.print("\nEnter price of Wheat(Per KG): ");
		double wheatPerKG = input.nextDouble();
		System.out.print("Wheat Purchased (In KG): ");
		double wheatPurchased = input.nextDouble();

		System.out.print("\nEnter price of Potato(Per KG): ");
		double potatoPerKG = input.nextDouble();
		System.out.print("Potato Purchased (In KG): ");
		double potatoPurchased = input.nextDouble();

		System.out.print("\nEnter price of Chicken(Per KG): ");
		double chickenPerKG = input.nextDouble();
		System.out.print("Chicken Purchased (In KG): ");
		double chickenPurchased = input.nextDouble();

		System.out.print("\nEnter price of Milk(Per KG): ");
		double milkPerKG = input.nextDouble();
		System.out.print("Milk Purchased (In KG): ");
		double milkPurchased = input.nextDouble();

		double riceCost = ricePerKG * ricePurchased;
		System.out.println("\nTotal Price of Rice: " + riceCost);

		double wheatCost = wheatPerKG * wheatPurchased;
		System.out.println("Total Price of Wheat: " + wheatCost);

		double potatoCost = potatoPerKG * potatoPurchased;
		System.out.println("Total Price of Potato: " + potatoCost);

		double chickenCost = chickenPerKG * chickenPurchased;
		System.out.println("Total Price of Chicken: " + chickenCost);

		double milkCost = milkPerKG * milkPurchased;
		System.out.println("Total Price of Milk: " + milkCost);

		// total bill
		double totalBill = riceCost + wheatCost + potatoCost + chickenCost + milkCost;
		System.out.println("\nTotal Spending: " + totalBill);

		double remainingBalance;
		double discountBalance;
		if (totalBill < 2500.0) {
			remainingBalance = totalBudget - totalBill;
			System.out.println("Remaining Balance: " + remainingBalance);
		} else if (totalBill > 2500.0) {
			discountBalance = totalBill - (totalBill * 0.2);
			remainingBalance = totalBudget - discountBalance;
			System.out.println("Final Spending after 20% Discount: " + discountBalance);
			System.out.println("Remaining Balance: " + remainingBalance);
			JOptionPane.showMessageDialog(null, "Congratulation you are entitled to 20% Discount.");
		}

	}

}
