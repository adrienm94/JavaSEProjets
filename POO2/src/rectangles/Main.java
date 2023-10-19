package rectangles;

import java.util.Scanner;

public class Main {
	// vous décommenterez les isntructions
	// au fur et à mesure de l'avancement de
	// votre programme

	public static void main(String[] arg) {
		Scanner clavier = new Scanner(System.in);
		// System.in est le 'cin' de C++
		try {
			// boolean b = clavier.nextBoolean();
			// String s = clavier.next();

			Point2D p1 = new Point2D(1, 2);
			Point2D p2 = new Point2D(3, 3);
			Point2D p3 = new Point2D(4, 5);

			Rectangle r1 = new Rectangle1pt2lg(p1, 2, 3);
			Rectangle r2 = new Rectangle1pt2lg(p2, 3, 4);

			Rectangle r3 = new Rectangle2pts(p1, p2);
			Rectangle r4 = new Rectangle2pts(p1, p3);
			
			Carre r6 = new Carre1Pt1Lg(p1, 5);
			Carre r7 = new Carre1Pt1Lg(new Point2D(), 0);
			r7.saisie(clavier);

			// Dessin dans lequel on peut mettre des rectangles
			// quel que soit leur type, pourvu que
			// ce type implémente l'interface Rectangle

			DessinAvecTousLesRectangles dessin = new DessinAvecTousLesRectangles();
			dessin.ajoute(r1);
			dessin.ajoute(r2);
			dessin.ajoute(r3);
			dessin.ajoute(r4);
			dessin.ajoute(r6);
			dessin.ajoute(r7);
			System.out.println("aire moyenne " + dessin.aireMoyenne());

			// Rectangle est un type de variable
//			Rectangle r5;
//			// r5 = new Rectangle(); //impossible car Rectangle 'abstrait'
//			r5 = new Rectangle2pts(p1, p3); // affectation polymorphe
			// type de la variable (rectangle)
			// est un super-type du type de l'objet (Rectangle2pts)

			// appel de la méthode static
			System.out.println("r3 et r4 meme aire ? " + Rectangle.deMemeAire(r3, r4));

			// même si les rectangles ont des implémentations différentes
			System.out.println("r1 et r4 meme aire ? " + Rectangle.deMemeAire(r1, r4));

			// appel de la méthode default
			// sur un objet
			System.out.println("r3 infos " + r3.infos());
			
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// clavier.close();
	}
}