package tpFigures;

public class Cercle extends FigureSimple {

	private float rayon, xcentre, ycentre;

	public Cercle() {
	}

	public Cercle(String coul, float r, float x, float y) {
		super(coul);
		rayon = r;
		xcentre = x;
		ycentre = y;
	}

	public void affiche() {
		System.out.println("Cercle " + getCouleur());
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float r) {
		rayon = r;
	}

	public float getXcentre() {
		return xcentre;
	}

	public void setXcentre(float x) {
		xcentre = x;
	}

	public float getYcentre() {
		return ycentre;
	}

	public void setYcentre(float y) {
		ycentre = y;
	}
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + this.rayon + ", xcentre=" + this.xcentre + ", ycentre=" + this.ycentre + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
