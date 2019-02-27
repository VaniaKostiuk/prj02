package ua.univer.figures.gui;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ua.univer.figures.figure.IFigure;
import ua.univer.figures.figure.base.Line;
import ua.univer.figures.figure.base.Point;
import ua.univer.figures.figure.util.FigureFactory;

public class FormFirgures {
	static int count = 0;
	static Graphics gr;
	static IFigure[] masFig;

	public static void drawFigure(IFigure f) {
		if (f instanceof Point) {
			Point p = (Point) f;
			gr.drawOval(p.getX(), p.getY(), 10, 10);
		}
		if (f instanceof Line) {
			Line l = (Line) f;
			gr.drawLine(l.getStart().getX(), l.getStart().getY(), l.getEnd().getX(), l.getEnd().getY());
		}
	}

	public static void main(String[] args) {
		
		masFig = new IFigure[100];
		masFig = new FigureFactory().getListFigure(masFig.length);

		//Point[] masPoint = new Point[10];
		//for (int i = 0; i < masPoint.length; i++) {
		//	masPoint[i] = new Point(100 + i * 10, 100 + i * 10);
		//}
		
		JFrame win = new JFrame();
		win.setSize(200, 300);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		JButton button = new JButton("Ok");
		button.addActionListener((e) -> {
			button.setText("Press");
			gr = panel.getGraphics();
			for (int i = 0; i < masFig.length; i++) {
				//gr.drawOval(masPoint[i].getX(), masPoint[i].getY(), 20, 20);
				drawFigure(masFig[i]);
			}
		}
		);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON2) {
					count = 0;
				}
				if (e.getButton() == MouseEvent.BUTTON1) {
					// gr.setColor(Color.getColor("RED"));
					masFig[count++] = new Point(e.getX(), e.getY());
					gr.drawOval(e.getX(), e.getY(), 20, 20);

				}
			}

		});
		panel.add(button);
		win.add(panel);
		win.setVisible(true);

	}

}
