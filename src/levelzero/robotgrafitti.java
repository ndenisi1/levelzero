package levelzero;

import org.jointheleague.graphical.robot.Robot;

public class robotgrafitti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot Jeff=new Robot(); 
		Jeff.penDown();
		Jeff.setRandomPenColor();
		Jeff.setSpeed(10);
		for (int i = 0; i < args.length; i++) {
			
		
		Jeff.move(300);
Jeff.turn(135);
Jeff.move(400);
Jeff.turn(225);
Jeff.move(300);}
	}

}
