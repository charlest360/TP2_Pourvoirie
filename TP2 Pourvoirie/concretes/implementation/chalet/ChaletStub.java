package implementation.chalet;

public class ChaletStub extends Chalet {

	public static final int MAX_NB_OF_OCCUPANTS = 10; 
	public static final int PRIX_PAR_NUIT = 100;
	public static boolean MaximuStringCalled = false;
	public static boolean PrixParNuitStringCalled = false;
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}

	@Override
	public int getMaximumOfOccupants() {
		return MAX_NB_OF_OCCUPANTS;
	}
	
	@Override
	public String getMaximumOfOccupantsString() {
		this.MaximuStringCalled = true;
		return Integer.toString(MAX_NB_OF_OCCUPANTS);
	}
	
	@Override
	public String getPrixParNuitString() {
		this.PrixParNuitStringCalled = true;
		return Float.toString(PRIX_PAR_NUIT);
	}
	
}
