/*

class Object
{
     //code
}

*/


//import java.lang.*;        (optional)



class Base        //class Base extende Object
{
   public int A,B;

   public Base()
   {
      System.out.println("BAse constructor");
      this.A = 10;
      this.B = 20;

   }
    
    public void fun()     //Defination
    {
        System.out.println("inside base fun");

    }

    public void gun()     //defination
    {
        System.out.println("inside base gun");

    }
    public void fun(int iNo)      //overloaded defination
    {
          System.out.println("inside base fun with one parameter");

    }

}

class Derived extends Base    //class Derived : public Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");
       
       this.X = 30;
       this.Y = 40;


    }

    public void sun()   //defination
    {
        System.out.println("inside derived sun");

    }

    public void gun()     //overrided defination
    {
        System.out.println("inside derived gun");

    }

}




class Single
{
   public static void main(String arg[] )
   {
      // Base boj1 = new Base();               //No casting
       //Derived dobj1 = new Derived();    //no casting 
       Base bobj2 = new Derived();     //upcasting
      
      //Derived dobj2 = new Base();    //Downcasting(not allowed)

      bobj2.fun();     //base fun
      bobj2.fun(11);   //base fun
      bobj2.gun();    // derived gun 
      //bobj2.sun();    //derived sun

   }







}