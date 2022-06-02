
package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DeleteEclass {
    public static void main(String[] args){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", "root", null);
             
             Scanner sp=new Scanner(System.in);
             String[] fnames=new String[2];
             System.out.println("Perform 3 deletions using First_name as the KeyWord");
           for(int i=0;i<2;i++){
               System.out.println("Enter the first name for deletion");
               fnames[i]=sp.nextLine();
           }
            Statement stm=cn.createStatement();
          stm.addBatch("delete from student_and_course where First_Name='"+fnames[0]+"';");
          stm.addBatch("delete from student_and_course where First_Name='"+fnames[1]+"';");
        stm.executeBatch();
         }catch(Exception r){
             System.out.println("Successfully deleted");
             JOptionPane.showMessageDialog(null, r);
         }
    }
}
