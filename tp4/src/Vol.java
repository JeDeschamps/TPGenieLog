import java.lang.Object;
import java.time.*;

public class Vol
{
	private final String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	public Vol(String idvol, ZonedDateTime dateDepart, ZonedDateTime dateArrivee)
	{
		this.identifiant = idvol;
		this.depart = dateDepart;
		this.arrivee = dateArrivee;
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
		ZonedDateTime tmp1 = arrivee;
		ZonedDateTime tmp2 = getDepart();
		Duration d = Duration.between(tmp1, tmp2);
		return d;
	}
}
