import javax.swing.JOptionPane;

public class Task4 {

	public static void main(String[] args) {

		String firstName = JOptionPane.showInputDialog(null, "Enter your first name");
		String lastName = JOptionPane.showInputDialog(null, "Enter your last name");
		String fullName = String.format("Welcome, Mr./Mrs. %s %s", firstName, lastName);
		JOptionPane.showMessageDialog(null, fullName);

	}

}
