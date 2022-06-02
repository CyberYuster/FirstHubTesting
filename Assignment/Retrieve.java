
package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Retrieve {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", "root", null);
       String sql="select*from student_and_course";
       PreparedStatement pt=cn.prepareStatement(sql);
     
       ResultSet rr=pt.executeQuery();
       while(rr.next()){
         
         System.out.println(rr.getString(1)+" "+rr.getString(2)+" "+rr.getString(3)+" "+rr.getString(4));
          
       }
        System.out.println("Data is well retieved");
       cn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
