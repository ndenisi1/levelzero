
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 10; i++) {					
		String turtle= JOptionPane.showInputDialog("What color would you like my turtle friend to color with?");
		//4. use an if/else statement to set the pen color that the user requested
if (turtle.equals("purple")) {
	Tortoise.setPenColor(Colors.Purples.DarkOrchid);
}
else if(turtle.equals("blue")){
	Tortoise.setPenColor(Colors.Blues.DarkTurquoise);
}
//5. if the user doesn’t enter anything, choose a random color
else{
	Tortoise.setPenColor(Colors.getRandomColor());
}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
Tortoise.penDown();
Tortoise.move(150);
Tortoise.turn(90);
Tortoise.move(150);
Tortoise.turn(90);
Tortoise.move(150);
Tortoise.turn(90);
Tortoise.move(150);


	}
}
}

