package rectangles;

import java.util.Scanner;

public interface Rectangle {
	//sorte de classe abstraite avec des restrictions supplémentaires	
	// 1ere catégorie
	// tout d'abord ce que je peux mettre dans une classe abstraite
	// méthodes public abstract
	// comme tout est public dans une interface
	// on peut enlever 'public'
	// on peut aussi enlever 'abstract' car il n'y a pas
	// d'ambiguité
	int aire(); 
	void saisie(Scanner clavier); 
	Point2D getPointHG();
	Point2D getPointBD();
		
	// 2e catégorie n'existe pas dans les classes abstraites
	// (avec 'default'), mais on peut les écrire sans 'default'
	// méthode public default
	// on peut enlever 'public'	
	// on peut l'écrire car elle appelle
	// une autre méthode déclarée dans l'interface
	// default est pour dire : comportement 'par défaut', 'de base' 'minimum'
	// elle a forcément un corps
	// elle sert à factoriser, pour ne pas dupliquer
	
	default String infos() {
		return "rectangle, d'aire "+this.aire();
	}

  // on ne met pas les méthodes de Object 
  // dans une interface, ex. toString, equals
	
	// 3e catégorie de méthode
	// méthode public static
	// on peut enlever 'public'	
	// ne s'applique pas à un objet
	// peut exister dans une classe abstraite
  
 static boolean deMemeAire(Rectangle r1, Rectangle r2) {
		return r1.aire() == r2.aire();
	}
	
	// Une SEULE catégorie possible d'attribut
	// attribut 
	// - public 
	// - static (~global, pas relatif à un objet) 
	// - final (~ constant)
	
	int nbCotes=4; //public static final
	
	// Différence entre interface et classe abstraite :
	// dans les interfaces :
	// - On ne peut pas mettre de constructeur
	// - Tout est public
	// - Les attributs sont forcément static final
	// - Les méthodes sont : abstract ou static ou default
}