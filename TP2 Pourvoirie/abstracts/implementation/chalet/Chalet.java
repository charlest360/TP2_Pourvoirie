package implementation.chalet;

public abstract class Chalet implements IChalet {
	
	public Chalet() {
		
	}
	
	public String getMaximumOfOccupantsString() {
		return "Chalet de"+Integer.toString(this.getMaximumOfOccupants())+"personnes.";
	}
	
	public String getPrixParNuitString() {
		return "Le prix pour une nuit est"+Float.toString(this.getPrixParNuit())+"$.";
	}
	
	
}
