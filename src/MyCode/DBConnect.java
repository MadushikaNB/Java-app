/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCode;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MNB
 */
public class DBConnect {
    
    public static Connection connect()
    {
        Connection conn = null;
        String host= "";
        String username ="";
        String password = "";
    //watermate.000webhostapp.com
        /*$db_name = "id489183_watermate";
       $mysql_username = "id489183_sandun";
       $mysql_password = "12345";
       Chat Conversation End
       */
        try
        {  
      Class.forName("com.mysql.jdbc.Driver").newInstance();      
     conn = (Connection) DriverManager.getConnection(host,username,password);
    
     System.out.println("connection ok..");
        }
        catch(Exception e)
        {  
            //e.printStackTrace();
            System.out.println(e);
        } 
        return conn; 
    }
}
  