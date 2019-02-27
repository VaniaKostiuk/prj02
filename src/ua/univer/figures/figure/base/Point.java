package ua.univer.figures.figure.base;

import java.io.Serializable;

import ua.univer.figures.figure.IFigure;

public class Point implements IFigure ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	public Point() {
		this(0,0);
	}
	public Point(int x) {	
		this(x,0);		
	}
	
	public Point(int x, int y) {	
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {		
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
