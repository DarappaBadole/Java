import java.util.*;

class Book
{
    public String Name;
    public  int price;

    public Book(String s,int i)
    {
        this.Name = s;
        this.price = i;

    }

    public void Display()
    {
        System.out.println("Book Name : "+this.Name+"prize :"+this.price);
    }
}

class collections3
{
    public static void main(String arr[])
    {
       LinkedList <Book> lobj = new LinkedList<Book>();

       lobj.add(new Book("Let uc c",400));
        lobj.add(new Book("Data Sructure",580));
         lobj.add(new Book("C++ programming",980));
          lobj.add(new Book("Angular web development",790));

      Iterator iobj = lobj.iterator();
      Book bref = null;

      System.out.println("Elements of Book are");

      while(iobj.hasNext())
      {
        bref  = (Book)iobj.next();
        bref.Display();

      }
      lobj.clear();

    }
}