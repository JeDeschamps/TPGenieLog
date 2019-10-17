

public class Client
{
    private String nom;
    private String paiement;
    private String contact;
    private IdClient reference;

    public Client(String nom_, String paiement_, String contact_, IdClient ref_)
    {
        this.nom = nom_;
        this.paiement = paiement_;
        this.contact = contact_;
        this.reference = ref_;
    }
}