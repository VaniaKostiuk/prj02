package ua.univer.figures.figure.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ua.univer.figures.figure.base.Line;

public class LineSourse implements IFigureSourse{

	public Line getFromConsole() {
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
		return new Line (x,y,x1,y1);
	}
		catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Incorrect try again ");
		}
	}
}
