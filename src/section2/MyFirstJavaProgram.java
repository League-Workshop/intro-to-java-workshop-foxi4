package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot iCu = new Robot();
	iCu.setSpeed(200);
		iCu.penDown();
		for(int i=0;i<4; i++){
		iCu.move(200);
		iCu.turn(90);
	}
	
	}
}
