package levelzero;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int hiitsmenoelani= 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String dino = JOptionPane.showInputDialog("What shape would you like? A square,triangle,or penatagon.");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (dino.equals("square")){
			hiitsmenoelani=4;
		}
		else if(dino.equals("triangle")){
			hiitsmenoelani=3;
		}
		else{
			JOptionPane.showMessageDialog(null, "We do not know "+dino+". Sorry.");
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int i = 0; i < 2222; i++) {
			Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.move(i*2);
		Tortoise.turn(360/3);
		}
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
		
		
	}

}


