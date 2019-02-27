package ua.univer.figures.figure.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.color.ColorLine;

public class ColorLineSourse implements IFigureSourse{

	public ColorLine getFromConsole() {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));	
		while(true)
		try {
			System.out.println("Enter PointStart X");
			int x = Integer.parseInt(bf.readLine());
			System.out.println("Enter PointStart Y");
		    int y = Integer.parseInt(bf.readLine());
		    System.out.println("Enter PointFinish X");
			int x1 = Integer.parseInt(bf.readLine());
			System.out.println("Enter PointFinish Y");
		    int y1 = Integer.parseInt(bf.readLine());
		    System.out.println("Enter ColorLine");
		    String colorLine = bf.readLine();
		return new ColorLine (new Point(x,y),new Point (x1,y1),colorLine);
	}
		catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Incorrect try again ");
		}
	}

}
