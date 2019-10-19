


public class IdVol
{
    private int indent= 00000;
    private String id;

    private IdVol()
    {
        this.indent = this.indent + 1;
        id = toString();
    }

    private static IdVol Instance = new IdVol();

    public String toString()
    {
        return String.valueOf(this.indent);
    }

    public static IdVol getIdVol()
    {
        return Instance;
    }
}