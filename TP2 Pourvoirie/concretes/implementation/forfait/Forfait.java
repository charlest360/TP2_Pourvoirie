package implementation.forfait;

import implementation.chalet.IChalet;
import implementation.transport.ITransport;
import implementation.repas.RepasSouper;
import implementation.forfait.IForfait;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException;
import implementation.chalet.ZeroOrUnderNumberOfOccupantsException;

public class Forfait implements IForfait{
	
	
	private IChalet chalet;
	private int nbDeJours;
	private int nbOfOccupants;
	private ITransport transportAllez;
	private ITransport transportRetour;
	private RepasSouper repas= new RepasSouper();
	private  Float cost =0f;
	
	
	public Forfait(IChalet chalet,ITransport transportAllez,ITransport transportRetour,int nbDeJours,int nbOfOccupants) {
		setUpNbOfOccupants(nbOfOccupants);
		setUpChalet(chalet,nbOfOccupants);
		setUpNbDeJours(nbDeJours);
		setUpTransportAllez(transportAllez);
		setUpTransportRetour(transportRetour);


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
			throw new NumberOfOccupantsIsHigherThanMaximumNumberOfOccupantsException();
		}
	}

	private void setUpNbDeJours(int nbDeJours) {
		if(nbDeJours > 0) {
			this.nbDeJours = nbDeJours;
		}
		else {
			throw new NumberOfDaysReservedMustBePositiveException();
		}
	}
	
	public float getPrixDeBase() {
		return this.chalet.getPrixParNuit()*this.nbDeJours;
	}
	
	
	public String getInfoNbOccupant() {
		return "Le nombre d'occupants est : "+Integer.toString(this.nbOfOccupants);
	}
	
	public int getNbDeJours() {
		return this.nbDeJours;
	}
	
	public String getInfoNbDeJours() {

		return "Le nombre jours réservés est : "+Integer.toString(this.nbDeJours);
	}
	
	public String getInfosChalet() {
		return this.chalet.getMaximumOfOccupantsString() + this.chalet.getPrixParNuitString()  ;
	}
	
	public float getCoutTransportAllezEtRetour() {
		return this.nbOfOccupants*(this.transportAllez.getPrixTransport()+this.transportRetour.getPrixTransport());
	}

	public float getPrixSouperDeBase() {
		return this.repas.getPrixSouper()*this.nbDeJours*this.nbOfOccupants;
	}
	
	public void calculateCost() {
		this.cost = getPrixSouperDeBase()+getCoutTransportAllezEtRetour()+getPrixDeBase();
		
	}
	
	public float getCost() {
		return this.cost;
	}

	

}

