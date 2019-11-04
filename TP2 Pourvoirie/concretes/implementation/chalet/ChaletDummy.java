package implementation.chalet;

public class ChaletDummy implements IChalet{

	public static String InfosChalets ="Oui";
	
	@Override
	public float getPrixParNuit() {
		return 100;
	}

	@Override
	public int getMaximumOfOccupants() {
		return 100;
	}

	@Override
	public String getMaximumOfOccupantsString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrixParNuitString() {
		// TODO Auto-generated method stub
		return null;
	}



}
