package products;

import java.util.Scanner;

    public class Product extends BaseProduct implements PurchasableWithDiscount, Cloneable, CountablePriceForQuantity
    {
      protected int quantity=99;
      private static int productCount;
      public ProductSize size = new ProductSize();

      public Object clone() throws  CloneNotSupportedException
        {
            Product cloned = (Product)super.clone();

            cloned.setSize((ProductSize)cloned.getSize().clone());

            return cloned;
        }

      public void setSize (ProductSize ProdSize)
      {
        this.size = ProdSize;
      }

      public ProductSize getSize ()
      {
        return size;
      }

      private static void addedNewProduct()
      {
        productCount++;
      }


      public Product(String name,int id, double price)
      {
        super.name=name;
        super.id=id;

        if(price>0)
        {
          super.price=price;
        }

        addedNewProduct();
      }

      public Product(String name,int id, double price, int quantity)
      {
        super.name=name;
        super.id=id;
        this.quantity=quantity;

        if(price>0)
        {
          super.price=price;
        }

        else
        {
           System.out.println("Kaina negali buti neigiama arba lygi 0");
        }

        addedNewProduct();
      }

      public Product()
      {
        this("",0,0);
      }

       public int getQuantity()
       {
         return quantity;
       }

       public final void setQuantity(int newQuantity)
       {
         quantity = newQuantity;
       }

       public void purchase(int quantity) throws WrongQuantityPurchaseException
       {
  		   if(this.quantity<quantity)
  		   {
           throw new WrongQuantityPurchaseException(quantity);
  		   }
  		   else
  		   {
  				this.quantity=this.quantity-quantity;
  		   }
       }

       public double priceForQuantity (int quantity)
       {
         return quantity*price;
       }

       public double purchaseWithDiscount (int quantity)
       {
         this.quantity=this.quantity-quantity;

         if ((quantity>3)&&(quantity<10))
         {
           return quantity*price*0.9;
         }
         if (quantity>9)
         {
           return quantity*price*0.75;
         }
         else
         {
           return quantity*price;
         }

       }

    }
