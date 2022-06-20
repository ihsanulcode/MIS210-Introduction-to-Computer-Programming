import javax.swing.JOptionPane;

public class SummationDialogueBox {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first integer:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second integer:"));

		int sum = a + b;
		String msg = String.format("Sum is %s", sum);
		JOptionPane.showMessageDialog(null, msg);

	}

}
