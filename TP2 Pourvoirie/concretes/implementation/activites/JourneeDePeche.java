package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class JourneeDePeche extends ForfaitOption{
	
	public static final float COST = 200f;
	private static Float cost = COST;

	public JourneeDePeche(IForfait forfait, int nbDeParticipants) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		JourneeDePeche.cost = cost;
	}
	
	public static Float getCost() {
		return JourneeDePeche.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + JourneeDePeche.getCost();
	}
}
