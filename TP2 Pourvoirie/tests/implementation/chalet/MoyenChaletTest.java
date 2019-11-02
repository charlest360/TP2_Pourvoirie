package implementation.chalet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MoyenChaletTest {
private Chalet ANY_MOYEN_CHALET ;
	
	@Before
	public void setUpAnyMoyenChalet() {
		ANY_MOYEN_CHALET = new MoyenChalet();
	}
	
	@Test 
	public void WHEN_callingGetPrixParNuitOnMoyenChalet_THEN_itReturnsTheRightPrixParNuit() {		
		//Assert 
		assertEquals(MoyenChalet.PRIX_PAR_NUIT,ANY_MOYEN_CHALET.getPrixParNuit(),0.00);
	}
	
	@Test 
	public void WHEN_callingGetMaximumOfOccupantsOnMoyenChalet_THEN_itReturnsTheRightMaximumOfOccupants() {		
		//Assert 
		assertEquals(MoyenChalet.MAXIMUM_OF_OCCUPANTS,ANY_MOYEN_CHALET.getMaximumOfOccupants());
	}
	
	@Test 
	public void WHEN_callingGetInfosChaletOnMoyenChalet_THEN_itReturnsTheRightPrixParNuitToString() {		
		//Assert 
		final String EXPECTED_PRIX_PAR_NUIT = Float.toString(MoyenChalet.PRIX_PAR_NUIT);
		
		assertEquals(EXPECTED_PRIX_PAR_NUIT,ANY_MOYEN_CHALET.getInfosChalet());
	}
}
