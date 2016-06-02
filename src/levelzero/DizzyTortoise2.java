package levelzero;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise2 {

	public static void main(String[] args) {
		
		 // 1. Use the dance method to make the Tortoise spin.
		
		 //2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 // that number of times.
		String hey = JOptionPane.showInputDialog("How dizzy do you want the tortoise , 1-10?");
int numberOfSpins = Integer.parseInt(hey);
dance(numberOfSpins);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

