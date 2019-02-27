package ua.univer.figures.figure.base;

import java.io.Serializable;

import ua.univer.figures.figure.IFigure;

public class Triangle implements IFigure, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Point apexA, apexB, apexC;
	Line sideAB, sideBC, sideAC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
	//	sideAB = new Line(apexA, apexB); 
	}
    
	public Line getSideAB(){
		if(sideAB==null)sideAB = new Line(apexA, apexB);
		return sideAB;
		}	
		public double getSideABLength(){
			return getSideAB().GetLength();
		}
		public double Perimetr(){
			return getSideABLength();
	}
	

	
}
