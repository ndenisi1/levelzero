package levelzero;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipies".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String noelani = "adaptability";
		String nancy = "motivator";
		String khia = "invisibility";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String meow = JOptionPane.showInputDialog(null, "Enter a name.");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (meow.equals("noelani")) {
			JOptionPane.showMessageDialog(null, "Noelani's power is adaptability.");
		}
		else if(meow.equals("nancy")){
			JOptionPane.showMessageDialog(null, "Nancy is a motivator.");
		}
		else if (meow.equals("khia")){
			JOptionPane.showMessageDialog(null, "Khia has the power of invisibility.");
		}
		else if (meow.equals("diego")){
			JOptionPane.showMessageDialog(null, "Sorry, unknown.");
		}
		else if (meow.equals("roberto")){
			JOptionPane.showMessageDialog(null, "Sorry, unknown");
		}
		else if (meow.equals("gerry")){
			JOptionPane.showMessageDialog(null, "Sorry, unknown.");
		}
	}
}
