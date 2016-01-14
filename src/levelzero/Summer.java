package levelzero;

import javax.swing.JOptionPane;

public class Summer {
public static void main(String[] args) {
	String hi = JOptionPane.showInputDialog("What is your name?");
	String dino = JOptionPane.showInputDialog("What is your hobby");
	JOptionPane.showMessageDialog(null,hi+" you went " + dino +" last summer.");
}
}
