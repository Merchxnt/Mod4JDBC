import java.sql.Connection;
import java.sql.DriverManager;

public class Mod4JDBC {
    
    public static void main(String[] args)  {

        try{
            //step 1 create a connection to the database
            class.forName{"com.mysql.cj.jdbc.Driver"};
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:/northwind","root", "admin");
        }catch {Exception e}    {

        }//end try catch

        System.out.println(" Would you like to see the inventory of three different product lines? Classic Cars, Ships, & Motorcycles ");
        //input a if else statment 
        if(answer = yes)    {
            System.out.println("Select * From ")
        }
    }//end main

}//end class

