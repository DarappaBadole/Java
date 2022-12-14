import java.sql.*;


class Database
{
  public static void main(String arg[]) throws Exception
 {

   String URL = "jdbc:mysql://localhost:3306/ppa41";
   String Username ="root";  
   String password = "root";
   String Query = "select * from student";


   Connection cobj = DriverManager.getConnection(URL,Username,password);
    
  Statement sobj = cobj.createStatement();

  ResultSet robj = sobj.executeQuery(Query);

  while(robj.next())
  {
    System.out.println("RID:"+robj.getInt("RID"));
    System.out.println("Name:"+robj.getInt("Name"));
    System.out.println("City:"+robj.getInt("City"));
    System.out.println("Marks:"+robj.getInt("Marks"));


  }
  



 
 }


}