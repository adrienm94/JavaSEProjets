package genericitebornee;

public class Livre extends Produit{

	public Livre() {
		super();
	}
	
	public Livre(String e) {
		super(e);
	}
	
	@Override
	public String toString() {
		return "Livre : " + super.toString();
	}
	
}
