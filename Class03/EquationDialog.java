import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EquationDialog {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value of a:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value of b:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value of c:"));

		double answer = (((a * a) + (b * b)) / 3.0) + (((b * b) + (c * c)) / 4.0) + (((a - b) * (a - b)) / 2.0);
		
		DecimalFormat df = new DecimalFormat("0.##");
		JOptionPane.showMessageDialog(null, "Result of the equation is " + df.format(answer));

	}

}
