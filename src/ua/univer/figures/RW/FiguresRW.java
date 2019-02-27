package ua.univer.figures.RW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.base.Triangle;

public class FiguresRW {
	
	public static void writePointToFile (Point p) throws FileNotFoundException, IOException {
		ObjectOutputStream obs = 
				new  ObjectOutputStream (
				new FileOutputStream(
				"source"+File.separator+"Point.txt"));
		obs.writeObject(p);
	}
	
	public static Point readPointFromFile () throws ClassNotFoundException, IOException {
		ObjectInputStream obs = 
				new ObjectInputStream(
				new FileInputStream(
				"source"+File.separator+"Point.txt"));
		Point p = (Point)obs.readObject();
		return p;
	}
	
	public static void writeLineToFile (Line l) throws FileNotFoundException, IOException {
		ObjectOutputStream obs = 
				new  ObjectOutputStream (
				new FileOutputStream(
				"source"+File.separator+"Line.txt"));
		obs.writeObject(l);
	}
	
	public static Line readLineFromFile () throws ClassNotFoundException, IOException {
		ObjectInputStream obs = 
				new ObjectInputStream(
				new FileInputStream(
				"source"+File.separator+"Line.txt"));
		Line l = (Line)obs.readObject();
		return l;
	}
	
	public static void writeTriangleToFile (Triangle t) throws FileNotFoundException, IOException {
		ObjectOutputStream obs = 
				new  ObjectOutputStream (
				new FileOutputStream(
				"source"+File.separator+"Triangle.txt"));
		obs.writeObject(t);
	}
	
	public static Triangle readTriangleFromFile () throws ClassNotFoundException, IOException {
		ObjectInputStream obs = 
				new ObjectInputStream(
				new FileInputStream(
				"source"+File.separator+"Triangle.txt"));
		Triangle t = (Triangle)obs.readObject();
		return t;
	}

}
