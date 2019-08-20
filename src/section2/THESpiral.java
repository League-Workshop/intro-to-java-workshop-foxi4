package section2;

import org.jointheleague.graphical.robot.Robot;

public class THESpiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot iCu = new Robot();
		// 5. Set your robot's pen down 
		iCu.penDown();
		iCu.hide();
		// 3. Set the robot to go at max speed (100)
		iCu.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int i=0; true; i++) {
			// 7. Change the pen color to random
			iCu.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			iCu.move(1*i);
			// 2. Turn the robot 360/7 degrees to the right
		iCu.turn(360/7);
			// 8. Set the pen width to i
			iCu.setPenWidth(i);
		}
	}
}
