package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollarcoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("What is your height (in inches)?");
	int x = Integer.parseInt(height);
	if (x <= 48) {
	JOptionPane.showMessageDialog(null,"Grow taller first!");
	} else {
		JOptionPane.showMessageDialog(null,"You can enter the ride.");
	}
}
}


