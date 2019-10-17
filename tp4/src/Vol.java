import java.lang.Object;
import java.time.*;

public class Vol
{
	private final String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private boolean statut;
	private Vol(String idvol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee)
	{
		this.identifiant = idvol;
		this.depart = dateDepart;
		this.arrivee = dateArrivee;
		this.statut = false;//On considère que de base le vol n'est pas ouvert à la reservation
	}
	public static Vol getInstanceVol()
	{
		
	}
	public ZonedDateTime getDepart()
	{
		return this.depart;
	}
	/***********************************************************************/
	/* Debut de l'implementation des methodes duree ouvrir et fermer			 */
	/***********************************************************************/
	public Duration duree()
	{
		Duration d = Duration.between(this.arrivee, this.depart);
		return d;
	}
	public void ouvrir()
	{
		this.statut = true;
	}
	public void fermee()
	{
		this.statut = false;
	}
	public boolean getStatut()
	{
		return this.statut;
	}	


	
}
