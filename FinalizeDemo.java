
class Demo
{
   int Size;
   int Arr[];

   public Demo(int iNo)
   {
    Size =  iNo;
    Arr = new int[Size];

   }
   protected void finalize()
   {
     System.out.println("inside final");

   }
}
class FinalizeDemo

{

    public static void main(String s[])
    
    {
       Demo obj = new Demo(4);
       obj = null;
       System.gc();


    }
}