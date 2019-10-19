package vol;

public class Client
{
    private String nom;
    private String paiement;
    private String contact;
    private IdClient reference;

    /*************************************************************/
    /* Constructeur de Client:                                   */
    /* Entree: Des String pour initialiser le nom, le paiement   */
    /*      qui correspond au moyen de paiement, le moyen d'etre */
    /*      contacter et enfin une ref qui sera unique           */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    public Client(String nom_, String paiement_, String contact_, IdClient ref_)
    {
        this.nom = nom_;
        this.paiement = paiement_;
        this.contact = contact_;
        this.reference = ref_;
    }
}