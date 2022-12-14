
class Jagged
{
      public static void main(String Arg[])
      {

        int Arr[][]={{10,20},{50,60,70,80},{90,100,110}};
          

        System.out.println(Arr.length);     //3
        System.out.println(Arr[0].length);  //2
        System.out.println(Arr[1].length);  //4
        System.out.println(Arr[2].length);  //3

        
        System.out.println(Arr[0][1]);   //20
        System.out.println(Arr[0][0]);//10
        
        System.out.println(Arr[2][2]);  //110
        System.out.println(Arr[1][1]);   //60
        System.out.println(Arr[1][3]);  //80
        System.out.println(Arr[1][2]);  //70
        System.out.println(Arr[2][1]);  //100
        

        
        




      }
}