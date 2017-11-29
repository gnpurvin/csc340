/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikoluna1;

/**
 *
 * @author Larry
 */
import java.sql.*;
public class JDBC {
   public static void main(String args[]) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "1234");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from students");
            while (myRs.next()) {
                System.out.println(myRs.getInt("id") + myRs.getString("name") + "," + myRs.getString("sex"));
            }

        } catch (Exception Exc) {
            Exc.printStackTrace();
        }
    }

}//end FirstExample