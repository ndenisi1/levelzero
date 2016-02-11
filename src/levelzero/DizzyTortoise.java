package levelzero;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
		 /* 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
String hi = JOptionPane.showInputDialog("How dizzy do you want the tortoise to be?");
int meow = Integer.parseInt(hi);
dance(meow);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
