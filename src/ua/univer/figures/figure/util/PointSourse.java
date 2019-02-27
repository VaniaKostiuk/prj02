package ua.univer.figures.figure.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ua.univer.figures.figure.base.Point;

public class PointSourse implements IFigureSourse {
	public Point getFromConsole() {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));	
		while(true)
		try {
			System.out.println("Enter Point X");
			int x = Integer.parseInt(bf.readLine());
			System.out.println("Enter Point Y");
		    int y = Integer.parseInt(bf.readLine());
		    return new Point(x,y);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Incorrect try again ");
		}
	}
}
