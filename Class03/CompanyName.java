import javax.swing.JOptionPane;

public class CompanyName {

	public static void main(String[] args) {
		String companyName = JOptionPane.showInputDialog(null, "Enter your company name: ");
		String msg = String.format("Your Company is %s", companyName);
		JOptionPane.showMessageDialog(null, msg);

	}

}
