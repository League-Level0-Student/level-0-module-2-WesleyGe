package _15_voting_booth;

import javax.swing.JOptionPane;

public class voting {
	public static void main(String[] args) {
		
	
 String age = JOptionPane.showInputDialog("What is your age?");
 int x = Integer.parseInt(age);{
 if (x>=18) {
	 JOptionPane.showInputDialog("Who do you think should win the election?");
	 JOptionPane.showMessageDialog(null,"Thank you for voting!");
 }
	 else{
		 JOptionPane.showMessageDialog(null,"Nobody cares what you think.");
	 }
 
}
}
}