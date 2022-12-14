
interface Circle
{
    float PI = 3.14f;    //public static final float  PI = 3.14f;

    float Area(float Radius);    //public abstract float area (float Radius);
    float Circumfarance(float Radius); //public abstract float Circumference(float Radius);

}

class Marvellous implements Circle
{
 
    public float Area(float Radius)
   {
      return PI*Radius*Radius;
   }


   
   public float Circumfarance(float Radius)
   {
      return 2 * PI * Radius;

   }

}







class InterfaceDemo
{
    public static void main(String arr[])
    {
        System.out.println("value of pi is :"+Circle.PI);     //to demonstarte public and static
       // Circle.PI = 7.12f;      //to demonstrate final

      Circle cobj = new Marvellous();
      float Ret = 0.0f;
      Ret = cobj.Area(10.5f);
      System.out.println("Area is :"+Ret);

      Ret = cobj.Circumfarance(10.5f);
      System.out.println("Circumfarance i s: is :"+Ret);
      


    }
}