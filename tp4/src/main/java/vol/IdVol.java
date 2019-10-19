package vol;

public class IdVol
{
    private int indent= 00000;
    private String id;

    /*************************************************************/
    /* Constructeur d'IdVol:                                     */
    /* Entrée: Aucune                                            */
    /*                                                           */
    /* Sortie: Aucune                                            */
    /*                                                           */
    /* On utilise l'attribue privé de la classe afin de l'incre- */
    /* menter à chaque appel. Cela nous donne un id unique.      */
    /* A l'aide de toString, on transforme l'int id en un String.*/
    /*************************************************************/

    private IdVol()
    {
        this.indent = this.indent + 1;
        id = toString();
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

    public static IdVol getIdVol()
    {
        return Instance;
    }
}