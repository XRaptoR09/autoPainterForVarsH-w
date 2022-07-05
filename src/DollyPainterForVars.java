import java.awt.*;
import java.awt.event.*;			//or: import java.awt.event.WindowAdapter;&import java.awt.event.WindowEvent;
public class DollyPainterForVars extends Frame{		//Розширяє або наслідує клас Frame
//			 subclass			 superclass
	public static void main(String[] args) {
		DollyPainterForVars autoFirst = new DollyPainterForVars("MyFirstAuto");
		autoFirst.setSize(500, 600);
		autoFirst.setVisible(true);
		
	}
	DollyPainterForVars(String title){
		super(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}

	//! Dolly for variables
	//*Declarating variables
	int headX = 220, headY = 160, headDiameter = 50;
	
	//*Countable variables
	int centerDiameter = headDiameter * 2,
		centerX = (headX + (headDiameter / 2)) - (centerDiameter / 2),
		centerY = (headY + headDiameter),
	
		handsDiameter = headDiameter / 2,
		leftHandX = (centerX - handsDiameter),
		handsY = ((centerY + (centerDiameter / 2)) - (handsDiameter / 2)),
		rightHandX = (centerX + centerDiameter),
	
		bottomDiameter = centerDiameter * 2,
		bottomX =  (headX + (headDiameter / 2)) - (bottomDiameter / 2),
		bottomY = (centerY + centerDiameter),
	
		eyesDiameter = (headDiameter / 10),
		eyesPadding = (eyesDiameter * 3),
		leftEyeX = (headX + eyesPadding),
		rightEyeX = (((headX + headDiameter) - eyesPadding) - eyesDiameter),
		eyesY = (headY+(headDiameter / 3));


	public void paint(Graphics g) {
		if (bottomX < 0) {
			System.out.println("headX is too small!!!");
		}else{
			g.drawOval(headX, headY, headDiameter, headDiameter);	//head
			g.drawOval(centerX, centerY, centerDiameter, centerDiameter);	//center
			g.drawOval(leftHandX, handsY, handsDiameter, handsDiameter);	//leftHand  
			g.drawOval(rightHandX, handsY, handsDiameter, handsDiameter);	//rightHand
			g.drawOval(bottomX, bottomY, bottomDiameter, bottomDiameter);	//bottom
			g.drawOval(leftEyeX, eyesY, eyesDiameter, eyesDiameter);		//leftEye
			g.drawOval(rightEyeX, eyesY, eyesDiameter, eyesDiameter);		//rightEye
		}
	}
}
