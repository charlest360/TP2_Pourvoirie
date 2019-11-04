package implementation.chalet;

public class PetitChalet extends Chalet {
	
	final static float PRIX_PAR_NUIT =  150f;
	final static int MAXIMUM_OF_OCCUPANTS = 4; 
	
	public PetitChalet () {
		
	}
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}
	
	public int getMaximumOfOccupants() {
		return MAXIMUM_OF_OCCUPANTS;
	}
	

}
