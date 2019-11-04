package implementation.chalet;

public class ChaletTestStub extends Chalet{
	public static final int MAX_NB_OF_OCCUPANTS = 10; 
	public static final int PRIX_PAR_NUIT = 100;
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}

	@Override
	public int getMaximumOfOccupants() {
		return MAX_NB_OF_OCCUPANTS;
	}
	
	
}
