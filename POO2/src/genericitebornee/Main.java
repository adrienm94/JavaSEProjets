package genericitebornee;

public class Main {

	public static void main(String[] args) {
		
		Rayon<Livre> r1 = new Rayon<>();
		Rayon<Produit> r2 = new Rayon<>();
		
		Produit p1 = new Produit("Vodka");
		Produit p2 = new Produit("Gin");
		Produit p3 = new Produit("Vin");
		
		Livre l1 = new Livre("20000 lieues sous les mers");
		Livre l2 = new Livre("1984");
		Livre l3 = new Livre("Les raisins de la colère");

		
		r1.mettreEnRayon(l1);
		r1.mettreEnRayon(l2);
		r1.mettreEnRayon(l3);
		
		r2.mettreEnRayon(p1);
		r2.mettreEnRayon(p2);
		r2.mettreEnRayon(p3);
		
		System.out.println(r1.listingContenu());
		System.out.println(r2.listingContenu());
		
	}

}
