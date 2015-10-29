package levelzero;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */

		String meow = JOptionPane.showInputDialog("What animal do you like?");
		if (meow.equalsIgnoreCase("dog")) {
			playWoof();
		} else if (meow.equals("cow")) {
			playMoo();
		} else if (meow.equals("duck")) {
			playQuack();
		} else if (meow.equals("")) {
			playLlama();
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	String quackFile = "/Users/workshop/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/workshop/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/workshop/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/workshop/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/workshop/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
