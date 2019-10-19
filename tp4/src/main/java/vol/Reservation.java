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
    /* Entree: Aucune                                            */
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
    /* Methode annuler:                                          */
    /* Entree: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermer. Et aussi l'etat de la reservation.      */
    /* Si la reservation n'est pas déjà annuler et que le vol    */
    /* est toujours disponible, alors on change l'etat de la     */
    /* reservation en Annuler. Sinon on affiche un message       */
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
    /* Methode confirmer:                                        */
    /* Entree: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermer. Et aussi l'etat de la reservation.      */
    /* Si la reservation est payer et que le vol est toujours    */
    /* disponible, alors on change l'etat de la reservation      */
    /* en Annuler. Sinon on affiche un message d'erreur.         */
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
    /* Methode payer:                                            */
    /* Entree: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On regarde d'abord le status du vol, savoir s'il est      */
    /* ouvert ou fermer. Et aussi l'etat de la reservation.      */
    /* Si la reservation est en attente et que le vol est        */
    /* toujours disponible, alors on change l'etat de la         */
    /* reservation en Annuler. Sinon on affiche un message       */
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
    /* On cree une classe interne Etat qui correspondra aux      */
    /* different etats que peut prendre la Reservation.          */
    /*************************************************************/

    enum Etat 
    {
        ATTENTE,
        PAYER,
        CONFIRMER,
        ANNULER;
    }
}

