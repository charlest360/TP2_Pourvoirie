package implementation.chalet;

public class ChaletStub implements IChalet {

	public final int MAX_NB_OF_OCCUPANTS = 10; 
	public static final int PRIX_PAR_NUIT = 100;
	
	@Override
	public float getPrixParNuit() {
		// TODO Auto-generated method stub
		return PRIX_PAR_NUIT;
	}

	@Override
	public int getMaximumOfOccupants() {
		// TODO Auto-generated method stub
		return MAX_NB_OF_OCCUPANTS;
	}

}
