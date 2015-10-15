
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
* Airline registration 
* 
* You are writing a program for a new airline to take their registration information at the check-in counter
* and print their boarding pass. You need to collect the following information: 
* 		First name 
* 		Last name
* 		Destination airport 
* 		Birthday (for security purposes) 
* 		Male/female (for security purposes) 
* 
* Print the boarding pass in this format:
* LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
* Traveling to: DESTINATION
* 
* Toolbox: main() method, JOptionPane.showInputDialog, variables
* 
**/
public class airlineregistration {
	public static void main(String[] args) {
 String batman=JOptionPane.showInputDialog("What is your first name");
 String wonderwoman= JOptionPane.showInputDialog("What is your last name");
 String hulk= JOptionPane.showInputDialog("Are you male or female");
 String superman= JOptionPane.showInputDialog(" The date of birth please");
 String storm= JOptionPane.showInputDialog("We are you planning on landing");
 JOptionPane.showMessageDialog(null,wonderwoman+"/"+batman+"("+superman+"/"+hulk+") Traveling to:"+storm);
}
}

