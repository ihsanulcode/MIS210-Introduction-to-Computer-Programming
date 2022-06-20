import javax.swing.JOptionPane;

public class StudentDialogueBox {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "Enter your first name:");
		String lastName = JOptionPane.showInputDialog(null, "Enter your last name:");
		String welcomeMsg = String.format("Welcome to MIS Class Mr./Mrs. %s %s", firstName, lastName);

		JOptionPane.showMessageDialog(null, welcomeMsg);
	}

}
