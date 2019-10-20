package vol;

import java.util.*;

/***********************************************************************/
/* Classe Client																											 */
/* Attributs : des strings pour le nom, le paiement, le moyen de 			 */
/* contact, un attribut unique pour son identifiant, on décide de lui	 */
/* rajouter en attribut la réservation qu'il effectue pour qu'il puisse*/
/* utiliser les méthodes payer, confirmer et annuler									 */
/*																																		 */
/* Implémente : un constructeur public, on rajoute des méthodes pour 	 */
/* qu'il paye, confirme et annule sa réservation											 */
/***********************************************************************/

public class Client
{
    private String nom;
    private String paiement;
    private String contact;
    private IdClient reference;
		private ArrayList<Reservation> reservation = new ArrayList<Reservation>();

    /*************************************************************/
    /* Constructeur de Client:                                   */
    /* Entrée: Des String pour initialiser le nom, le paiement   */
    /*      qui correspond au moyen de paiement, le moyen d'être */
    /*      contacter et enfin une ref qui sera unique           */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    private Client(String nom_, String paiement_, String contact_, IdClient ref_)
    {
        this.nom = nom_;
        this.paiement = paiement_;
        this.contact = contact_;
				this.reference = ref_;
				for (int i = 0; i < this.reservation.size(); i++)
				{
					this.reservation.get(i) = this.reservation.get(i).getReservation();
				}

    }
		/***********************************************************************/
		/* On implémente les appels  des méthodes de réservation dans client	 */
		/* pour plus de logique on les met en private pour respecter					 */
		/* l'encapsulation																										 */
		/***********************************************************************/	
		private void confirmation(int index)
		{
			this.reservation.get(index).confirmer();
		}
		
		private void paiement(int index)
		{
			this.reservation.get(index).payer();
		}
			
		private void annulation(int index)
		{
				this.reservation.get(index).annuler();
		}
		/***********************************************************************/
		/* On crée un accesseur																								 */
		/***********************************************************************/
		public Client getClient()
		{
			return this;
		}
}
