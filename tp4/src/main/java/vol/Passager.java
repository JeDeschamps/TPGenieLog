package vol;

import java.util.*;

/***********************************************************************/
/* Classe Passager																										 */
/* Attributs : string nom et contact pour l'identite de la personne et */
/* on lui passe en attribut le vol qui le concerne										 */
/* 																																		 */
/* Implémente : un constructeur public et un getter pour récupérer 		 */
/* l'instance du passager																							 */
/***********************************************************************/

public class Passager
{
    private String nom;
    private String contact;
		private ArrayList<Reservation> reservation;

    /*************************************************************/
    /* Constructeur de Passager:                                 */
    /* Entrée: Des String pour initialiser le nom, le moyen      */
    /* d'être contacté et le vol qui le concerne                 */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    public Passager(String nom_, String contact_, ArrayList<Reservation> listeReservation)
    {
        this.nom = nom_;
        this.contact = contact_;
        this.reservation.addAll(listeReservation);
    }

    public Passager getPassager()
    {
        return this;
    }
}
