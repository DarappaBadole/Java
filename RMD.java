class Base
{
   public void fun()
   {
    System.out.println("base fun");

   }
   public void gun()
   {
     System.out.println("base gun");

   }
   public void sun()
   {
     System.out.println("base sun");
   }

}
class Derived extends Base
{
    public void fun()
        {
             System.out.println("derived fun");
        }
    public void gun()
    {
         System.out.println("derived gun");
    }
     public void run()
     {

         System.out.println("Derived run");
     }

}


class RMD
{
    public static void main(String a[])
    {
         Base bobj = new Derived();     //upcasting 

         bobj.fun();    //Derived fun
         bobj.gun();     //Derived gun
         bobj.sun();    //Base sun
         //bobj.run();    //Errror

    }
}