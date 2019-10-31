package implementation.chalet;

public class GrandChalet extends Chalet {
	
	final private float PRIX_PAR_NUIT =  300f;
	final private int MAXIMUM_OF_OCCUPANTS = 10; 
	
	public GrandChalet () {
		
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
		return "Chalet de dix personnes au co�t de "+Integer.toString(MAXIMUM_OF_OCCUPANTS)+" $";
	}
}
