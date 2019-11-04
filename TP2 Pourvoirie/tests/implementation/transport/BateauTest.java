package implementation.transport;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BateauTest {
	
	Bateau anyBateau ;
	
	@Before
	public void setUpAnyBateau() {
		anyBateau=new Bateau();
	}
	
	@Test 
	public void WHEN_callingGetPrixTransport_THEN_rightPriceIsReturned() {		
		
		//Act
		final float ACTUAL_COST = anyBateau.getPrixTransport();
		final float EXPECTED_COST = Bateau.PRIX_TRANSPORT;
		
		//Assert 
		assertEquals(EXPECTED_COST,ACTUAL_COST,0.00);
	}
	
	@Test 
	public void WHEN_callingGetInfosTransport_THEN_rightInfosAreReturned() {		
		
		//Act
		final String ACTUAL_INFOS = anyBateau.getInfosTransport();
		final String EXPECTED_INFOS = "Transport par bateau au coût de "+Float.toString(Bateau.PRIX_TRANSPORT)+"$";
		
		//Assert 
		assertEquals(EXPECTED_INFOS,ACTUAL_INFOS);
	}
	
	
}
