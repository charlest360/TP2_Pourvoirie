package implementation.repas;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class RepasDejeunerDiner extends ForfaitOption {
	
	public static final float COST = 10f;
	private static Float cost = COST;

	public RepasDejeunerDiner(IForfait forfait, int nbDeJours, int nbOfOccupants) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		RepasDejeunerDiner.cost = cost;
	}
	
	public static Float getCost() {
		return RepasDejeunerDiner.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (RepasDejeunerDiner.getCost() * this.getNbDeJours() * this.getNbOfOccupants());
	}
}
