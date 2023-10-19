package genericiteSimple;

public class PaireEtiquetee<A, B, TypeEtiq> extends Paire<A,B>{

	private TypeEtiq etiquette;
	
	public PaireEtiquetee(A fst, B scd, TypeEtiq etiquette) {
		super(fst, scd);
		this.etiquette = etiquette;
	}

	public TypeEtiq getEtiquette() {
		return this.etiquette;
	}

	public void setEtiquette(TypeEtiq etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public String toString() {
		return "PaireEtiquetee : " + super.toString() + ", etiquette=" + this.etiquette;
	}
	
}
