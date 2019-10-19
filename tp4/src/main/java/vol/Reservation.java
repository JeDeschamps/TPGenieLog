package vol;

import java.util.*;
import java.lang.Object;
import java.time.*;

	/***********************************************************************/
	/* Classe Reservation																									 */
	/* Attributs : Une ZonedDateTime qui correspond à la date de départ du */
	/* vol, un identifiant unique, un état de la réservation donc les 		 */
	/* valeurs possibles sont définies dans la classe interne enum ETAT,	 */
	/* un Vol et un passager concernés par la réservation qui sont définis */
	/* dans les navigabilités du diagramme UML														 */
	/*																																		 */
	/* Implémente : un constructeur public et des setters publics qui 		 */
	/* permettent de modifier l'état de la réservation										 */
	/***********************************************************************/
public class Reservation
{
    private ZonedDateTime date;
    private IdReservation identifiant;
    private Etat etat;
    private Vol vol;
    private Passager passager;
		private Client client;

    /*************************************************************/
    /* Constructeur de Reservation:                              */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On initialise les attribus de la classe.                  */
    /*************************************************************/

    private Reservation()
    {
        this.vol.getInstanceVol();
        this.passager.getPassager();
        this.identifiant = identifiant.getIdentifiant();
        this.date = vol.getDepart();
        this.etat = Etat.ATTENTE;
				this.passager = passager.getPassager(); 
				this.client = client.getClient();	
    }
		
		/*************************************************************/
		/* On crée un accesseur de l'instance												 */
		/*************************************************************/
		public Reservation getReservation()
		{
			return this;
		}

    /*************************************************************/
    /* Méthode annuler:                                          */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le statut du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation n'est pas déjà annulée et que le vol    */
    /* est toujours disponible, alors on change l'état de la     */
    /* réservation en ANNULER. Sinon on affiche un message       */
    /* d'erreur.                                                 */
    /*************************************************************/

    public void annuler()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat != Etat.ANNULER) && test)
        {
            this.etat = Etat.ANNULER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas annuler une réservation déjà annuler ou fermer.");
        }
    }

		/*************************************************************/
		/* On crée un getter de l'instance de la résérvation				 */
		/*************************************************************/
		public Reservation getInstanceReservation()
		{
			return this;
		}
		

    /*************************************************************/
    /* Méthode confirmer:                                        */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le statut du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation est payeée et que le vol est toujours   */
    /* disponible, alors on change l'état de la réservation      */
    /* en CONFIRMER. Sinon on affiche un message d'erreur.       */
    /*************************************************************/

    public void confirmer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.PAYER) && test )
        {
            this.etat = Etat.CONFIRMER;
        }
        else
        {
            System.out.println("Vous devez d'abord payer avant de confirmer ou vous ne pouvez pas confirmer une réservation déjà annuler ou fermer.");
						throw new IllegalArgumentException("Vous devez d'abord payer avant de confirmer ou vous ne pouvez pas confirmer une réservation déjà annuler ou fermer.");
        }
    }

    /*************************************************************/
    /* Méthode payer:                                            */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le statut du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation est en attente et que le vol est        */
    /* toujours disponible, alors on change l'état de la         */
    /* réservation en PAYER. Sinon on affiche un message         */
    /* d'erreur.                                                 */
    /*************************************************************/

    public void payer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.ATTENTE) && test)
        {
            this.etat = Etat.PAYER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas payer une reservation déjà payée, confirmée, annulée ou fermée.");
        }
    }

    /*************************************************************/
    /* On crée une classe interne Etat qui correspondra aux      */
    /* differents états que peut prendre la réservation.         */
    /*************************************************************/

    enum Etat 
    {
        ATTENTE,
        PAYER,
        CONFIRMER,
        ANNULER;
    }
}

