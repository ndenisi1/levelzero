package levelzero;

import javax.swing.JOptionPane;

public class insulter {
public static void main(String[] args) {
	String dino = JOptionPane.showInputDialog("Were do you want to go? hahahahahahahaha");
	String happy = ( dino +" has a monster that is going to eat you and everyone is going to laugh! Why are you trying to hurt that poor monster?");
	speak(happy);
	
	
	
	
	
	
	
	
	
}	

	
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

	}





































