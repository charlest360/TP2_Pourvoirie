package implementation.forfait;

import implementation.chalet.IChalet;
import implementation.chalet.NegativeNumberOfOccupantsException;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNUmberOfOccupantsException;

public class Forfait {
	
	
	private IChalet chalet;
	private int nbDeJours;
	private int nbOfOccupants;
	
	public Forfait(IChalet chalet,int nbDeJours,int nbOfOccupants) {
		setUpNbOfOccupants(nbOfOccupants);
		setUpChalet(chalet,nbOfOccupants);
		setUpNbDeJours(nbDeJours);
		
	}
	
	
	
	private void setUpNbOfOccupants(int nbOfOccupants) {
		if (nbOfOccupants >= 0) {
			this.nbOfOccupants = 0;
		}
		else {
			throw new NegativeNumberOfOccupantsException();
		}
		
	}



	private void setUpChalet(IChalet chalet, int nbOfOccupants) {
		if (nbOfOccupants <= chalet.getMaximumOfOccupants() ) {
			this.chalet = chalet;
		}
		else {
			throw new NumberOfOccupantsIsHigherThanMaximumNUmberOfOccupantsException();
		}
	}



	public void setUpNbDeJours(int nbDeJours) {
		if(nbDeJours > 0) {
			this.nbDeJours = nbDeJours;
		}
		else {
			throw new NumberOfDaysReservedMustBePositiveException();
		}
	}
	
	public float getPrixTotal() {
		return this.chalet.getPrixParNuit()*this.nbDeJours;
	}
}
