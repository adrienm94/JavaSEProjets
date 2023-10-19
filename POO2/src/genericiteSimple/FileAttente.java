package genericiteSimple;

import java.util.ArrayList;

public class FileAttente<E> {
//	private String nomFile;
	private static int nbEntreesTotal = 0;
	private ArrayList<E> contenu;

	public FileAttente() {
		this.contenu = new ArrayList<E>();
	}
	
	public static int getNbEntreesTotal() {
		return FileAttente.nbEntreesTotal;
	}
	
	public static boolean memeObjets(FileAttente<?> f1, FileAttente<?> f2) {
		if (f1.nbElements() == f2.nbElements()) {
			int i = 0;
			boolean res = true;
			while (i < f1.nbElements() && res) {
				if (!f1.contenu.get(i).equals(f2.contenu.get(i))) {
					res = false;
				}
				i++;
			}
			return res;
		} else {
			return false;
		}
	}
	
	public boolean memeObjetsNonStatic(FileAttente<E> f) {
		if (f.nbElements() == this.nbElements()) {
			int i = 0;
			boolean res = true;
			while (i < f.nbElements() && res) {
				if (!f.contenu.get(i).equals(this.contenu.get(i))) {
					res = false;
				}
				i++;
			}
			return res;
		} else {
			return false;
		}
	}
	
	public boolean memeLongueur(FileAttente<?> f) {
		if (f.nbElements() == this.nbElements()) {
			return true;
		} else {
			return false;
		}
	}
	

	public void entre(E p) {
		this.contenu.add(p);
		nbEntreesTotal++;
	}

	public E sort() {
		E p = null;
		if (!contenu.isEmpty()) {
			p = contenu.get(0);
			contenu.remove(0);
		}
		return p;
	}

	public int nbElements() {
		return this.contenu.size();
	}

	public boolean estVide() {
		return this.contenu.isEmpty();
	}

	public String toString() {
		return "" + descriptionContenu();
	}

	private String descriptionContenu() {
		String resultat = "";
		for (E p : this.contenu)
			resultat += p + " ";
		return resultat;
	}
}