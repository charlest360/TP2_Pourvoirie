package implementation.repas;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;

public class RepasGastronomique extends ForfaitOption{
	
	public static final float COST = 22f;
	private static Float cost = COST;

	public RepasGastronomique(Forfait forfait) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		RepasGastronomique.cost = cost;
	}
	
	public static Float getCost() {
		return RepasGastronomique.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (RepasGastronomique.getCost() * this.getNbDeJours() * this.getNbOfOccupants());
	}
	
}
