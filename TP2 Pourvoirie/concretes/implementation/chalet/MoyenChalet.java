package implementation.chalet;

public class MoyenChalet extends Chalet {
	
	final static float PRIX_PAR_NUIT =  200f;
	final static int MAXIMUM_OF_OCCUPANTS = 6; 
	
	public MoyenChalet () {
		
	}
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}
	
	public int getMaximumOfOccupants() {
		return MAXIMUM_OF_OCCUPANTS;
	}
	
}
