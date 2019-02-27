package ua.univer.figures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.Arrays;

import ua.univer.figures.RW.FiguresRW;
import ua.univer.figures.RW.PointRW;
import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.*;
import ua.univer.figures.figure.color.ColorLine;
import ua.univer.figures.figure.color.ColorPoint;
import ua.univer.figures.figure.color.IColorAble;
import ua.univer.figures.figure.util.FigureFactory;
import ua.univer.figures.figure.util.AbstractFigureFactory;

public class Program {
	
	public static void showColor(IColorAble color) {
		System.out.println(color.getColor());
	}
	
	public static void writePointToFile (Point p) {
		try(FileWriter FW = new FileWriter(("source" + File.separator +"Point.txt"), true))
		{
			FW.write(p.toString()); 
			FW.close();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {	
		
		//showColor(()-> "red") ;
		
		Point p1 = new Point(1, 2);
		Point p0 = new Point();
		ColorPoint cp1 = new ColorPoint(3, 3, "Red");
		Line l1 = new Line(new Point(4,4), new Point(7,7));
		Line l2 = new Line(5, 5, 6, 6);
		Point p31 = l2.getStart();
		Point p32 = l2.getEnd();
		ColorLine cl1 = new ColorLine(p31, p32, "Blue");
		IFigure[] masFig = new IFigure[5];
		AbstractFigureFactory factory  = new FigureFactory();
		masFig = factory.getListFigure(masFig.length);
		//masFig[0]= p1;
		//masFig[1]= l1;
		//masFig[2]= new Triangle(p0, p1, p31);
		//masFig[3]= cp1 ;
		//masFig[4]= cl1 ;
		/*IColorAble [] masColor = new IColorAble[55];
		int countPoint=0;
		for (int i = 0; i < masFig.length; i++) {
			System.out.println(masFig[i]);
			if(masFig[i] instanceof IColorAble){
				IColorAble color = (IColorAble)masFig[i];
				masColor[countPoint++]=color;
				System.out.println(color.getColor());				
			}
		}*/
		//IFigure fig = new FigureFromConsole().getFigure(new PointSourse());
		//System.out.println(fig);
		
		//IFigure fig1 = new FigureFromConsole().getFigure(new ColorPointSourse());
		//System.out.println(fig1);
		
		//IFigure fig2 = new FigureFromConsole().getFigure(new LineSourse());
		//System.out.println(fig2);
		
		//IFigure fig3 = new FigureFromConsole().getFigure(new ColorLineSourse());
		//System.out.println(fig3);
		
		Point masP [] = new Point [] {
				new Point (1,1) ,
				new Point (22,1) ,
				new Point (3,1) ,
				new Point (55,1) ,		
		};
		
		/*Arrays.sort (masP ,
				(o1,o2)->  ((Point) o1).getX() -((Point) o2).getX());
		System.out.println(Arrays.toString(masP));*/
		
		//Point p123 = new Point(1,158);
		//Point p124 = new Point(1,1);
		
		//PointRW rw = new PointRW () ;
		//rw.writePointToFile(p124);
		//rw.readPointFromFile(new FileInputStream("source"+File.separator+"Point.txt"));
		
		/*try{
			  FileOutputStream fos = new FileOutputStream("source" + File.separator +"Point.txt");
			  ObjectOutputStream outStream = new ObjectOutputStream(fos);
			  outStream.writeObject(p123);
			  outStream.writeObject(p124);
			 // outStream.writeObject(masP);
			  outStream.flush();
			  outStream.close();
			}catch(Exception e)
			{
			System.out.println("Error+e.getMessage()");
			}*/
		
		/*try{  FileInputStream fis = new FileInputStream("source" + File.separator +"Point.txt");
		  ObjectInputStream inputStream = new ObjectInputStream(fis);
		   Point p444 = (Point) inputStream .readObject();
		    inputStream.close();
		    System.out.println(p444.toString());
		    
		}catch(Exception e){
		System.out.println("Error+e.getMessage()");
		}*/
		
		Point p44 = new Point (25,58);
		FiguresRW.writePointToFile(p44);
		Point pRead = FiguresRW.readPointFromFile();
		System.out.println(pRead);
		
		Line l44 = new Line (p1,p0);
		FiguresRW.writeLineToFile(l44);
		Line lRead = FiguresRW.readLineFromFile();
		System.out.println(lRead);
		
		Triangle t44 = new Triangle (p1,p0,new Point(58,52)) ;
		FiguresRW.writeTriangleToFile(t44);
		Triangle tRead = FiguresRW.readTriangleFromFile();
		System.out.println(tRead);
				
	}

}
