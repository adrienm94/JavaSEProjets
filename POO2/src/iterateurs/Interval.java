package iterateurs;

import java.util.ArrayList;
import java.util.Iterator;

public class Interval<T extends Integer> implements Iterable<T> {

	private T début;
	private T fin;
	private ArrayList<T> listeEntiers = new ArrayList<>();

	public Interval() {

	}

	public Interval(T d, T f) {
		if (d <= f) {
			this.début = d;
			this.fin = f;
		} else {
			System.err.println("Erreur de définition de l'intervalle");
		}
	}

	public T getDébut() {
		return début;
	}

	public void setDébut(T début) {
		this.début = début;
	}

	public T getFin() {
		return fin;
	}

	public void setFin(T fin) {
		this.fin = fin;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorInterval<T>(this.listeEntiers);
	}

	public void remplirListe() {
		if (this.listeEntiers.isEmpty()) {
			for (T i = this.début; i < this.fin; i++) {
				this.listeEntiers.add(i);
			}
		} else {
			System.err.println("L'intervalle est déjà rempli.");
		}
	}

	@Override
	public String toString() {
		return "Interval [début=" + this.début + ", fin=" + this.fin + ", intervalle=" + this.listeEntiers + "]";
	}

}
