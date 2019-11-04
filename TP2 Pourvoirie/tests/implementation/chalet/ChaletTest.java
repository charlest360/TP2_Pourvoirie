package implementation.chalet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class ChaletTest {
	private Chalet anyChalet;
	
	@Before
	public void setUpAnyChalet() {
		anyChalet = new ChaletTestStub();
	}
	
	
	@Test 
	public void GIVEN_aChalet_WHEN_callingGetPrixParNuit_THEN_thePrixParNuitIsReturned() {

		//Act
		final float ACTUAL_PRIX_PAR_NUIT = anyChalet.getPrixParNuit();
		final float EXPECTED_PRIX_PAR_NUIT = ChaletTestStub.PRIX_PAR_NUIT;
		
		//Assert
		assertEquals(EXPECTED_PRIX_PAR_NUIT,ACTUAL_PRIX_PAR_NUIT,0.00);		
	}
	
	@Test 
	public void GIVEN_aChalet_WHEN_callingGetPrixParNuitString_THEN_thePrixParNuitStringIsReturned() {

		//Act
		final String ACTUAL_PRIX_PAR_NUIT = anyChalet.getPrixParNuitString();
		final String EXPECTED_PRIX_PAR_NUIT = "Le prix pour une nuit est"+Float.toString(ChaletTestStub.PRIX_PAR_NUIT)+"$.";
		
		//Assert
		assertEquals(EXPECTED_PRIX_PAR_NUIT,ACTUAL_PRIX_PAR_NUIT);		
	}
	
	@Test 
	public void GIVEN_aChalet_WHEN_callingGetMaximumOfOccupantsString_THEN_theMaximumOfOccupantsStringIsReturned() {

		//Act
		final String ACTUAL_MAXIMUM_OF_OCCUPANTS = anyChalet.getMaximumOfOccupantsString();
		
		final String EXPECTED_MAXIMUM_OF_OCCUPANTS = "Chalet de"+Integer.toString(ChaletTestStub.MAX_NB_OF_OCCUPANTS)+"personnes.";
		//Assert
		assertEquals(EXPECTED_MAXIMUM_OF_OCCUPANTS,ACTUAL_MAXIMUM_OF_OCCUPANTS);		
	}
	
	
}
