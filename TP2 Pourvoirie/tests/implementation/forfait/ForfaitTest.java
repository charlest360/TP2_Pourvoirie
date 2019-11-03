package implementation.forfait;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import implementation.chalet.ChaletDummy;
import implementation.chalet.ChaletStub;
import implementation.chalet.IChalet;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException;
import implementation.chalet.ZeroOrUnderNumberOfOccupantsException;
import implementation.transport.ITransport;
import implementation.transport.TransportDummy;



public class ForfaitTest {

	
	final int ANY_NUMBER_OF_OCCUPANTS = 1;
	final int ANY_NUMBER_OF_DAYS = 5;
	final IChalet ANY_CHALET = new ChaletDummy();
	final IChalet ANY_FUNCTIONNAL_CHALET = new ChaletStub();
	final ITransport ANY_TRANSPORT = new TransportDummy();
	private Forfait anyForfait;
	
	@Before
	public void setUpAnyForfait() {
		anyForfait = new Forfait(ANY_FUNCTIONNAL_CHALET,ANY_TRANSPORT,ANY_TRANSPORT, ANY_NUMBER_OF_DAYS, ANY_NUMBER_OF_OCCUPANTS);
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
	public void WHEN_creatingForfait_THEN_callingGetPrixTotalReturnsPrixParNuitMultipliedByNumberOfNights() {		
		//Act
		final float ACTUAL_PRIX_TOTAL = anyForfait.getPrixTotal();
		final float EXPECTED_PRIX_TOTAL = ANY_FUNCTIONNAL_CHALET.getPrixParNuit()*ANY_NUMBER_OF_DAYS ;
		
		
		//Assert 
		assertEquals(EXPECTED_PRIX_TOTAL,ACTUAL_PRIX_TOTAL,0.001);
	}
	
	
}
