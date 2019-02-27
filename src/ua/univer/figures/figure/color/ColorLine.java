package ua.univer.figures.figure.color;

import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;

public class ColorLine extends Line {
private String color;

public ColorLine(Point start, Point end, String color) {
	super(start, end);
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "ColorLine [color=" + color + ", toString()=" + super.toString() + "]";
}
   
}
