import javax.swing.JOptionPane;
public class Task3 {

	public static void main(String[] args) {
		String companyName = JOptionPane.showInputDialog(null,"Enter your company name below");
		String msg = String.format("Your company name is %s", companyName);
		JOptionPane.showMessageDialog(null, msg);

	}

}
