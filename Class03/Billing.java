import javax.swing.JOptionPane;

public class Billing {

	public static void main(String[] args) {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Enter p:"));
		double q = Double.parseDouble(JOptionPane.showInputDialog("Enter q:"));
		double r = Double.parseDouble(JOptionPane.showInputDialog("Enter r:"));

		double totalCost = p + q + r;
		JOptionPane.showMessageDialog(null, "Total Bill is " + totalCost);

		double takenMoney = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount:"));
		double returnMoney = takenMoney - totalCost;
		JOptionPane.showMessageDialog(null, "Cash Returned " + returnMoney);

	}

}
