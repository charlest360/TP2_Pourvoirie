package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class ActiviteObservation extends ForfaitOption{
	
	public static final float COST = 15f;
	private static Float cost = COST;

	public ActiviteObservation(IForfait forfait, int nbDeParticipants) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		ActiviteObservation.cost = cost;
	}
	
	public static Float getCost() {
		return ActiviteObservation.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + (ActiviteObservation.getCost() * this.getNbOfOccupants());
	}
}
