//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random r = new Random();
	int x = r.nextInt(4);
	Random n = new Random();
	int i = n.nextInt(10000);
	// 3. Print out this variable
System.out.println();
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask a yes/no question, for a decisive answer.");
	// 5. If the random number is 0
if (x == 0) {
	JOptionPane.showMessageDialog(null,"definitely yes.");
} else if (x== 1) {
	JOptionPane.showMessageDialog(null,"nO");
} else if (x== 2) {
	JOptionPane.showMessageDialog(null,"Ask google, your question is too hard for me.");
} else if (x== 3) {
	JOptionPane.showMessageDialog(null,"YOU WILL DIE WITHIN "+i+ " DAYS.");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}
