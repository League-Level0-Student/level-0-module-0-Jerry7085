package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	private void drawPattern() {
		
		//  Create a new Robot
		Robot jerry = new Robot();
		//  Put the robot's pen down
		jerry.penDown();
		//  SPEED. Make the robot go at maximum speed (100)
		jerry.setSpeed(100);
		//  COLOR. Set the pen to a color that you like for the shape
		jerry.setPenColor(Color.blue);
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape has.
		//  				(Hint: its called PentagonCrazy)
		int sides = 5;
		//  TURN ANGLE. Make another int variable for the angle you want the robot to turn. 
		//  			Hint: Divide 360 by the number of sides the shape has.
		int angle = 360/sides;
		//  LOOP. Use a for loop to repeat ALL the following lines of code 200 times. 
		for (int i = 0; i < 200; i++) {
			
		
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
		jerry.move(i);
				//  TURN.  Turn the robot the amount in your angle variable + 1
		jerry.turn(360/sides + 1);

		// Hide the robot so you can see the pattern.
		jerry.hide();
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		}
		}
		

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	
	public static void main(String[] args) {
		new PentagonCrazy().drawPattern();
	}
}
