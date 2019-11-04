package implementation.repas;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;

public class RepasD�jeunerDiner extends ForfaitOption {
	
	public static final float COST = 10f;
	private static Float cost = COST;

	public RepasD�jeunerDiner(Forfait forfait) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		RepasD�jeunerDiner.cost = cost;
	}
	
	public static Float getCost() {
		return RepasD�jeunerDiner.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (RepasD�jeunerDiner.getCost() * this.getNbDeJours() * this.getNbOfOccupants());
	}
}
