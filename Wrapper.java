
class Wrapper
{
    public static void main(String A[])
    {
        int no = 11;
        Integer iobj = new Integer(no);  //Boxing - converting primitive to wrapper

        System.out.println(no);
        System.out.println(iobj);

        int X= iobj;  //Unboxing - Converting Wrapper to primitive
        System.out.println(X);
    }
}