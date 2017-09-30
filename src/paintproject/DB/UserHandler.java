
package paintproject.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserHandler {
 
    
    public static void addUser(String username , String password){
        
        String query="insert into users (username, password) values('"+username+"','"+password+"');";
        Connector.updateQuery(query);
       }
    
    
    public static int getID(String username){
      String query= " select id from users where username='"+username+"';";
      int id =0 ; 
        ResultSet rs = Connector.getFromDB(query);
        try {
        rs.next();
            id=rs.getInt("id");        
        } catch (SQLException ex) {
            Logger.getLogger(UserHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      return id ; 
    }
    
    
    private static String getPassword(String username) {
        String query="select password from users where username='"+username+"';";
        String pass="";
        System.out.println(query);
        ResultSet rs = Connector.getFromDB(query);
        try {
        rs.next();
            pass=rs.getString("password");
            System.out.println(pass);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UserHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pass;
    }
    
    public static boolean isCorrectUser(String username , String password){
        String pass=getPassword(username);
        return pass.equals(password)?true:false;
    }
    
    
    
    
    
}
