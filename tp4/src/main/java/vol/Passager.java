package vol;

public class Passager
{
    private String nom;
    private String contact;

    /*************************************************************/
    /* Constructeur de Passager:                                 */
    /* Entrée: Des String pour initialiser le nom, le moyen      */
    /*      d'etre contacter.                                    */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    public Passager(String nom_, String contact_)
    {
        this.nom = nom_;
        this.contact = contact_;
    }

    public Passager getPassager()
    {
        return this;
    }
}