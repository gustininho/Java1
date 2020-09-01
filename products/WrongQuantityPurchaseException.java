package products;

public class WrongQuantityPurchaseException extends PurchaseException
{

    public WrongQuantityPurchaseException (String msg)
    {
        super(msg);
    }

    public WrongQuantityPurchaseException (int inputQuantity)
    {
        super("Pirkejas nori isigyti daugiau prekiu ("+ inputQuantity +"), negu ju yra like aparate");
    }
    public WrongQuantityPurchaseException ()
    {
        super("Pirkejas nori isigyti daugiau prekiu, negu ju yra like aparate");
    }
}
