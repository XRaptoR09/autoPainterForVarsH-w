import java.awt.*;
import java.awt.event.*;			//or: import java.awt.event.WindowAdapter;&import java.awt.event.WindowEvent;
public class DollyPainterForVars extends Frame{		//Розширяє або наслідує клас Frame
//			 subclass			 superclass
	public static void main(String[] args) {
		DollyPainterForVars autoFirst = new DollyPainterForVars("MyFirstAuto");
		autoFirst.setSize(1300, 600);
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

	

	public void paint(Graphics g) {
	// //! Dolly for variables
	// //*Declarating variables
	// int headX = 80, headY = 100, headDiameter = 20;
	// //int xShiftBeetweenDollies = 20;
	// int yShiftBeetweenDollies = 20;
	// //*Countable variables
	// int dollyWidth, dollyHeight;
	// int centerDiameter = headDiameter * 2,
	// 	centerX = (headX + (headDiameter / 2)) - (centerDiameter / 2),
	// 	centerY = (headY + headDiameter),
	
	// 	handsDiameter = headDiameter / 2,
	// 	leftHandX = (centerX - handsDiameter),
	// 	handsY = ((centerY + (centerDiameter / 2)) - (handsDiameter / 2)),
	// 	rightHandX = (centerX + centerDiameter),
	
	// 	bottomDiameter = centerDiameter * 2,
	// 	bottomX =  (headX + (headDiameter / 2)) - (bottomDiameter / 2),
	// 	bottomY = (centerY + centerDiameter),
	
	// 	eyesDiameter = (headDiameter / 10),
	// 	eyesPadding = (eyesDiameter * 3),
	// 	leftEyeX = (headX + eyesPadding),
	// 	rightEyeX = (((headX + headDiameter) - eyesPadding) - eyesDiameter),
	// 	eyesY = (headY+(headDiameter / 3));
	// 	// dollyWidth = bottomDiameter;
	// 	// int xDollyPadding = xShiftBeetweenDollies;

	// 	dollyHeight = headDiameter + (centerDiameter + bottomDiameter);
	// 	int yDollyPadding = dollyHeight + yShiftBeetweenDollies;

	// 	//!Code

	// 	if (bottomX < 0) {
	// 		System.out.println("headX is too small!!!");
	// 	}else{
	// 		if (headY < 0) {
	// 			System.out.println("headY is too small!!!");
	// 		}else{
	// 			for (int i = 0; i < 3; i++) {		
	// 				g.drawOval(headX, headY + yDollyPadding * i, headDiameter, headDiameter);	//head
	// 				g.drawOval(centerX, centerY + yDollyPadding * i, centerDiameter, centerDiameter);	//center
	// 				g.drawOval(leftHandX, handsY + yDollyPadding * i, handsDiameter, handsDiameter);	//leftHand  
	// 				g.drawOval(rightHandX, handsY + yDollyPadding * i, handsDiameter, handsDiameter);	//rightHand
	// 				g.drawOval(bottomX, bottomY + yDollyPadding * i, bottomDiameter, bottomDiameter);	//bottom
	// 				g.drawOval(leftEyeX, eyesY + yDollyPadding * i, eyesDiameter, eyesDiameter);		//leftEye
	// 				g.drawOval(rightEyeX, eyesY + yDollyPadding * i, eyesDiameter, eyesDiameter);		//rightEye
					
	// //				xShiftBeetweenDollies = xShiftBeetweenDollies + xDollyPadding + dollyWidth;
	// //				yShiftBeetweenDollies = yShiftBeetweenDollies + yDollyPadding + dollyHeight;
	// 			}
	// 		}
	// 	}

		//drawRect(8, 30, 10, 10);		Фигура с координатами 0;0;
		//! Carriage for variables
		//*Declarating variables
		int roofY = 10, roofWidth = 920, roofHeight = 8;
		int leftConnectX = 150, connectSize = 40, connectPaddingFromBottom = 15;
		int mainWidth = 900, mainHeight = 300;
		int wheelDiameter = 80, wheelPadding = 80;
		int windowSize = 100, windowPadding = 100;

		//*Countable variables
		//Добавляем смещение из-за начала координат вне Фрейма
		roofY = roofY + 30;
		leftConnectX = leftConnectX + 8;

		int	mainY = (roofY + roofHeight),
		mainX = (leftConnectX + connectSize),
		
		roofX = (mainX - ((roofWidth - mainWidth) / 2)),
		
		connectY = (((mainY + mainHeight) - connectPaddingFromBottom) - connectSize),
		rightConnectX = (mainX + mainWidth),
		
		wheelsY = (mainY + mainHeight),
		wheel1X = (mainX + wheelPadding),
		wheel2X = (wheel1X + wheelDiameter),
		wheel4X = ((rightConnectX - wheelPadding) - wheelDiameter),
		wheel3X = (wheel4X - wheelDiameter),
		
		windowsY = (mainY + (windowSize / 2)),
		windowX = (mainX + windowPadding);

		//!Code
		if (roofWidth < mainWidth) {
			System.out.println("Roof is too short!!!");
		}else{
			g.drawRect(mainX, mainY, mainWidth, mainHeight);				//main
			g.drawRect(roofX, roofY, roofWidth, roofHeight);				//roof
			g.drawRect(leftConnectX, connectY, connectSize, connectSize);		//connect-left
			g.drawRect(rightConnectX, connectY, connectSize, connectSize);	//connect-right
			g.drawOval(wheel1X, wheelsY, wheelDiameter, wheelDiameter);		//wheel1
			g.drawOval(wheel2X, wheelsY, wheelDiameter, wheelDiameter);		//wheel2
			g.drawOval(wheel3X, wheelsY, wheelDiameter, wheelDiameter);		//wheel3
			g.drawOval(wheel4X, wheelsY, wheelDiameter, wheelDiameter);		//wheel4
			for(int i = 0; i < 4; i++) {									//windows
				g.drawRect(windowX, windowsY, windowSize, windowSize);		
				windowX = windowX + (windowSize * 2);
			}
		}
	}
}
