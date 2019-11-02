package implementation.transport;

public class Hydravion extends Transport{
	
	final private float PRIX_TRANSPORT =  150f;
	
	public Hydravion () {
		
	}
	
	@Override
	public float getPrixTransport() {
		return PRIX_TRANSPORT;
	}
	
	@Override
	public String getInfosTransport() {
		return Float.toString(PRIX_TRANSPORT);
	}

}
