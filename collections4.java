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

class collections4
{
    public static void main(String arr[])
    {
       LinkedList <Book> lobj = new LinkedList<Book>();

       Book bobj1 = new Book("Let us c ",400);
       Book bobj2 = new Book("Data structure ",580);
       Book bobj3 = new Book("C++ programming ",9000);
       Book bobj4 = new Book("Angular web development ",500);

       lobj.add(bobj1);
       lobj.add(bobj2);
       lobj.add(bobj3);
       lobj.add(bobj4);

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