package assertions_exceptions;

public class Main {

	public static void main(String[] args) throws PileVideException, PilePleineException, PileTailleNegativeException {

		try {
			Pile<String> p = new Pile<String>();
			PileBornee<String> pb = new PileBornee<>();
			System.out.println(p);
			p.empiler("a");
			p.empiler("b");
			p.empiler("c");
			System.out.println(p);
			p.depiler();
			System.out.println(p);
			p.depiler();
			p.depiler();
			System.out.println(p);
			pb.setTailleMax(11);
			System.out.println(pb);
			pb.empiler("test");
			System.out.println(pb);
		} catch (PileVideException p) {
			System.out.println(p.getMessage());
		} catch (PilePleineException p) {
			System.out.println(p.getMessage());
		} catch (PileTailleNegativeException p) {
			System.out.println(p.getMessage());
		} 
		System.out.println("Fin de la méthode main");

	}

}
