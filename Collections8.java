import java.util.*;

class Collections8
{
  public static void main(String arr[])
  {
  Hashtable<String,Integer>hobj = new Hashtable<String ,Integer>();

  hobj.put("PPA ",18000);
  hobj.put("LB ",17000);
  hobj.put("PYTHON ",16500);
  hobj.put("LSP ",21000);

  System.out.println(hobj.get("PYTHON "));
  hobj.remove("LB ");

  Enumeration eobj = hobj.keys();

  while(eobj.hasMoreElements())
  {

    System.out.println("Data is :"+eobj.nextElement());

  }
  
  
  
  





  }








}