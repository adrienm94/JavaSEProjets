package rectangles;

import java.util.List;
import java.util.ArrayList;

public class DessinAvecTousLesRectangles {
	// attributs
	// ici Rectangle est utilisé comme un type
	// (comme une classe) = pour typer des variables
  // List est une interface qui déclare
  // toutes les méthodes utilisables
  // sur les listes
	
	private List<Rectangle> listeRectangles
										= new ArrayList<>();
	
	// constructeurs
	
	public DessinAvecTousLesRectangles() {}
	
	// méthodes avec un code 'générique'
  // il est écrit sans connaître
  // l'implémentation par une ou plusieurs classes
  // des rectangles
  // API Application Programming Interface
	
	public void ajoute(Rectangle r) {
		if (! listeRectangles.contains(r))
			listeRectangles.add(r);
	}
	
	public double aireMoyenne() {
		int sommeAires=0;
		for (Rectangle rect : listeRectangles)
			sommeAires+=rect.aire();
		if (listeRectangles.isEmpty())
		{
			return 0;
		}
		else 
		{
			return sommeAires/listeRectangles.size();
		}
	}
	
}
