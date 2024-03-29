package vol;

/*************************************************************/
/* Classe IdClient																					 */
/* Classe variante d'un singleton qui permet d'obtenir un 	 */
/* identifiant client unique																 */
/*																													 */
/* Attribut : un attribut static pour qu'il soit commun à 	 */
/* la classe et pas aux instances de la classe qui correspond*/
/* à l'identifiant initial et on incrémentera sur celui-ci 	 */
/* pour en obtenir un nouveau																 */
/*																													 */
/* Implémente : un singleton et un getter public pour 			 */
/* que réservation récupère son identifiant	 								 */
/*************************************************************/

public class IdClient
{
    
    private int indent= 0000;

    /*************************************************************/
    /* Constructeur d'IdClient:                                  */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*************************************************************/

    private IdClient()
    {
    }

    private static IdClient Instance = new IdClient();

    public IdClient getRef()
    {
				/* Même principe que pour IdIdentifiant */
				Instance.indent = Instance.indent + 1;
        return Instance;
    }
}
