//  same as constatnt characteristics of class from c++


class Demo
{
    public int No1;
    public final int No2 = 11;
    public final int No3;


    public Demo()
    {
        No1 = 0;
        No3 = 21;

    }
}





class final1
{
    public static void main(String arr[])
    {    
        final int i = 51;
        
         Demo obj = new Demo();
         obj.No1++;
     //  obj.No2++;
     //  oBj.No3++;

    }
}