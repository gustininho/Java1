import java.util.Scanner;

    class Editor
    {
        public static void main(String args[])
        {
          int result = Integer.parseInt(args[0]);

          System.out.print("Enter a string : ");
          Scanner scanner = new Scanner(System. in);
          String inputString = scanner. nextLine();
          System.out.println("String read from console is : "+inputString);

          StringBuffer outputString=new StringBuffer(inputString.length());

          int inputlength=inputString.length();

          for(int i=0;i<inputlength;i++)
          {

              if(((i%result)==0)&&(i!=0))
              {
                    outputString.replace(i,i,"\n");
              }
              else
              {
                   outputString.insert(i,inputString.charAt(i));
              }

          }
          System.out.println(outputString.toString());
        }
    }
