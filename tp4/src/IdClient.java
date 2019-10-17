

public class IdClient
{
    private int indent= 0000;

    private IdClient()
    {
        this.indent = this.indent + 1;
    }

    private static IdClient Instance = new IdClient();

    public static IdClient getRef()
    {
        return Instance;
    }
}