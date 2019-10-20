package vol;

/*************************************************************/
/* Classe IdReservation 																		 */
/* Classe variante d'un singleton qui permet d'obtenir un 	 */
/* identifiant réservation unique														 */
/*																													 */
/* Attribut : un attribut static pour qu'il soit commun à 	 */
/* la classe et pas aux instances de la classe qui correspond*/
/* à l'identifiant initial et on incrémentera sur celui-ci 	 */
/* pour en obtenir un nouveau																 */
/*																													 */
/* Implémente : un singleton et un getter public pour 			 */
/* que réservation récupère son identifiant	 								 */
/*************************************************************/

public class IdReservation
{
    private static double indent = 0000;

    /*************************************************************/
    /* Constructeur d'IdReservation:                             */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
		/* Le constructeur n'a pas de corps, l'attribut est déjà 		 */
		/* instancié à 0000																					 */
    /*************************************************************/

    private IdReservation()
    {
    }

    private static IdReservation Instance = new IdReservation();

    public IdReservation getIdentifiant()
    {
				/* Le getter incrémente l'attribut puis le retourne */
				/* pourrait être risqué notamment en cas d'appel concurrent de la fonction */
				Instance.indent = Instance.indent + 1;
        return Instance;
    }
}

