package levelzero;

import org.jointheleague.graphical.robot.Robot;

public class robot_make_a_spiral {
public static void main(String[] args) {
	Robot hi = new Robot();
	hi.penDown();
for (int i = 0; i <1110 ; i++) {
	hi.setSpeed(10);
	hi.move(20+i);
	hi.turn(15);
	if(i%10 == 0){hi.setRandomPenColor();}
	else{hi.setPenColor(0, 0, 0);}
	
}
}
}