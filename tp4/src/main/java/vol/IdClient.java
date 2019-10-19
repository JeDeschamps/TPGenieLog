package vol;

public class IdClient
{
    
    private int indent= 0000;

    /*************************************************************/
    /* Constructeur d'IdClient:                                  */
    /* Entree: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On utilise l'attribue prive de la classe afin de l'incre- */
    /* menter à chaque appel. Cela nous donne un id Client unique*/
    /*************************************************************/

    private IdClient()
    {
        this.indent = this.indent + 1;
    }

    private static IdClient Instance = new IdClient();

    public static IdClient getRef()
    {
        return Instance;
    }
}