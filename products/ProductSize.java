package products;

     public class ProductSize implements Cloneable
    {
      private int height;
      private int weight;
      private int length;

      protected Object clone() throws CloneNotSupportedException
      {
        return super.clone();
      }

      public void setHeight (int height)
      {
        this.height = height;
      }

      public int getHeight ()
      {
        return height;
      }

      public void setWeight (int weight)
      {
        this.weight = weight;
      }

      public int getWeight ()
      {
        return weight;
      }

      public void setLength (int length)
      {
        this.length = length;
      }

      public int getLength ()
      {
        return length;
      }

    }
