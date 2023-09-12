package ifelsestatement;

public class lab006
{
    public static void main(String[] args)
    {
       if(true)
       {
           System.out.println("1");
           if(true)
           {
               System.out.println("3");
               if(false)
               {
                   System.out.println("3");
               }
               else
               {
                   System.out.println("4");
               }
           }
       }

    }
}
