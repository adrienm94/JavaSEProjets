package assertions_exceptions;

public interface IPileBornee<T> {

	
	int getTailleMax();
	void setTailleMax(int tailleMax) throws PileTailleNegativeException;
	void empiler(T t) throws PileVideException, PilePleineException;
	
}
