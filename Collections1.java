import java.util.*;

class Collections1
{
    public static void main(String arg[])
    {
       LinkedList<Integer>lobj = new LinkedList<Integer>();
       lobj.add(11);
       lobj.add(21);
       lobj.add(51);
       lobj.add(101);
       lobj.add(111);
       
       System.out.println("Elements of linked list are:"+lobj);
       
       lobj.addFirst(1);
       System.out.println("Elements of linked List are :"+lobj); 
       
        lobj.addLast(121);
        System.out.println("Elements of linked List are :"+lobj); 
          
        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains(121))
        {
            System.out.println("121 is present in LL");
        }
        else
        {
            System.out.println("121 is not present in LL");
        }
        lobj.remove();
        System.out.println("Elements of linked List are :"+lobj); 
       
        
        lobj.remove();
        System.out.println("Elements of linked List are :"+lobj); 
        
        lobj.remove(0);
        System.out.println("Elements of linked List are :"+lobj); 
        
        lobj.removeLast();
        System.out.println("Elements of linked List are :"+lobj); 
       
       System.out.println("Number of elements are :"+lobj.size());

       lobj.set(1,500);
       System.out.println("Number of elements are :"+lobj);



       lobj.clear();
       System.out.println("Number of elements are :"+lobj);

    
    
    
    
    
    
    }

}