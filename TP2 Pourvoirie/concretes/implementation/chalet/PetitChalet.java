package implementation.chalet;

public class PetitChalet extends Chalet {
	
	final private float PRIX_PAR_NUIT =  150f;
	final private int MAXIMUM_OF_OCCUPANTS = 4; 
	
	public PetitChalet () {
		
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
		return "Chalet de quatre personnes au coût de "+Integer.toString(MAXIMUM_OF_OCCUPANTS)+" $";
	}
}
