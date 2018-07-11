/**
 * @(#)SFN_GUI.java
 *
 * SFN_GUI application
 *
 * @author
 * @version 1.00 2017/3/26
 */
import javax.swing.JOptionPane;
public class SFN_GUI {

    public static void main(String[] args) {
	    
	// Getting name and email address
    	String name = JOptionPane.showInputDialog("What is your name?");
    	String email = JOptionPane.showInputDialog("What is your email address?");

	// Getting number of cleats that will be donated
    	Object[] possibleValues = { "1", "2", "3", "4", "5" };
		Object selectedValue = JOptionPane.showInputDialog(null,"How many pairs of cleats will you be donating?", "Input",JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
	
	// Confirmation of donation
    	int reply = JOptionPane.showConfirmDialog(null, "Is the following information correct? \nMy name is " + name + "\n" + email + "\n" + "I will be donating " + selectedValue + " pair(s) of cleats", "Choose One", JOptionPane.YES_NO_OPTION);

		if (reply == 0) {
			JOptionPane.showMessageDialog(null, "Thank You!");
		}

		if (reply == 1) {
			JOptionPane.showMessageDialog(null, "Please fill out this form again!");

		}
    }

}

