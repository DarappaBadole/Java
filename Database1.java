import java.sql.*;


class Database
{
  public static void main(String arg[]) throws Exception
 {
   
   Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa41","root","root");
    
   Statement sobj = cobj.createStatement();

   ResultSet robj = sobj.executeQuery("select*from student");

   while(robj.next())
   {
    System.out.println("RID:"+robj.getInt("RID"));
    System.out.println("Name:"+robj.getInt("Name"));
    System.out.println("City:"+robj.getInt("City"));
    System.out.println("Marks:"+robj.getInt("Marks"));


  }
  
 }


}