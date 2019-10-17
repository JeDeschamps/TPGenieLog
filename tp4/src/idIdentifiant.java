

public class idIdentifiant
{
    private double indent= 0000;

    private idIdentifiant()
    {
        this.indent = this.indent + 1;
    }

    private static idIdentifiant Instance = new idIdentifiant();

    public static idIdentifiant getIdentifiant()
    {
        return Instance;
    }
}

