package rectangles;

import java.util.Scanner;

public class Carre1Pt1Lg implements Carre{

	private Point2D pointHG;
	private int lg;
	
	public Carre1Pt1Lg() {}
	
	public Carre1Pt1Lg(Point2D pointHG, int lg) {
		this.setPointHG(pointHG);
		this.setLg(lg);
	}

	public Point2D getPointHG() {
		return this.pointHG;
	}

	public void setPointHG(Point2D pointHG) {
		this.pointHG = pointHG;
	}

	public int getLg() {
		return this.lg;
	}

	public void setLg(int lg) {
		if (lg >= 0) {
			this.lg = lg;
		}
	}

	@Override
	public int aire() {
		return this.lg*this.lg;
	}

	@Override
	public void saisie(Scanner clavier) {
		System.out.println("point d'origine ?");
		this.pointHG.saisie(clavier);
		System.out.println("côté (lg) ?");
		this.lg = clavier.nextInt();
	}

	@Override
	public int cote() {
		return this.lg;
	}

	@Override
	public String toString() {
		return "Carre1Pt1Lg [pointHG=" + this.pointHG.toString() + ", lg=" + this.lg + "]";
	}

	@Override
	public Point2D getPointBD() {
		Point2D pointBD = new Point2D();
		pointBD.setX(this.pointHG.getX()+this.lg);
		pointBD.setY(this.pointHG.getY()+this.lg);
		return pointBD;
	}
	
	
	
}
