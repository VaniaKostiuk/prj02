package ua.univer.figures.figure.base;

import java.io.Serializable;

import ua.univer.figures.figure.IFigure;

public class Line implements IFigure,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point start;
	private Point end;
	
	public Line(Point start, Point end) {		
		this.start = start;
		this.end = end;
	}
	public Line(int x1, int y1, int x2, int y2) {		
		this(new Point(x1, y1),new Point(x2, y2));
	}
	
	public Point getStart() {
		return start;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}
	public double GetLength() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(start.getX()-end.getX(), 2)
				+Math.pow(start.getX()-end.getX(), 2));
	}
	
}
