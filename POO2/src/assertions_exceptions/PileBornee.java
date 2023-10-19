package assertions_exceptions;

public class PileBornee<T> extends Pile<T> implements IPileBornee<T>{

	// structure de stockage interne des éléments
		private static int tailleMax = 10;
		
		// Mise en oeuvre des opérations
		public PileBornee() {
			super();
		}
		
		@Override
		public int getTailleMax() {
			return PileBornee.tailleMax;
		}

		@Override
		public void setTailleMax(int tailleMax) throws PileTailleNegativeException {
			if (tailleMax < 0) {
				throw new PileTailleNegativeException("La taille doit être un entier positif.");
			}
			else {
				PileBornee.tailleMax = tailleMax;
			}
		}
		
		public void empiler(T t) throws PileVideException, PilePleineException {
			if (this.nbElements() == PileBornee.tailleMax) {
				throw new PilePleineException("La pile est pleine.");
			} else {
				super.empiler(t);
			}
		}

		@Override
		public String toString() {
			return "PileBornee [toString()=" + super.toString() + "]";
		}
	
		
	
}
