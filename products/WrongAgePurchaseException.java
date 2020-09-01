package products;

public class WrongAgePurchaseException extends PurchaseException
{
  private int userAge;

    public WrongAgePurchaseException (String msg)
    {
        super(msg);
    }

    public WrongAgePurchaseException (int userAge, int requiredAge )
    {
        super(" Pirkejas yra per jaunas. Jam yra " + userAge + " metu, o reikia tureti bent " +requiredAge);
    }

    public WrongAgePurchaseException ()
    {
        super("Pirkejas netenkina amziaus cenzo.");
    }
}
