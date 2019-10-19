package vol;

public class IdClient
{
    
    private int indent= 0000;

    /*************************************************************/
    /* Constructeur d'IdClient:                                  */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On utilise l'attribue privé de la classe afin de l'incré- */
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