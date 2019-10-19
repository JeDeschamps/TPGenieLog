package vol;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.*;
import java.lang.Object;
import java.time.*;

public class ReservationTest
{
    public ZonedDateTime date;
    public IdIdentifiant identifiant;
    public Etat etat;
    public Vol vol;
    private Passager passager;



    @Test 
    public void annuler()
    {
        this.etat = null;
    }


    enum Etat 
    {
        ATTENTE,
        PAYER,
        CONFIRMER,
        ANNULER;

    }
}