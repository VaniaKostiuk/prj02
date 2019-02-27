package ua.univer.figures.figure.util;

import ua.univer.figures.figure.IFigure;

public abstract class AbstractFigureFactory {
	abstract IFigure getFigure(int n);
 
 private  final static int COUNT_FIGURE = 4 ;
 public IFigure [] getListFigure (int n) {
		IFigure [] mas = new IFigure[n] ;
		for (int i = 0; i < mas.length; i++) {
			mas [i] = getRandomFigure();
		}
			return mas;
	}
	public IFigure getRandomFigure () {
		return getFigure((int)Math.random()*COUNT_FIGURE);
	}
}
