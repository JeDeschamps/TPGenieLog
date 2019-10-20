package vol;

import java.lang.Object;
import java.time.*;

	/***********************************************************************/
	/* Classe vol 																												 */
	/* Attributs : identifiant (unique), une date de depart et d'arrivee	 */
	/* et un statut qui représente son ouverture à la réservation					 */
	/*																																		 */
	/* Implémente : un constructeur privé pour obtenir un singleton en 		 */
	/* limitant l'instanciation de la classe à la classe elle même, une 	 */
	/* méthode Duration pour la durée du vol, des getters pour les valeurs */
	/* de la classe et des setters privés pour l'attribut statut					 */
	/***********************************************************************/

public class Vol
{
	private final String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private boolean statut;

	/*************************************************************/
	/* Constructeur de Vol:		                                 	 */
  /* Entrée: un id pour vol, des dates de départ et d'arrivée  */
  /*                                                           */
	/* Sortie: Aucune                                            */
	/*																													 */
	/* On met le status a false car on considère que de base le  */
	/* vol n'est pas ouvert à la reservation.					 					 */
  /*************************************************************/

	private Vol(IdVol idvol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee)
	{
		this.identifiant = idvol.toString();
		this.depart = dateDepart;
		this.arrivee = dateArrivee;
		this.statut = false; //On considère qu'à la création du vol on ne peut pas encore réserver
	}

	/* Instance unique pré-initialisée */
	/* On doit initialiser des variables pour les passer en paramètre */
	/* du constructeur générique																			*/	

	private static ZonedDateTime departure;
	private static ZonedDateTime arrival;
	private static IdVol id;
	
	/* On appelle le constructeur de la classe avec nos variables statiques */

	private static Vol Instance = new Vol(id,departure,arrival);

	/***********************************************************************/

	/* On fait un get de l'instance public pour pouvoir le récupérer dans les autres classes */

	public static Vol getInstanceVol()
	{
		return Instance;
	}

	/* Un get pour l'heure de depart */

	public ZonedDateTime getDepart()
	{
		return this.depart;
	}


	/***********************************************************************/
	/* Debut de l'implementation des methodes duree ouvrir et fermer	   	 */
	/***********************************************************************/

	/***********************************************************************/
	/* Methode duree 																											 */
	/* Va calculer la durée qui sépare deux ZonedDateTime									 */
	/* En entrée : Rien, on utilise les attributs de la classe						 */
	/*																																		 */
	/* En sortie : une duration 																					 */
	/***********************************************************************/	

	public Duration duree()
	{
		Duration d = Duration.between(this.arrivee, this.depart);
		return d;
	}

	/***********************************************************************/
	/* On implemente 2 setters privés (pour l'encapsulation) qui modifient */
	/* le statut, autrement dit si le vol est ouvert ou fermé à la 				 */
	/* réservation																												 */
	/***********************************************************************/

	private void ouvrir()
	{
		this.statut = true;
	}

	private void fermee()
	{
		this.statut = false;
	}
	
	/***********************************************************************/
	/* Un get public pour récuperer le statut dans la classe réservation	 */
	/* qui s'en sert pour savoir si on peut effectuer une réservation			 */
	/***********************************************************************/
	public boolean getStatut()
	{
		return this.statut;
	}	
}
