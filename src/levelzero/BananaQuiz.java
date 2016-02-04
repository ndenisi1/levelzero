package levelzero;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String hi= JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
	if(hi.equals("no")){
		JOptionPane.showMessageDialog(null, "You are crazy!!!!!!");
	}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
	else if(hi.equalsIgnoreCase("yes")){
		String dino= JOptionPane.showInputDialog("What is your favorite hobby?");
		JOptionPane.showMessageDialog(null,dino+ " would be much better with bananas!");
	}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}

}

