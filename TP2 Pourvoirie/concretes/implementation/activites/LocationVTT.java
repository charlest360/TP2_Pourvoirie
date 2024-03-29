package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class LocationVTT extends ForfaitOption{
	
	public static final float COST = 30f;
	private static Float cost = COST;

	public LocationVTT(IForfait forfait, int nbDeVTT) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		LocationVTT.cost = cost;
	}
	
	public static Float getCost() {
		return LocationVTT.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (LocationVTT.getCost() * this.getNbDeJours());
	}
}
