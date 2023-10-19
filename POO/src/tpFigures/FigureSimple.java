package tpFigures;

public abstract class FigureSimple extends Figure{

	private String couleur;

	public FigureSimple() {
	}

	public FigureSimple(String c) {
		couleur = c;
	}

	public void affiche() {
		System.out.println("Figure Simple, de couleur" + getCouleur());
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String c) {
		couleur = c;
	}

	@Override
	public String toString() {
		return "FigureSimple [couleur=" + this.couleur + "]";
	}
	
	

}
