
package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Updates {
    public static void main(String[] args){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection cpp=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root", null);
            System.out.println("Statement to Update the First_Name");
            
            Scanner sp=new Scanner(System.in);    
       
            System.out.println("Perform three updates");
            int[] size=new int[2];String[] fnames=new String[2];String[] nfname=new String[2];
            for(int i=0;i<2;i++){
                System.out.println("Enter the last_name");
                fnames[i]=sp.nextLine();
                System.out.println("Enter the First_Name you need ");
                nfname[i]=sp.nextLine();
            }
            Statement Statemnet = cpp.createStatement();
            Statemnet.addBatch("update student_and_course set First_Name='"+nfname[0]+"' where Last_Name='"+fnames[0]+"';");
            Statemnet.addBatch("update student_and_course set First_Name='"+nfname[1]+"' where Last_Name='"+fnames[1]+"';");
           
          
           int[] records=Statemnet.executeBatch();
        }catch(Exception ep){
            
            JOptionPane.showMessageDialog(null,ep);
        }finally{
            System.out.println("Successfully updated the values");
        }
        
    }
}
