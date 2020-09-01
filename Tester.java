package testing;

import java.util.Scanner;

import products.Product;
import products.PermittedProduct;
import products.WarmedProduct;
import products.PurchaseException;
import products.WrongAgePurchaseException;
import products.WrongQuantityPurchaseException;
import products.CountablePriceForQuantity;
import products.ProductFactory;
import products.Purchasable;


    class Tester
    {
        public static void main(String args[])
        {

          Product snickers = new Product("snickers",1,2.2);
          PermittedProduct whiskey = new PermittedProduct("tullamore",3,17.2,1);
          PermittedProduct cigarettes = new PermittedProduct("malborro",4,3.7,2);
          PermittedProduct tobacco = new PermittedProduct("mint",8,1.2,2);
          WarmedProduct burger = new WarmedProduct("chicken burger",5,5.8,60,0.2);

          Product water = new Product("tiche",2,1.3);
          Product beer = new PermittedProduct("hennessy", 6, 1.3, 5);
          Product chicken = new WarmedProduct("alfredo sauce", 7, 1.3, 52, 0.1);

           int inputPrice;
           Scanner input = new Scanner(System.in);

           ProductFactory ProdFactory = new ProductFactory();

           CountablePriceForQuantity pirmasprod = ProdFactory.getProduct("PERMITTED");
           CountablePriceForQuantity antrasprod = ProdFactory.getProduct("PRODUCT");
           CountablePriceForQuantity treciasprod = ProdFactory.getProduct("WARMED");

           Purchasable ketvirtasprod = ProdFactory.getProductPurchasable("WARMED");

           System.out.println(pirmasprod.priceForQuantity(0));
           System.out.println(antrasprod.priceForQuantity(0));
           System.out.println(treciasprod.priceForQuantity(0));


            try
            {
                ketvirtasprod.purchase(1);

                Product whiskeyClone = (Product)whiskey.clone();
                water.purchase(81);
                tobacco.purchase(18,11);
                whiskey.purchase(20,1);

                whiskey.size.setHeight(5);

                System.out.println(whiskey.getName());
                System.out.println(whiskeyClone.getName());

                whiskeyClone.size.setHeight(10);


                System.out.println(whiskey.size.getHeight());
                System.out.println(whiskeyClone.size.getHeight());
            }
            catch ( WrongAgePurchaseException e )
            {
                System.out.println(e.getMessage());
            }
            catch ( WrongQuantityPurchaseException e )
            {
                System.out.println(e.getMessage());
                System.out.println("Water quantity: " + water.getQuantity());
                System.out.println("Tobacco quantity: " + tobacco.getQuantity());
                System.out.println("Whiskey quantity: " + whiskey.getQuantity());
            }
            catch ( CloneNotSupportedException e)
            {
                System.out.println(e.getMessage());
            }



        //  snickers.purchase(2);



        //      System.out.println(beer.priceForQuantity(3));
        //      System.out.println(chicken.priceForQuantity(3));
        //      System.out.println(water.priceForQuantity( 3));


      }
  }
