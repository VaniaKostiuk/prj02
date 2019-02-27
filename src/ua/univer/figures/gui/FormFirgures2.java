package ua.univer.figures.gui;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.base.Triangle;

public class FormFirgures2 {
	static int count = 0;
	static Graphics gr;

	public static void main(String[] args) {

		IFigure[] masFig = new IFigure[3];
		masFig[0] = new Point(1, 1);
		masFig[1] = new Line(20, 20, 35, 30);
		masFig[2] = new Triangle(new Point(40, 20), new Point(40, 90), new Point(110, 50));
		
		FormFirgures2.PF(masFig);
		
		
		
	}

		public static void PF (IFigure [] masFig ) {
		
		JFrame win = new JFrame();
		win.setSize(200, 300);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Ok");
		
		button.addActionListener((e) -> {
			gr = panel.getGraphics();
			for (int i = 0; i < masFig.length; i++) {
				if (masFig[i] instanceof Line) {
					Line p = (Line) masFig[i] ;
					Point a = p.getEnd();
					Point b = p.getStart();
					gr.drawLine(b.getX(), b.getY() , a.getX() , a.getY());
				}
				if (masFig[i] instanceof Triangle) {
					//Triangle p = (Triangle) masFig[i] ;
					//Point a = p.getApexA();
					//Point b = p.getApexB();
					//Point c = p.getApexC();
					
					//gr.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
					//gr.drawLine(b.getX(), b.getY(), c.getX(), c.getY());
					//gr.drawLine(c.getX(), c.getY(), a.getX(), a.getY());
					;}
			}});
	
		panel.add(button);
		win.add(panel);
		win.setVisible(true);

	}
		
		

}
