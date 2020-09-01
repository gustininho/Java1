package products;
import java.util.Scanner;

    public abstract class BaseProduct
    {
      protected String name;
      protected int id;
      protected double price;

      // Getter name
      public String getName()
      {
        return name;
      }
      // Setter name
      public void setName(String newName)
      {
        name = newName;
      }

      public int getId()
      {
        return id;
      }

      public double getPrice()
      {
        return price;
      }

      public final void setPrice(double newPrice)
      {
        if(newPrice>0)
        {
          price = newPrice;
        }

      }

      public void setData(String name, double price)
      {
        this.name=name;

        if(price>0)
        {
          this.price=price;
        }
      }
    }
