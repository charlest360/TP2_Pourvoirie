package implementation.forfait;

public abstract class ForfaitOption implements IForfait {
	
	private IForfait forfait;

	public ForfaitOption(IForfait forfait) {
		this.forfait = forfait;
	}
	
	public IForfait getForfait() {
		return this.forfait;
	}
	public int getNbOfOccupants() {
		return this.forfait.getNbOfOccupants();
	}
	
	public int getNbDeJours() {
		return this.forfait.getNbDeJours();
	}
	
	@Override
	public abstract Float calculateCost();
	
	
}
