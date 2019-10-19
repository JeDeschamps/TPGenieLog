package vol;

import java.lang.Object;
import java.time.*;

public class Vol
{
	private final String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private boolean statut;

	/*************************************************************/
    /* Constructeur de Vol:		                                 */
    /* Entrée: un id pour vol, des dates de départ et d'arrivée  */
    /*                                                           */
	/* Sortie: Aucune                                            */
	/*															 */
	/* On met le status a false car on considère que de base le  */
	/* vol n'est pas ouvert à la reservation.					 */
    /*************************************************************/

	private Vol(IdVol idvol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee)
	{
		this.identifiant = idvol.toString();
		this.depart = dateDepart;
		this.arrivee = dateArrivee;
		this.statut = false;//
	}

	/* Instance unique pré-initialisée */
	
	private static ZonedDateTime departure;
	private static ZonedDateTime arrival;
	private static IdVol id;
	
	private static Vol Instance = new Vol(id,departure,arrival);

	public static Vol getInstanceVol()
	{
		return Instance;
	}
	public ZonedDateTime getDepart()
	{
		return this.depart;
	}
	/***********************************************************************/
	/* Debut de l'implementation des methodes duree ouvrir et fermer	   */
	/***********************************************************************/
	public Duration duree()
	{
		Duration d = Duration.between(this.arrivee, this.depart);
		return d;
	}
	private void ouvrir()
	{
		this.statut = true;
	}
	private void fermee()
	{
		this.statut = false;
	}
	public boolean getStatut()
	{
		return this.statut;
	}	


	
}
