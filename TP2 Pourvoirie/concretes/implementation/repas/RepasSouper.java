package implementation.repas;

public class RepasSouper {
	
	final private float PRIX_SOUPER =  18f;
	
	public RepasSouper() {
		
	}
	
	public float getPrixSouper() {
		return PRIX_SOUPER;
	}
	
	
	public String getInfosSouper() {
		return "Le co�t d'un souper est de "+Float.toString(PRIX_SOUPER)+" $";
	}
		
}
