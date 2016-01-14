package levelzero;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("how tall are you?(one number please)");
	int realheight = Integer.parseInt(height);
	if(realheight > 4){
		JOptionPane.showMessageDialog(null, "You can ride!");
	}
	else{
		JOptionPane.showMessageDialog(null, "you can't ride , sorry!");
	}
}
}
