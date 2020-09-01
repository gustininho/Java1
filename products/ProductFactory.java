package products;

public class ProductFactory
{
  public CountablePriceForQuantity getProduct(String productType){
     if(productType == null){
        return null;
     }
     if(productType.equalsIgnoreCase("PRODUCT")){
        return new Product();

     } else if(productType.equalsIgnoreCase("PERMITTED")){
        return new PermittedProduct();

     } else if(productType.equalsIgnoreCase("WARMED")){
        return new WarmedProduct();
     }

     return null;
  }

  public Purchasable getProductPurchasable(String productType){
     if(productType == null){
        return null;
     }
     if(productType.equalsIgnoreCase("PRODUCT")){
        return new Product();

     } else if(productType.equalsIgnoreCase("PERMITTED")){
        return new PermittedProduct();

     } else if(productType.equalsIgnoreCase("WARMED")){
        return new WarmedProduct();
     }

     return null;
  }

}
