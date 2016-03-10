package levelzero;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String num= JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
int numforreals=Integer.parseInt(num);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (numforreals>3){
	JOptionPane.showMessageDialog(null, "YOU ARE A CRAZY CAT LADY!!!!!!!!");
}
		// 4. If they have 3 or less, call the method below to show them a cat 

else if (numforreals<3&&numforreals>0){
	playVideo("https://www.youtube.com/watch?v=q1dpQKntj_w");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
else if (numforreals==(0)){
	playVideo("https://www.youtube.com/watch?v=wam8D3J6CDk");
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
