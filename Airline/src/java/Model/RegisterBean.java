
package Model;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;


public class RegisterBean {
    DBcon con = new DBcon();
    
    public boolean clientRegistration(String fname, String lname, String email,String password ){
       int state = 0;
       try{
           
           
           PreparedStatement ps = con.Connection().prepareStatement("insert into user (	first_name,last_name,,email,password,) values(?,?,?,?)");
           ps.setString(2,fname);
           ps.setString(3,lname);
           ps.setString(4,email);
           ps.setString(6,password);

           
           state = ps.executeUpdate();
           
       } catch (ClassNotFoundException | SQLException e){
        }
        return state == 1;
       
        
    }
    
}
