package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;


public class MenageQuotidien extends ForfaitOption{
	
	public static final float COST = 22f;
	private static Float cost = COST;

	public MenageQuotidien(Forfait forfait) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		MenageQuotidien.cost = cost;
	}
	
	public static Float getCost() {
		return MenageQuotidien.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (MenageQuotidien.getCost() * this.getNbDeJours());
	}
}
