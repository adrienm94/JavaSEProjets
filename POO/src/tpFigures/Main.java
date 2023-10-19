package tpFigures;

public class Main {

	public static void main(String[] args) {
		
		// Questions 1 à 2
		
		// Création d'un cercle de rayon 3, de centre (1,2) et de couleur rouge
		Cercle c0 = new Cercle("rouge", 3, 1, 2);
		// Affichage du cercle
//		c0.affiche();
		// On change la valeur du rayon en 7
		c0.setRayon(7);
		// toString() appelé sur le cercle
//		System.out.println(c0);
		
		// Questions 3 à 
		
		Cercle c1 = new Cercle("rouge", 4, 1, 0);
		Carre ca1 = new Carre("bleu", 5, 1, 1);
		Cercle c2 = new Cercle("bleu", 2, 1, 3);
		Carre ca2 = new Carre("rouge", 2, 2, 1);
		
		FigureComplexe<Figure> fg1 = new FigureComplexe<>();
		FigureComplexe<Figure> fg2 = new FigureComplexe<>();
		fg2.composeAvec(c2);fg2.composeAvec(ca2);fg2.composeAvec(fg1);
		fg1.composeAvec(c1);fg1.composeAvec(ca1);
		
//		System.out.println(fg1.composantsSimples());System.out.println(fg2.composantsSimples());
		
		System.out.println("fg2 :");
		fg2.affiche();
		System.out.println("Nombre de composants simples : "+fg2.nombreComposantsSimples());
		System.out.println("----------------------------------------------------------------");
		System.out.println("fg1 :");
		fg1.affiche();
		System.out.println("Nombre de composants simples : "+fg1.nombreComposantsSimples());
		System.out.println("----------------------------------------------------------------");
		System.out.println("Extraction des composants simples de couleur rouge sur fg2 :");
		fg2.FigureComplexeExtrait("rouge").affiche();
		
	}

}
