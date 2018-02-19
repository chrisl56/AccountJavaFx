import javax.swing.JOptionPane;
public class AccountJavaFx {
	public static void main (String [] args) {

	String nameInput = JOptionPane.showInputDialog("Enter in your name: ");
	String ageInputStr = JOptionPane.showInputDialog("Enter your age: ");
	int ageInput = Integer.parseInt(ageInputStr);
	String emailInput = JOptionPane.showInputDialog("Enter your email: ");
	String dobInputStr = JOptionPane.showInputDialog("Enter your DOB: ");
	String addressInput = JOptionPane.showInputDialog("Enter in your address: ");

	


	JOptionPane.showMessageDialog(null, "Your name is: " + nameInput);
	JOptionPane.showMessageDialog(null, "Your age is: " + ageInput);
	JOptionPane.showMessageDialog(null, "Your email is: " + emailInput);
	JOptionPane.showMessageDialog(null, "Your DOB is: " + dobInputStr);
	JOptionPane.showMessageDialog(null, "Your address is: " + addressInput);





	}
}
