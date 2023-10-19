package genericiteSimple;

public class BouteilleEtiquetee<TypeEtiq> extends Bouteille {

	private TypeEtiq etiquette;
	
	public BouteilleEtiquetee() {
		super();
	}
	
	public BouteilleEtiquetee(String nom, TypeEtiq etiquette) {
		super(nom);
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
		return "BouteilleEtiquetee : " + super.toString() + ", etiquette=" + this.etiquette;
	}
	
	
	
}
