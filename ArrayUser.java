 import java.util.Scanner;


class ArrayUser
{
 public static void main(String Arg[])
 {      
        int iCnt=0;
        int iSum=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int iSize = sobj.nextInt();
        

        //int Arr[]=(int *)malloc(iSize*sizeof(int ));

        int Arr[] = new int [iSize];

        System.out.println("Number of elements in the array are:"+Arr.length);

        System.out.println("Enter the elements of Array :");
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {

          Arr[iCnt] = sobj.nextInt();




        }
        System.out.println("Elements of array are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {

          System.out.println(Arr[iCnt]);
        }

          System.out.println("The Addition of Array is :");
          for(iCnt=0;iCnt<4;iCnt++)
          {

           iSum=iSum + Arr[iCnt];


          }
        
           System.out.println("Addition is:"+iSum);
 }








}