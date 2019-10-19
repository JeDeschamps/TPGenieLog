import java.util.*;
import java.lang.Object;
import java.time.*;

public class Reservation
{
    public ZonedDateTime date;
    public idIdentifiant identifiant;
    public Etat etat;
    public Vol vol;
    private Passager passager;

    public Reservation(String nom, String contact)
    {
        this.vol.getInstanceVol();
        this.passager.getPassager();
        this.identifiant = identifiant.getIdentifiant();
        this.date = vol.getDepart();
        this.etat = Etat.ATTENTE;
    }

    public void annuler()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat != Etat.ANNULER) && (test == true))
        {
            this.etat = Etat.ANNULER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas annuler une réservation déjà annuler ou fermer.");
        }
    }

    public void confirmer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.PAYER) && (test == true))
        {
            this.etat = Etat.CONFIRMER;
        }
        else
        {
            System.out.println("Vous devez d'abord payer avant de confirmer ou vous ne pouvez pas confirmer une réservation déjà annuler ou fermer.");
        }
    }

    public void payer()
    {
        boolean test = this.vol.getStatut();
        if ((this.etat == Etat.ATTENTE) && (test == true))
        {
            this.etat = Etat.PAYER;
        }
        else
        {
            System.out.println("Vous ne pouvez pas payer une reservation déjà payer, confirmer, annuler ou fermer.");
        }
    }

    enum Etat 
    {
        ATTENTE,
        PAYER,
        CONFIRMER,
        ANNULER;
    }
}

