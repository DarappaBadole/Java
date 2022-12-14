import java.util.*;

class ExceptionDEmo2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[]={10,20,30,40};

        System.out.println("ENter th index of array ");
        int i = sobj.nextInt();

        System.out.println("Data at the specified index"+Arr[i]);

    }
}