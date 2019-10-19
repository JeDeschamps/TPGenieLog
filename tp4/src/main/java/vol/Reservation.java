package vol;

import java.util.*;
import java.lang.Object;
import java.time.*;

public class Reservation
{
    public ZonedDateTime date;
    public IdIdentifiant identifiant;
    public Etat etat;
    public Vol vol;
    private Passager passager;

    /*************************************************************/
    /* Constructeur de Reservation:                              */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On initialise les attribus de la classe.                  */
    /*************************************************************/

    public Reservation()
    {
        this.vol.getInstanceVol();
        this.passager.getPassager();
        this.identifiant = identifiant.getIdentifiant();
        this.date = vol.getDepart();
        this.etat = Etat.ATTENTE;
    }

    /*************************************************************/
    /* Méthode annuler:                                          */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation n'est pas déjà annuler et que le vol    */
    /* est toujours disponible, alors on change l'état de la     */
    /* réservation en ANNULER. Sinon on affiche un message       */
    /* d'erreur.                                                 */
    /*************************************************************/

    public void annuler()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat != Etat.ANNULER) && (test == true))
        {
            this.etat = Etat.ANNULER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas annuler une réservation déjà annuler ou fermer.");
        }
    }

    /*************************************************************/
    /* Méthode confirmer:                                        */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation est payer et que le vol est toujours    */
    /* disponible, alors on change l'état de la reservation      */
    /* en CONFIRMER. Sinon on affiche un message d'erreur.       */
    /*************************************************************/

    public void confirmer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.PAYER) && (test == true))
        {
            this.etat = Etat.CONFIRMER;
        }
        else
        {
            System.out.println("Vous devez d'abord payer avant de confirmer ou vous ne pouvez pas confirmer une réservation déjà annuler ou fermer.");
        }
    }

    /*************************************************************/
    /* Méthode payer:                                            */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermé et aussi l'état de la réservation.        */
    /* Si la réservation est en attente et que le vol est        */
    /* toujours disponible, alors on change l'état de la         */
    /* réservation en PAYER. Sinon on affiche un message         */
    /* d'erreur.                                                 */
    /*************************************************************/

    public void payer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.ATTENTE) && (test == true))
        {
            this.etat = Etat.PAYER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas payer une reservation déjà payer, confirmer, annuler ou fermer.");
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

