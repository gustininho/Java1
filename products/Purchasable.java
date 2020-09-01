package products;

public interface Purchasable
{
    public abstract void purchase(int quantity) throws WrongQuantityPurchaseException;
}
