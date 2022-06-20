import javax.swing.JOptionPane;

public class ArithmeticPart2 {

	public static void main(String[] args) {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Enter p:"));
		double q = Double.parseDouble(JOptionPane.showInputDialog("Enter q:"));
		double r = Double.parseDouble(JOptionPane.showInputDialog("Enter r:"));

		double totalCost = p + q + r;
		JOptionPane.showMessageDialog(null, "Total Bill is " + totalCost);

	}

}
