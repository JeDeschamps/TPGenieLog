package vol;

/*************************************************************/
/* Classe IdIdentifiant																			 */
/* Classe variante d'un singleton qui permet d'obtenir un 	 */
/* identifiant réservation unique														 */
/*																													 */
/* Attribut : un attribut static pour qu'il soit commun à 	 */
/* la classe et pas aux instances de la classe qui correspond*/
/* à l'identifiant initial et on incrémentera sur celui-ci 	 */
/* pour en obtenir un nouveau																 */
/*																													 */
/* Implémente : un singleton et un getter public pour 			 */
/* que réservation récupère son identifiant également une		 */
/* méthode toString parce que l'identifiant de Vol doit être */
/* une String																								 */
/*************************************************************/

public class IdVol
{
    private int indent= 00000;

    /*************************************************************/
    /* Constructeur d'IdVol:                                     */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    private IdVol()
    {
    }

    private static IdVol Instance = new IdVol();

    /*************************************************************/
    /* Méthode toString:                                         */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: String                                            */
    /*                                                           */
    /* Transforme l'indent qui est un int en un String et le     */
    /* retourne.                                                 */
    /*************************************************************/

    public String toString()
    {
        return String.valueOf(this.indent);
    }

    public String getIdVol()
    {
				Instance.indent = Instance.indent + 1;
        return toString();
    }
}
