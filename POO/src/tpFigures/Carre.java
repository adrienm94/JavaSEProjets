package tpFigures;

public class Carre extends FigureSimple {

	private float cote, xHautGauche, yHautGauche;

	public Carre() {
	}

	public Carre(String coul, float cot, float x, float y) {
		super(coul);
		cote = cot;
		xHautGauche = x;
		yHautGauche = y;
	}

	public void affiche() {
		System.out.println("Carre " + getCouleur());
	}

	public float getCote() {
		return cote;
	}

	public void setCote(float c) {
		cote = c;
	}

	public float getXHautGauche() {
		return xHautGauche;
	}

	public void setXHautGauche(float x) {
		xHautGauche = x;
	}

	public float getYHautGauche() {
		return yHautGauche;
	}

	public void setYHautGauche(float y) {
		yHautGauche = y;
	}
	
	@Override
	public String toString() {
		return "Carre [cote=" + this.cote + ", xHautGauche=" + this.xHautGauche + ", yHautGauche=" + this.yHautGauche + ", toString()="
				+ super.toString() + "]";
	}

}
