package vol;

public class IdIdentifiant
{
    private double indent= 0000;

    /*************************************************************/
    /* Constructeur d'IdIdentifiant:                             */
    /* Entree: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                           */
    /*                                                           */
    /* On utilise l'attribue prive de la classe afin de l'incre- */
    /* menter à chaque appel. Cela nous donne un id unique.      */
    /*************************************************************/

    private IdIdentifiant()
    {
        this.indent = this.indent + 1;
    }

    private static IdIdentifiant Instance = new IdIdentifiant();

    public static IdIdentifiant getIdentifiant()
    {
        return Instance;
    }
}

