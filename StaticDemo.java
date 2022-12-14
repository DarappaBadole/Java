
class StaticDemo
{
    static 
    {
        System.out.println("inside static block which contains main");

    }
    public StaticDemo()
    {
        System.out.println("inside constructor of StaticDemo");

    }
   public static void main(String arg[])
     {

        System.out.println("inside main");
        System.out.println("Value of static No3:"+Demo.No3);   // Demo::No3
        System.out.println("value of static No4:"+Demo.No4);    //Demo::No4;

        Demo.gun();     //Demo::gun();
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.Fun();







     }

}

class Demo
{

   public int No1;   //non static  chracteristics
   public int No2;     //non static characteristics
   public static int No3;   //static characteristics
   public static int No4;    //static characteristics 

  
   public Demo ()              //constructor
   {
       System.out.println("inside constructor");
       No1=11;
       No2=21;

   }
   static               //static block
   {
      System.out.println("inside static block");
       No3=51;
      No4=101;


   }


   public void Fun()
   {

    //non static method can access static as well as non static data
    //we can use this keyword
     System.out.println("inside non static method fun");
     System.out.println("value of No1:"+this.No1);
     System.out.println("value of No2:"+this.No2);
    System.out.println("value of No3:"+this.No3);
    System.out.println("value of No4:"+this.No4);

   }
   public static void gun()
   {
    //static method can access only static data 
    //we can use this keyword

      System.out.println("inside static method gun");
    //System.out.println("value of No1:"+No1);
     //System.out.println("value of No2:"+No2);
    System.out.println("value of No3:"+No3);
    System.out.println("value of No4:"+No4);

   }


}