package implementation.forfait;


import implementation.chalet.IChalet;
import implementation.repas.RepasSouper;
import implementation.transport.ITransport;

public interface IForfaitBuilder {
	IForfaitBuilder build(IChalet chalet,ITransport transportAllez,ITransport transportRetour,int nbDeJours,int nbOfOccupants,RepasSouper repas);
	 IForfaitBuilder withRepasGastronomique(int nbRepasGastronomique);
	 IForfaitBuilder withDejeunerDiner(int nbDeJours, int nbOfOccupants);
	 IForfaitBuilder withActiviteDePiegage(int nbDeParticipants);
	 IForfaitBuilder withActiviteObservation(int nbDeParticipants);
	 IForfaitBuilder withJourneeDeChasse(int nbDeParticipants); 
	 IForfaitBuilder withJourneeDePeche(int nbDeParticipants);
	 IForfaitBuilder withLocationVTT(int nbDeVTT);
	 IForfaitBuilder withMenageQuotidien(int nbDeJours);
	 IForfait done();
}
