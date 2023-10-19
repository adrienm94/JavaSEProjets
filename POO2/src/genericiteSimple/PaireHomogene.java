package genericiteSimple;

public class PaireHomogene<A> extends Paire<A, A> {
	
	public PaireHomogene(A fst, A scd) {
		super(fst, scd);
	}

	@Override
	public String toString() {
		return "PaireHomogene : " + super.toString();
	}
	
}
