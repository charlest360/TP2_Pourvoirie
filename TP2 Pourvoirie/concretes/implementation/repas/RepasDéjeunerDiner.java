package implementation.repas;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;

public class RepasDéjeunerDiner extends ForfaitOption {
	
	public static final float COST = 10f;
	private static Float cost = COST;

	public RepasDéjeunerDiner(Forfait forfait) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		RepasDéjeunerDiner.cost = cost;
	}
	
	public static Float getCost() {
		return RepasDéjeunerDiner.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (RepasDéjeunerDiner.getCost() * this.getNbDeJours() * this.getNbOfOccupants());
	}
}
