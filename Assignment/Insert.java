
package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Insert {
 public static void main(String[] args){
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection cpp=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root", null);
         System.out.println("Statement to insert the values into the database");
        String insert="insert into student_and_course values"+"('Ali','Luty','Idit','4.4'),"+"('Musa','Juma','His','2.2')";
         PreparedStatement vpn=cpp.prepareStatement(insert);
         vpn.executeUpdate();
         cpp.close();
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }finally{
         System.out.println("Successfully inserted the values");
     }
 }   
}
