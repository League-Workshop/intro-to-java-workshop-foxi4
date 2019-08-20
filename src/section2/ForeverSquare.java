package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class ForeverSquare {
	
	// 2. Create a new Robot
Robot iCu = new Robot("mini");
	void go() {
		iCu.penDown();
		// 4. Make the robot move as fast as possible
iCu.setSpeed(100);
		// 5. Set the pen width to 5
iCu.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for(int i=0;true; i++) {
			// 7. Set the pen color to random
	iCu.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
iCu.turn(90);
	}}


	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0;true; i++) {
		iCu.move(200);
		iCu.turn(90);
		iCu.setRandomPenColor();
	}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



