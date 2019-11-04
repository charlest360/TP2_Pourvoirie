package implementation.transport;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HydravionTest {
	Hydravion anyHydravion ;
	
	@Before
	public void setUpAnyHydravion() {
		anyHydravion=new Hydravion();
	}
	
	@Test 
	public void WHEN_callingGetPrixTransport_THEN_rightPriceIsReturned() {		
		
		//Act
		final float ACTUAL_COST = anyHydravion.getPrixTransport();
		final float EXPECTED_COST = Hydravion.PRIX_TRANSPORT;
		
		//Assert 
		assertEquals(EXPECTED_COST,ACTUAL_COST,0.00);
	}
	
	@Test 
	public void WHEN_callingGetInfosTransport_THEN_rightInfosAreReturned() {		
		
		//Act
		final String ACTUAL_INFOS = anyHydravion.getInfosTransport();
		final String EXPECTED_INFOS = "Transport par hydravion au coût de "+Float.toString(Hydravion.PRIX_TRANSPORT)+"$";
		
		//Assert 
		assertEquals(EXPECTED_INFOS,ACTUAL_INFOS);
	}
}
