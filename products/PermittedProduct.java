package products;
import java.util.Scanner;

    public class PermittedProduct extends Product implements Purchasable, CountablePriceForQuantity
    {
        protected int productType; // 1-alcohol  2- tobacco products

        public PermittedProduct (String name, int id, double price, int productType)
        {
          super(name,id,price);
          this.productType = productType;
        }

        public PermittedProduct (String name, int id, double price, int productType, int quantity)
        {
          super(name,id,price,quantity);
          this.productType = productType;
        }

        public PermittedProduct()
        {
          super();
          this.productType=0;
        }

        public void unpack ()
        {
          System.out.println("say b");
        }

        public void purchase (int userAge, int quantity) throws WrongAgePurchaseException, WrongQuantityPurchaseException
        {
          if (productType==1)
          {
            if (userAge >= 20)
            {
              super.purchase(quantity);
            }
            else
            {
              throw new WrongAgePurchaseException(userAge,20);
            }
          }
          if (productType==2)
          {
            if (userAge >= 18)
            {
              super.purchase(quantity);
            }
            else
            {
              throw new WrongAgePurchaseException(userAge,18);
            }
          }
        }


        public int getProductType()
        {
          return productType;
        }

        public String toString()
        {
          return String.format("Permitted product type" + productType);
        }

        public double priceForQuantity (int quantity)
        {
          return quantity*price+5;
        }


    }
