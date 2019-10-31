package implementation.forfait;

import implementation.chalet.IChalet;
import implementation.transport.ITransport;
import implementation.chalet.NegativeNumberOfOccupantsException;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNUmberOfOccupantsException;

public class Forfait {
	
	
	private IChalet chalet;
	private int nbDeJours;
	private int nbOfOccupants;
	private ITransport transportAllez;
	private ITransport transportRetour;
	
	
	
	public Forfait(IChalet chalet,ITransport transport,int nbDeJours,int nbOfOccupants) {
		setUpNbOfOccupants(nbOfOccupants);
		setUpChalet(chalet,nbOfOccupants);
		setUpNbDeJours(nbDeJours);
		setUpTransportAllez(transport);
		setUpTransportRetour(transport);
	}
	
	
	
	private void setUpNbOfOccupants(int nbOfOccupants) {
		if (nbOfOccupants >= 0) {
			this.nbOfOccupants = 0;
		}
		else {
			throw new NegativeNumberOfOccupantsException();
		}
		
	}
	
	private void setUpTransportAllez(ITransport transport) {
		this.transportAllez = transport;
		
	}
	
	private void setUpTransportRetour(ITransport transport) {
		this.transportRetour = transport;
		
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
	
	public String getNbOccupant() {
		return Integer.toString(nbOfOccupants);
	}
	
	public String getInfoNbOccupant() {
		return "Le nombre d'occupants est : "+this.getNbOccupant();
	}
	
	public String getNbDeJours() {
		return Integer.toString(nbDeJours);
	}
	
	public String getInfoNbDeJours() {
		return "Le nombre jours réservés est : "+this.getNbDeJours();
	}
	
	private float getCoutTransport() {
		return this.nbOfOccupants*(this.transportAllez.getPrixTransport()+this.transportRetour.getPrixTransport());
	}
	
}

