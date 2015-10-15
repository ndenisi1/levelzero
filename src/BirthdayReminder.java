 
 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 26th";
		String dadsBirthday = "May 6th";
		String myBirthday = "February 22th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String hello= JOptionPane.showInputDialog("Who's birthday are you looking for?");	
		// 3. Print out what the user typed
	JOptionPane.showMessageDialog(null, hello);	
		// 4. if user asked for "mom"
	if(hello.equalsIgnoreCase("mom")){
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
			//print mom's birthday
		// 5. if user asked for "dad"
	else if(hello.equalsIgnoreCase("dad")){
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
			// print dad's birthday
		// 6. if user asked for your name
	else if(hello.equals)
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

