package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class ActiviteDePiegeage extends ForfaitOption{
	
	public static final float COST = 12f;
	private static Float cost = COST;

	public ActiviteDePiegeage(IForfait forfait, int nbDeParticipants) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		ActiviteDePiegeage.cost = cost;
	}
	
	public static Float getCost() {
		return ActiviteDePiegeage.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (ActiviteDePiegeage.getCost() * this.getNbOfOccupants());
	}
}
