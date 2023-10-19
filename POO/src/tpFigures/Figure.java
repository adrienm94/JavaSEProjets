package tpFigures;

import java.util.ArrayList;

public abstract class Figure {
	
	public Figure() {
	}

	abstract public void affiche();
	
	public boolean estSimple() {
		if (this instanceof FigureSimple){
			return true;
		} else {
			return false;
		}
	}

	public void construitListe(String c, ArrayList<FigureSimple> v) {
		// TODO Auto-generated method stub
		
	}

	public Object getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}

	public int nombreComposantsSimples() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
