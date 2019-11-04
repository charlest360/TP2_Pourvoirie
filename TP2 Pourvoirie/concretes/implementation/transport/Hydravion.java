package implementation.transport;

public class Hydravion extends Transport{
	
	public final static float PRIX_TRANSPORT =  80f;
	
	public Hydravion () {
		
	}
	
	@Override
	public float getPrixTransport() {
		return PRIX_TRANSPORT;
	}
	
	@Override
	public String getInfosTransport() {
		return "Transport par hydravion au coût de "+Float.toString(PRIX_TRANSPORT)+"$";
	}

}
