package implementation.chalet;

public class MoyenChalet extends Chalet {
	
	final private float PRIX_PAR_NUIT =  200f;
	final private int MAXIMUM_OF_OCCUPANTS = 6; 
	
	public MoyenChalet () {
		
	}
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}
	
	public int getMaximumOfOccupants() {
		return this.MAXIMUM_OF_OCCUPANTS;
	}
	
	@Override
	public String getInfosChalet() {
		return Float.toString(PRIX_PAR_NUIT);
	}
	
	public String getNbOccupant() {
		return "Chalet de six personnes au coût de "+Integer.toString(MAXIMUM_OF_OCCUPANTS)+" $";
	}
}
