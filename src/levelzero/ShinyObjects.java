package levelzero;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {

	public static void main(String[] args) {


		// 2. Ask the user how many shiny objects they want
String dino = JOptionPane.showInputDialog("How many shiny objects do you want?");
int dinonumbers = Integer.parseInt(dino);
		// 3. Play the sound that many times
for (int i = 0; i <dinonumbers ; i++) {
	

		// 1. Call the method below

playMisterZee();
}}

	public static void playMisterZee() {
    	try {
   		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

}

