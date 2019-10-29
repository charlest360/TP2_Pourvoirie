package implementation.chalet;

public class chaletPourQuatre extends Chalet {
	
	final private float PRIX_PAR_NUIT =  150f;
	final private int MAXIMUM_OF_OCCUPANTS = 4; 
	
	public chaletPourQuatre () {
		
	}
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}
	
	public int getMaximumOfOccupants() {
		return this.MAXIMUM_OF_OCCUPANTS;
	}
	
}