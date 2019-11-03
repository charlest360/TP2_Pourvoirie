package implementation.forfait;

import implementation.chalet.IChalet;
import implementation.transport.ITransport;
import implementation.repas.RepasSouper;
import implementation.forfait.IForfait;
import implementation.chalet.NegativeNumberOfOccupantsException;
import implementation.chalet.NumberOfDaysReservedMustBePositiveException;
import implementation.chalet.NumberOfOccupantsIsHigherThanMaximumNUmberOfOccupantsException;

public class Forfait implements IForfait{
	
	
	private IChalet chalet;
	private int nbDeJours;
	private int nbOfOccupants;
	private ITransport transportAllez;
	private ITransport transportRetour;
	private RepasSouper repas;
	private static Float cost;
	
	
	public Forfait(IChalet chalet,ITransport transportAllez,ITransport transportRetour,int nbDeJours,int nbOfOccupants,RepasSouper repas) {
		setUpNbOfOccupants(nbOfOccupants);
		setUpChalet(chalet,nbOfOccupants);
		setUpNbDeJours(nbDeJours);
		setUpTransportAllez(transportAllez);
		setUpTransportRetour(transportRetour);
		setUpRepas(repas);
	}
	
	
	
	private void setUpNbOfOccupants(int nbOfOccupants) {
		if (nbOfOccupants >= 0) {
			this.nbOfOccupants = 0;
		}
		else {
			throw new NegativeNumberOfOccupantsException();
		}
		
	}
	
	private void setUpRepas(RepasSouper repas) {
		this.repas = repas;
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



	private void setUpNbDeJours(int nbDeJours) {
		if(nbDeJours > 0) {
			this.nbDeJours = nbDeJours;
		}
		else {
			throw new NumberOfDaysReservedMustBePositiveException();
		}
	}
	
	private float getPrixTotal() {
		return this.chalet.getPrixParNuit()*this.nbDeJours;
	}
	
	private String getNbOccupant() {
		return Integer.toString(nbOfOccupants);
	}
	
	private String getInfoNbOccupant() {
		return "Le nombre d'occupants est : "+this.getNbOccupant();
	}
	
	private String getNbDeJours() {
		return Integer.toString(nbDeJours);
	}
	
	private String getInfoNbDeJours() {
		return "Le nombre jours réservés est : "+this.getNbDeJours();
	}
	
	public String getInfosChalet() {
		return this.chalet.getMaximumOfOccupantsString() + this.chalet.getPrixParNuitString()  ;
	}
	
	private float getCoutTransportAllezEtRetour() {
		return this.nbOfOccupants*(this.transportAllez.getPrixTransport()+this.transportRetour.getPrixTransport());
	}
	
	private float getPrixSouperTotale() {
		return this.repas.getPrixSouper()*this.nbDeJours;
	}
	@Override
	public Float calculateCost() {
		return Forfait.cost;
	}
}

