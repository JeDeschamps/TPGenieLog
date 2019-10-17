import java.util.*;
import java.lang.Object;
import java.time.*;

public class Reservation
{
    public ZoneDateTime date;
    public Double identifiant;
    public String etat;

    public Reservation(String nom, String contact)
    {
        Vol vol = getInstance();
        Passager passager = new Passager(nom, contact);
        this.date = vol.getDepart();
        this.etat = "en attente";
    }

    public void annuler()
    {
        if (this.etat != "annuler")
        {
            this.etat = "annuler";
        }
        else
        {
            System.out.println("Vous ne pouvez pas annuler une réservation déjà annuler");
        }
    }

    public void confirmer()
    {
        if (this.etat == "payer")
        {
            this.etat = "confirmer";
        }
        else
        {
            System.out.println("Vous devez d'abord payer avant de confirmer ou vous ne pouvez pas confirmer une réservation déjà annuler");
        }
    }

    public void payer()
    {
        if (this.etat == "en attente")
        {
            this.etat = "payer";
        }
        else
        {
            System.out.println("Vous ne pouvez pas payer une reservation déjà payer, confirmer ou annuler");
        }
    }
}