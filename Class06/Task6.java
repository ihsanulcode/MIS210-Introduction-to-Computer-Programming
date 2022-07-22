import javax.swing.JOptionPane;

public class Task6 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter c"));

		int total = a - (b - c);
		JOptionPane.showMessageDialog(null, "Totoal is: " + total);

	}

}
