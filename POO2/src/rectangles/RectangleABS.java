package rectangles;

import java.util.Scanner;

public abstract class RectangleABS implements Rectangle {

	private Point2D pointHG;

	public RectangleABS() {
	};

	public RectangleABS(Point2D pointHG) {
		this.setPointHG(pointHG);
	}

	public Point2D getPointHG() {
		return this.pointHG;
	}

	public void setPointHG(Point2D pointHG) {
		this.pointHG = pointHG;
	}

	public abstract int aire();

	public abstract void saisie(Scanner clavier);

	public abstract Point2D getPointBD();
}
