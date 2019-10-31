package implementation.forfait;

import implementation.chalet.IChalet;
import implementation.chalet.ZeroOrUnderNumberOfOccupantsException;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException;

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
		if (nbOfOccupants >0) {
			this.nbOfOccupants = nbOfOccupants;
		}
		else {
			throw new ZeroOrUnderNumberOfOccupantsException();
		}
	}

	public int getNumberOfOccupants() {
		return this.nbOfOccupants;
	}

	
	private void setUpChalet(IChalet chalet, int nbOfOccupants) {
		if (nbOfOccupants <= chalet.getMaximumOfOccupants() ) {
			this.chalet = chalet;
		}
		else {
			throw new NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException();
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
	
	public int getNbDeJours() {
		return this.nbDeJours;
	}
	
	public float getPrixTotal() {
		return this.chalet.getPrixParNuit()*this.nbDeJours;
	}
	
}
