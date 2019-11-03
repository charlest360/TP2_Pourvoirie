package implementation.chalet;

public class GrandChalet extends Chalet {
	
	final static float PRIX_PAR_NUIT =  300f;
	final static int MAXIMUM_OF_OCCUPANTS = 10; 
	
	public GrandChalet () {
		
	}
	
	public float getPrixParNuit() {
		return PRIX_PAR_NUIT;
	}
	
	public int getMaximumOfOccupants() {
		return MAXIMUM_OF_OCCUPANTS;
	}
	

	@Override
	public String getInfosChalet() {
		return "Chalet de dix personnes au coût de "+Float.toString(PRIX_PAR_NUIT)+" $";
	}
	
	public String getNbOccupant() {
		return Integer.toString(MAXIMUM_OF_OCCUPANTS);
	}

}
