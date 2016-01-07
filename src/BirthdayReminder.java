
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		
		String momsBirthday = "August 26th";
		String dadsBirthday = "May 2nd";
		String myBirthday = "February 22nd";

		
		String hello = JOptionPane.showInputDialog("Who's birthday are you looking for?");
		
		JOptionPane.showMessageDialog(null, hello);
		
		if (hello.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		
		else if (hello.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(hello.equalsIgnoreCase("noelani")){
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "sorry , i don't remember that person's birthday!");
		}

		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
