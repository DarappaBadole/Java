import java.util.*;

class AgeInvalidException extends Exception
{

  AgeInvalidException(String str)
  {
    super (str);
  }

}

class UserDefinedException
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter your age:");
       int iAge = sobj.nextInt();

       try
       {
           if(iAge < 15)
           {
           //  or//// throw new AgeInvalidException("your Age is Less Than 15");
              AgeInvalidException aobj = new AgeInvalidException("your age is  less than 15");
             throw aobj;
           }
       

         else
         {
         System.out.println("Age is valid");
         } 

        }
         

         catch(AgeInvalidException obj)
         {
           System.out.println(obj);
         }


    }














}