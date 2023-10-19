package assertions_exceptions;

import java.util.ArrayList;

public class Pile<T> implements IPile<T> {
	
	// structure de stockage interne des éléments
	private ArrayList<T> elements;
	
	// Mise en oeuvre des opérations
	public Pile() {
		initialiser();
	}

	public T depiler() throws PileVideException {
		if (this.estVide()) {
			throw new PileVideException(" On ne peut pas dépiler une pile vide.");
		}
		int tailleInit = this.nbElements();
		T sommet = elements.get(elements.size() - 1);
		elements.remove(sommet);
		assert this.nbElements() == tailleInit - 1 : "La pile doit avoir un nombre d'éléments diminué de 1";
		return sommet;
	}

	public void empiler(T t) throws PileVideException, PilePleineException {
		int tailleInit = this.nbElements();
		elements.add(t);
		assert this.nbElements() == tailleInit + 1 : "La pile doit avoir un nombre d'éléments augmenté de 1";
		assert this.sommet() == t : "dernier empilé :"+this.sommet();
	}

	public boolean estVide() {
		return elements.isEmpty();
	}

	public void initialiser() {
		elements = new ArrayList<T>();
		assert this.estVide() : "Pile vide :" + this.estVide();
	}

	public T sommet() throws PileVideException {
		if (this.estVide()) {
			throw new PileVideException("Pile vide");
		}
		return elements.get(elements.size() - 1);
	}
	
	public int nbElements(){
		return elements.size();
	}

    @Override
	public String toString() {
		return "Pile = " + elements;
	}
    
}

	


