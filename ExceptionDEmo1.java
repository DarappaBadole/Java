import java. util.*;



class ExceptionDemo1
{
    public static void main(String a[])
    {
     
       Scanner sobj = new Scanner(System.in);
       int iNo1 = 0 ,iNo2 = 0 ,iAns = 0;

     System.out.println("ENter first number");

     iNo1 = sobj.nextInt();
      
       System.out.println("ENter second number");

     iNo2 = sobj.nextInt();

     iAns = iNo1 / iNo2;

     System.out.println("Division is :"+iAns);


     



    }
}