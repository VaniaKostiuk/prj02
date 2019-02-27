package ua.univer.figures.RW;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import ua.univer.figures.figure.base.Point;

public class PointRW {

	public static void writePointToFile(Point p) {
		try (FileWriter FW = new FileWriter(("source" + File.separator + "Point.txt"), true)) {
			FW.write(p.toString());
			FW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readPointFromFile(InputStream in) {
		try {
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
