package products;

public class PurchaseException extends Exception
{

    public PurchaseException ()
    {
        super("Pirkimas nepavyko.");
    }

    public PurchaseException (String msg)
    {
        super("Pirkimas nepavyko." + msg);
    }
}
