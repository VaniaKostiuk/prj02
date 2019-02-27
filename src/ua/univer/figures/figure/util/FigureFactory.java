package ua.univer.figures.figure.util;

import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.color.ColorLine;
import ua.univer.figures.figure.color.ColorPoint;

public class FigureFactory extends AbstractFigureFactory {
	
	public  IFigure getFigure(int n){
		switch (n) {
		case 0: return new Point(150,250);
		case 1: return new ColorPoint(100,200,"RED");
		case 2: return new Line(new Point(200,200),new Point(130,130));
		case 3: return new ColorLine(new Point(200,200),new Point(150,150),"GREEN");	
    	default: return null;
		}
	}

}
