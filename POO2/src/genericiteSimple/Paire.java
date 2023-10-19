package genericiteSimple;

public class Paire<A, B> {

	private A fst;
	private B scd;
	
	public Paire(A fst, B scd) {
		this.fst = fst;
		this.scd = scd;
	}

	public A getFst() {
		return this.fst;
	}

	public void setFst(A fst) {
		this.fst = fst;
	}

	public B getScd() {
		return this.scd;
	}

	public void setScd(B scd) {
		this.scd = scd;
	}

	@Override
	public String toString() {
		return "Paire [fst=" + this.fst + ", scd=" + this.scd + "]";
	}
	
}