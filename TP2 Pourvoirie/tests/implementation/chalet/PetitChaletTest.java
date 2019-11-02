package implementation.chalet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PetitChaletTest {
	private Chalet ANY_PETIT_CHALET ;
	
	@Before
	public void setUpAnyPetitChalet() {
		ANY_PETIT_CHALET = new PetitChalet();
	}
	
	@Test 
	public void WHEN_callingGetPrixParNuitOnPetitChalet_THEN_itReturnsTheRightPrixParNuit() {		
		//Assert 
		assertEquals(PetitChalet.PRIX_PAR_NUIT,ANY_PETIT_CHALET.getPrixParNuit(),0.00);
	}
	
	@Test 
	public void WHEN_callingGetMaximumOfOccupantsOnPetitChalet_THEN_itReturnsTheRightMaximumOfOccupants() {		
		//Assert 
		assertEquals(PetitChalet.MAXIMUM_OF_OCCUPANTS,ANY_PETIT_CHALET.getMaximumOfOccupants());
	}
	
	@Test 
	public void WHEN_callingGetInfosChaletOnPetitChalet_THEN_itReturnsTheRightPrixParNuitToString() {		
		//Assert 
		final String EXPECTED_PRIX_PAR_NUIT = Float.toString(PetitChalet.PRIX_PAR_NUIT);
		
		assertEquals(EXPECTED_PRIX_PAR_NUIT,ANY_PETIT_CHALET.getInfosChalet());
	}
}
