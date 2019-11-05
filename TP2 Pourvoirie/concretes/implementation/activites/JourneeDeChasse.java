package implementation.activites;

import implementation.forfait.Forfait;
import implementation.forfait.ForfaitOption;
import implementation.forfait.IForfait;

public class JourneeDeChasse extends ForfaitOption{
	
	public static final float COST = 220f;
	private static Float cost = COST;

	public JourneeDeChasse(IForfait forfait, int nbDeParticipants) {
		super(forfait);
	}
	
	public static void setCost(Float cost) {
		JourneeDeChasse.cost = cost;
	}
	
	public static Float getCost() {
		return JourneeDeChasse.cost;
	}
	
	@Override
	public Float calculateCost() {
		return super.getForfait().calculateCost() + JourneeDeChasse.getCost();
	}
}
