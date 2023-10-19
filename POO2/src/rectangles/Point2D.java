package rectangles;

import java.util.Scanner;

public class Point2D {

	private int x, y;
	
	public Point2D(){}
	
	public Point2D(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}
	
	public void saisie(Scanner sc) {
		System.out.println("Abscisse ? (x)");
		this.setX(sc.nextInt());
		System.out.println("Ordonnée ? (y)");
		this.setY(sc.nextInt());
	}

	@Override
	public String toString() {
		return "Point2D [x=" + this.x + ", y=" + this.y + "]";
	}
	
	
	
}
