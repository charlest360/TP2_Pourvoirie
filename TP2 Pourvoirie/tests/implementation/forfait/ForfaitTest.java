package implementation.forfait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


import implementation.chalet.ChaletDummy;
import implementation.chalet.ChaletStub;
import implementation.chalet.IChalet;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException;
import implementation.chalet.ZeroOrUnderNumberOfOccupantsException;
import implementation.repas.RepasSouper;
import implementation.transport.ITransport;
import implementation.transport.TransportDummy;
import implementation.transport.TransportStub;



public class ForfaitTest {

	
	final int ANY_NUMBER_OF_OCCUPANTS = 1;
	final int ANY_NUMBER_OF_DAYS = 5;
	final RepasSouper ANY_REPAS_SOUPER = new RepasSouper();
	final IChalet ANY_CHALET = new ChaletDummy();
	final IChalet ANY_FUNCTIONNAL_CHALET = new ChaletStub();
	final ITransport ANY_TRANSPORT = new TransportDummy();
	private Forfait anyForfait;
	
	@Before
	public void setUpAnyForfait() {
		anyForfait = new Forfait(ANY_CHALET,ANY_TRANSPORT,ANY_TRANSPORT, ANY_NUMBER_OF_DAYS, ANY_NUMBER_OF_OCCUPANTS);
	}
	
	@Test 
	public void WHEN_creatingForfaitWithNbOfOccupantsLowerThanTheMaximalCapacityOfTheChalet_THEN_TheNbOfOccupantIsInitialized() {		
		//Arrange
		final IChalet CHALET = new ChaletStub();
		final int VALID_NB_OF_OCCUPANTS = CHALET.getMaximumOfOccupants() -1;
		
		Forfait forfait = new Forfait (CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ANY_NUMBER_OF_DAYS,VALID_NB_OF_OCCUPANTS);
		
		//Act
		final int ACTUAL_NUMBER_OF_OCCUPANTS = forfait.getNumberOfOccupants();
		final int EXPECTED_NUMBER_OF_OCCUPANTS = VALID_NB_OF_OCCUPANTS;
		//Assert 
		assertEquals(EXPECTED_NUMBER_OF_OCCUPANTS,ACTUAL_NUMBER_OF_OCCUPANTS);
	}
	
	@Test 
	public void WHEN_creatingForfaitWithNbOfOccupantsEqualToTheMaximalCapacityOfTheChalet_THEN_theNbOfOccupantIsInitialized() {		
		//Arrange
		final IChalet CHALET = new ChaletStub();
		final int MAXIMUM_NB_OF_OCCUPANT = CHALET.getMaximumOfOccupants();
		
		Forfait forfait = new Forfait (CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ANY_NUMBER_OF_DAYS,MAXIMUM_NB_OF_OCCUPANT);
		
		//Act
		final int ACTUAL_NUMBER_OF_OCCUPANTS = forfait.getNumberOfOccupants();
		final int EXPECTED_NUMBER_OF_OCCUPANTS = MAXIMUM_NB_OF_OCCUPANT;
		//Assert 
		assertEquals(EXPECTED_NUMBER_OF_OCCUPANTS,ACTUAL_NUMBER_OF_OCCUPANTS);
	}
	
	@Test (expected = NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException.class)	
	public void WHEN_creatingForfaitWithNbOfOccupantsHigherThanMaximalCapacityOfTheChalet_THEN_anExceptionIsThrown() {		
		//Arrange
		final IChalet CHALET = new ChaletStub();
		final int INVALID_NB_OF_OCCUPANTS = CHALET.getMaximumOfOccupants()+1;
		//Act
		@SuppressWarnings("unused")
		Forfait anyForfait = new Forfait (CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ANY_NUMBER_OF_DAYS,INVALID_NB_OF_OCCUPANTS);
	}
	
	@Test (expected = ZeroOrUnderNumberOfOccupantsException.class)	
	public void WHEN_creatingForfaitWithZeroOccupants_THEN_anExceptionIsThrown() {		
		//Arrange
		final int ZERO_OCCUPANTS = 0;
		//Act
		@SuppressWarnings("unused")
		Forfait anyForfait = new Forfait (ANY_CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ANY_NUMBER_OF_DAYS,ZERO_OCCUPANTS);
	}
	
	@Test (expected = ZeroOrUnderNumberOfOccupantsException.class)	
	public void WHEN_creatingForfaitWithNegativeNbOccupants_THEN_anExceptionIsThrown() {		
		//Arrange
		final int NEGATIVE_NB_OF_OCCUPANTS = -1;
		//Act
		@SuppressWarnings("unused")
		Forfait anyForfait = new Forfait (ANY_CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ANY_NUMBER_OF_DAYS,NEGATIVE_NB_OF_OCCUPANTS);
	}
	
	@Test 
	public void WHEN_creatingForfaitWithPositiveNbOfDays_THEN_nbOfDaysIsInitialized() {		
		//Act
		final int ACTUAL_NUMBER_OF_DAYS = anyForfait.getNbDeJours();
		final int EXPECTED_NUMBER_OF_OCCUPANTS = ANY_NUMBER_OF_DAYS;
		//Assert 
		assertEquals(EXPECTED_NUMBER_OF_OCCUPANTS,ACTUAL_NUMBER_OF_DAYS);
	}
	
	@Test (expected = NumberOfDaysReservedMustBePositiveException.class)	
	public void WHEN_creatingForfaitWithZeroNbOfDays_THEN_anExceptionIsThrown() {		
		//Arrange
		final int ZERO_NB_OF_DAYS = 0;
		//Act
		@SuppressWarnings("unused")
		Forfait anyForfait = new Forfait (ANY_CHALET,ANY_TRANSPORT,ANY_TRANSPORT,ZERO_NB_OF_DAYS,ANY_NUMBER_OF_OCCUPANTS);
		
	}
	
	@Test (expected = NumberOfDaysReservedMustBePositiveException.class)	
	public void WHEN_creatingForfaitWithNegativeNbOfDays_THEN_anExceptionIsThrown() {		
		//Arrange
		final int NEGATIVE_NB_OF_DAYS = -1;
		//Act
		@SuppressWarnings("unused")
		Forfait anyForfait = new Forfait (ANY_CHALET,ANY_TRANSPORT,ANY_TRANSPORT,NEGATIVE_NB_OF_DAYS,ANY_NUMBER_OF_OCCUPANTS);
		
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetPrixDeBaseReturnsPrixParNuitMultipliedByNumberOfNights() {		
		//Act
		final float ACTUAL_PRIX_DE_BASE = anyForfait.getPrixDeBase();
		final float EXPECTED_PRIX_DE_BASE = ANY_FUNCTIONNAL_CHALET.getPrixParNuit()*ANY_NUMBER_OF_DAYS ;
		
		
		//Assert 
		assertEquals(EXPECTED_PRIX_DE_BASE,ACTUAL_PRIX_DE_BASE,0.001);
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetInfoNbOccupantReturnsTheActualInfosInfoNbOccupant() {		
		//Act
		final String ACTUAL_INFOS_OCCUPANTS = anyForfait.getInfoNbOccupant();
		final String EXPECTED_INFOS_OCCUPANTS = "Le nombre d'occupants est : "+Integer.toString(anyForfait.getNumberOfOccupants());
		
		
		//Assert 
		assertEquals(EXPECTED_INFOS_OCCUPANTS,ACTUAL_INFOS_OCCUPANTS);
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetInfosChaletReturnsTheActualInfosChalet() {		
		
		//Arrange
		IChalet chalet = new ChaletStub();
		Forfait forfait = new Forfait(chalet, ANY_TRANSPORT, ANY_TRANSPORT, ANY_NUMBER_OF_DAYS, ANY_NUMBER_OF_DAYS);
		//Act
		forfait.getInfosChalet();
		
		
		
		//Assert 
		assertTrue(ChaletStub.MaximuStringCalled);
		assertTrue(ChaletStub.PrixParNuitStringCalled);
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetInfoNbDeJoursReturnsTheActualInfoNbDeJours() {		
		//Act
		final String ACTUAL_INFOS_NB_DE_JOURS = anyForfait.getInfoNbDeJours();
		final String EXPECTED_INFOS_NB_DE_JOURS = "Le nombre jours réservés est : "+Integer.toString(anyForfait.getNbDeJours());
		
		
		//Assert 
		assertEquals(EXPECTED_INFOS_NB_DE_JOURS,ACTUAL_INFOS_NB_DE_JOURS);
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetCoutTransportAllezEtRetour_RETURNS_theRightCost() {		
		
		//Arrange
		final ITransport TRANSPORT = new TransportStub();
		Forfait forfait = new Forfait(ANY_CHALET, TRANSPORT, TRANSPORT, ANY_NUMBER_OF_DAYS, ANY_NUMBER_OF_DAYS);
		
		//Act
		final Float ACTUAL_COST = forfait.getCoutTransportAllezEtRetour();
		final Float EXPECTED_COST = forfait.getNumberOfOccupants()*(2*(TRANSPORT.getPrixTransport()));
		
		
		//Assert 
		assertEquals(EXPECTED_COST,ACTUAL_COST,0.00);
	}
	
	@Test 
	public void WHEN_creatingForfait_THEN_callingGetCostReturnsZero() {		
		
		//Act
		final float ACTUAL_COST = anyForfait.getCost();
		final float EXPECTED_COST = 0f;
		//Assert 
		assertEquals(EXPECTED_COST,ACTUAL_COST,0.00);
	}
	
	
}
