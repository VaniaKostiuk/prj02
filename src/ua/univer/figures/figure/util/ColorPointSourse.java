package ua.univer.figures.figure.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ua.univer.figures.figure.color.ColorPoint;

public class ColorPointSourse implements IFigureSourse{

	public ColorPoint getFromConsole() {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));	
		while(true)
		try {
			System.out.println("Enter Point X");
			int x = Integer.parseInt(bf.readLine());
			System.out.println("Enter Point Y");
		    int y = Integer.parseInt(bf.readLine());
		    System.out.println("Enter Color");
		    String color = bf.readLine();
		return new ColorPoint (x,y,color);
		}
		catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Incorrect try again ");
		}
	}
}
