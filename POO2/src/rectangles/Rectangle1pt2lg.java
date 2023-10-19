package rectangles;

import java.util.Scanner;

public class Rectangle1pt2lg extends RectangleABS {

	private int lgx;
	private int lgy;
	
	public Rectangle1pt2lg() {
		
	}
	
	public Rectangle1pt2lg(Point2D pointHG, int lgx, int lgy) {
		super(pointHG);
		this.setLgx(lgx);
		this.setLgy(lgy);
	}

	public int getLgx() {
		return this.lgx;
	}

	public void setLgx(int lgx) {
		if (lgx >= 0) {
			this.lgx = lgx;
		}
	}

	public int getLgy() {
		return this.lgy;
	}

	public void setLgy(int lgy) {
		if (lgy >= 0) {
			this.lgy = lgy;
		}
	}
	
	@Override
	public int aire() {
		return this.lgx*this.lgy;
	}

	@Override
	public void saisie(Scanner clavier) {
		System.out.println("point d'origine ?");
		this.getPointHG().saisie(clavier);
		System.out.println("longueur lgx ?");
		this.setLgx(clavier.nextInt());
		System.out.println("longueur lgy ?");
		this.setLgy(clavier.nextInt());
	}

	@Override
	public Point2D getPointBD() {
		Point2D pointBD = new Point2D();
		pointBD.setX(this.getPointHG().getX()+this.lgx);
		pointBD.setY(this.getPointHG().getY()+this.lgy);
		return pointBD;
	}
	
	
	
}
