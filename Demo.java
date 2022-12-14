
class Maths
{

    public int iNo1;    //characteristics
    public int iNo2;    // characteristics

    public Maths()     //default constructor
    {
      System.out.println("Inside default constructor");

    }
    public Maths(int a,int b)    //parameterised constructor
    {

     System.out.println("inside parameterised constructor");
     iNo1=a;

     iNo2=b;
    }
    public int Addition()    //Behaviour
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;

    }
    public int Substraction()   //Behaviour
    {
        int iAns=0;
        iAns=iNo1-iNo2;
        return iAns;

    }


  } //End of class.


class Demo

{

 public static void main(String arr[])
 {
   System.out.println("inside main function ");

 Maths mobj1 =new Maths();
 Maths mobj2 = new Maths(10,11);

 int iRet=0;
 iRet=mobj1.Addition();
 System.out.println("Addition is : "+iRet);

 iRet=mobj2.Addition();
 System.out.println("Addition is : "+iRet);




 }



}