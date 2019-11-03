package implementation.chalet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GrandChaletTest {
private Chalet ANY_GRAND_CHALET ;
	
	@Before
	public void setUpAnyGrandChalet() {
		ANY_GRAND_CHALET = new GrandChalet();
	}
	
	@Test 
	public void WHEN_callingGetPrixParNuitOnGrandChalet_THEN_itReturnsTheRightPrixParNuit() {		
		//Assert 
		assertEquals(GrandChalet.PRIX_PAR_NUIT,ANY_GRAND_CHALET.getPrixParNuit(),0.00);
	}
	
	@Test 
	public void WHEN_callingGetMaximumOfOccupantsOnGrandChalet_THEN_itReturnsTheRightMaximumOfOccupants() {		
		//Assert 
		assertEquals(GrandChalet.MAXIMUM_OF_OCCUPANTS,ANY_GRAND_CHALET.getMaximumOfOccupants());
	}
	
	@Test 
	public void WHEN_callingGetInfosChaletOnGrandChalet_THEN_itReturnsTheRightPrixParNuitToString() {		
		//Assert 
		final String EXPECTED_PRIX_PAR_NUIT = Float.toString(GrandChalet.PRIX_PAR_NUIT);
		
		assertEquals(EXPECTED_PRIX_PAR_NUIT,ANY_GRAND_CHALET.getInfosChalet());
	}
}
