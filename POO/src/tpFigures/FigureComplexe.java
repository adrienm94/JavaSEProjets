package tpFigures;

import java.util.ArrayList;

public class FigureComplexe<F extends Figure> extends Figure {

	private ArrayList<F> ensembleFig;
	private static String tab = "";
	
	public FigureComplexe() {
		this.ensembleFig = new ArrayList<>();
	}
	
	public void composeAvec(F f) {
		this.ensembleFig.add(f);
	}
	
	public void construitListe(String c, ArrayList<FigureSimple> v) {
		for (F f : this.ensembleFig) {
			if (!f.estSimple()) {
				f.construitListe(c, v);
			} else {
				if (f.getCouleur().equals(c)) {
					v.add((FigureSimple) f);
				}
			}
		}
//		System.out.println(v);
	}
	

	public FigureComplexe<FigureSimple> FigureComplexeExtrait(String c) {
		ArrayList<FigureSimple> l = new ArrayList<>();
		FigureComplexe<FigureSimple> res = new FigureComplexe<>();
		this.construitListe(c, l);
		for (FigureSimple f : l) {
			res.composeAvec(f);
		}
		return res;
	}
	
	public boolean composantsSimples() {
		for (F f : this.ensembleFig) {
			if (!f.estSimple()) {
				return false;
			}
		}
		return true;
	}	
	
	public int nombreComposantsSimples() {
		int nbComposantsSimples = 0;
		for (F f : this.ensembleFig) {
			if (!f.estSimple()) {
				nbComposantsSimples += f.nombreComposantsSimples();
			}
			else {
				nbComposantsSimples++;
			}
		}
		return nbComposantsSimples;
	}
			
	public void affiche() {
//		System.out.println("Figure complexe :");
		for (F f : this.ensembleFig) {
			if (!f.estSimple()) { // Cas figure complexe
				FigureComplexe.tab += "\t";
				f.affiche();
			} else { // Cas figure simple
				System.out.print(FigureComplexe.tab);
				f.affiche();
			}
		}
		FigureComplexe.tab = "";
	}
	
	
	
}
