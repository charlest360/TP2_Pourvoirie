package implementation.transport;

public class TransportStub implements ITransport {
	public final float prixTransport = 100f;
	
	
	@Override
	public float getPrixTransport() {
		return this.prixTransport;
	}

	@Override
	public String getInfosTransport() {
		// TODO Auto-generated method stub
		return null;
	}

}
