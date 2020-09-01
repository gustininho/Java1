package products;

    public class WarmedProduct extends Product implements PurchasableWithDiscount, CountablePriceForQuantity
    {
        protected int requiredTemperature=0;
        protected double timeToWarmOneCelcius;
        protected boolean isPacked=true;

        public WarmedProduct()
        {
          requiredTemperature=0;
          timeToWarmOneCelcius=0;
        };

        public WarmedProduct (String name, int id, double price, int requiredTemperature, double timeToWarmOneCelcius)
        {
          super(name,id,price);
          this.requiredTemperature = requiredTemperature;
          this.timeToWarmOneCelcius = timeToWarmOneCelcius;
        }

        public WarmedProduct (String name, int id, double price, int requiredTemperature, double timeToWarmOneCelcius, int quantity)
        {
          super(name,id,price,quantity);
          this.requiredTemperature = requiredTemperature;
          this.timeToWarmOneCelcius = timeToWarmOneCelcius;
        }

        public void purchase (int quantity) throws WrongQuantityPurchaseException
        {
              super.purchase(quantity);

              unpack();
              waitTime(quantity);
        }

        public double waitTime(int quantity)
        {
                return  (requiredTemperature*timeToWarmOneCelcius)*quantity;
        }

        public void unpack ()
        {
          isPacked=false;
        }

        public double priceForQuantity (int quantity)
        {
          return quantity*price+3;
        }

        public String toString()
        {
          return String.format("Warmed product required temperature " + requiredTemperature + " and time needed to warm 1 celcius " + timeToWarmOneCelcius);
        }

        public double purchaseWithDiscount (int quantity)
        {
          super.quantity=super.quantity-quantity;

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
