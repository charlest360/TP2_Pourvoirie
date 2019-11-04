package implementation.transport;

public class Bateau extends Transport {
	
final static float PRIX_TRANSPORT =  30f;
	
	public Bateau() {
		
	}
	
	@Override
	public float getPrixTransport() {
		return PRIX_TRANSPORT;
	}
	
	@Override
	public String getInfosTransport() {
		return "Transport par bateau au coût de "+Float.toString(PRIX_TRANSPORT)+"$";
	}
		
}
