package implementation.builder;

import implementation.activites.ActiviteDePiegeage;
import implementation.activites.ActiviteObservation;
import implementation.activites.JourneeDeChasse;
import implementation.activites.JourneeDePeche;
import implementation.activites.LocationVTT;
import implementation.activites.MenageQuotidien;
import implementation.chalet.IChalet;
import implementation.forfait.Forfait;
import implementation.forfait.IForfait;
import implementation.forfait.IForfaitBuilder;
import implementation.repas.RepasDejeunerDiner;
import implementation.repas.RepasGastronomique;
import implementation.repas.RepasSouper;
import implementation.transport.ITransport;


	//Concrete builder implementation
	public class ForfaitBuilder implements IForfaitBuilder {
	private IForfait forfait;
	public IForfaitBuilder build(IChalet chalet,ITransport transportAllez,ITransport transportRetour,int nbDeJours,int nbOfOccupants,RepasSouper repas){
	this.forfait = new Forfait(chalet, transportAllez,transportRetour,nbDeJours,nbOfOccupants,repas);
	return this;
	}
		public IForfaitBuilder withRepasGastronomique(int nbRepasGastronomique){
		forfait = new RepasGastronomique(forfait, nbRepasGastronomique);
		 return this;
		 }
		 public IForfaitBuilder withDejeunerDiner(int nbDeJours, int nbOfOccupants){
		 forfait = new RepasDejeunerDiner(forfait, nbDeJours, nbOfOccupants);
		 return this;
		 }
		 public IForfaitBuilder withActiviteDePiegage(int nbDeParticipants){
	     forfait = new ActiviteDePiegeage(forfait, nbDeParticipants);
		 return this;
		 }
		 public IForfaitBuilder withActiviteObservation(int nbDeParticipants){
		 forfait = new ActiviteObservation(forfait, nbDeParticipants);
	     return this;
	     }
		 public IForfaitBuilder withJourneeDeChasse(int nbDeParticipants){
	     forfait = new JourneeDeChasse(forfait, nbDeParticipants);
		 return this;
		 }
		 public IForfaitBuilder withJourneeDePeche(int nbDeParticipants){
		 forfait = new JourneeDePeche(forfait, nbDeParticipants);
	     return this;
	     }
		 public IForfaitBuilder withLocationVTT(int nbDeVTT){
	     forfait = new LocationVTT(forfait, nbDeVTT);
		 return this;
		 }
		 public IForfaitBuilder withMenageQuotidien(int nbDeJours){
		 forfait = new MenageQuotidien(forfait, nbDeJours);
	     return this;
	     }
		 public IForfait done() {
		 return this.forfait;
		 }
		}
		


