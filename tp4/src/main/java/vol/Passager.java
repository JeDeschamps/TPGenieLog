package vol;

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
		private Reservation[] reservation;

    /*************************************************************/
    /* Constructeur de Passager:                                 */
    /* Entrée: Des String pour initialiser le nom, le moyen      */
    /* d'être contacté et le vol qui le concerne                 */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    public Passager(String nom_, String contact_)
    {
        this.nom = nom_;
        this.contact = contact_;
        for (int i = 0; i < this.reservation.length; i++)
        {
          this.reservation[i] = this.reservation[i].getReservation();
        }
    }

    public Passager getPassager()
    {
        return this;
    }
}
