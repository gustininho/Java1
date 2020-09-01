package products;

interface PurchasableWithDiscount extends Purchasable
{
  public double purchaseWithDiscount(int quantity);
}
