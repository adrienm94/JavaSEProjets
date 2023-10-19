package rectangles;

import java.util.Scanner;

public class Rectangle2pts extends RectangleABS {

	private Point2D pointBD;
	
	public Rectangle2pts() {
		
	}
	
	public Rectangle2pts(Point2D pointHG, Point2D pointBD) {
		super(pointHG);
		this.setPointBD(pointBD);
	}

	public Point2D getPointBD() {
		return this.pointBD;
	}

	public void setPointBD(Point2D pointBD) {
		if ((pointBD.getX() >= this.getPointHG().getX()) && (pointBD.getY() >= this.getPointHG().getY())) {
			this.pointBD = pointBD;
		}
		
	}
	
	@Override
	public int aire() {
		return (this.pointBD.getX() - this.getPointHG().getX())*(this.pointBD.getY() - this.getPointHG().getY());
	}

	@Override
	public void saisie(Scanner clavier) {
		Point2D nouveauPointHG = new Point2D();
		Point2D nouveauPointBD = new Point2D();
		System.out.println("point d'origine ?");
		nouveauPointHG.saisie(clavier);
		System.out.println("point en bas à droite ?");
		nouveauPointBD.saisie(clavier);
		this.setPointBD(nouveauPointBD);
		this.setPointHG(nouveauPointHG);
	}
	
}
