/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikoluna1;

import java.sql.*;

/**
 *
 * @author Larry
 */
public class JDBC {

    public static void main(String args[]) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pikolunadb", "root", "csc340");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from pikolunatable");
            while (myRs.next()) {
                System.out.println(myRs.getInt("LaptopID") + " " + myRs.getString("Name") + " " + myRs.getInt("RAM") + " " + myRs.getInt("DisplaySize"));
            }

        } catch (Exception Exc) {
            Exc.printStackTrace();
            
        }
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pikolunadb", "root", "csc340");
            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate("TRUNCATE TABLE clonepikoluna;");
            myStmt.executeUpdate("INSERT INTO clonepikoluna SELECT * FROM pikolunatable;");
            ResultSet myRs = myStmt.executeQuery("select * from clonepikoluna");
            while (myRs.next()) {
                System.out.println(myRs.getInt("LaptopID") + " " + myRs.getString("Name") + " " + myRs.getInt("RAM") + " " + myRs.getInt("DisplaySize"));
            }

        } catch (Exception Exc) {
            Exc.printStackTrace();
    }

}
}
