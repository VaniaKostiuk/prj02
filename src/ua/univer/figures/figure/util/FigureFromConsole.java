package ua.univer.figures.figure.util;

import ua.univer.figures.figure.IFigure;

public class FigureFromConsole extends AbstractFigureFactory {
	public IFigure getFigure (IFigureSourse sourse) {
		return sourse.getFromConsole () ;
	}
	@Override
	IFigure getFigure(int n) {
		// TODO Auto-generated method stub
		switch (n) {
		case 0: new PointSourse().getFromConsole();
		case 1: new ColorPointSourse().getFromConsole();
		case 2: new LineSourse().getFromConsole();
		case 3: new ColorLineSourse().getFromConsole();	
    	default: return null;
		}
	}
}
