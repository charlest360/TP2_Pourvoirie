package implementation.forfait;

public abstract class ForfaitOption implements IForfait {
	
	private Forfait forfait;

	public ForfaitOption(Forfait forfait) {
		this.forfait = forfait;
	}
	
	public Forfait getForfait() {
		return this.forfait;
	}
	public int getNbOfOccupants() {
		return this.forfait.getNbOfOccupants();
	}
	
	@Override
	public abstract Float calculateCost();
	
	
}
