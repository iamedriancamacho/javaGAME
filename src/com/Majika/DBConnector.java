package com.Majika;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBConnector {

    Connection con; //connect database
    PreparedStatement pst;
    //Statement st; //mo execute
    ResultSet rs; //mo receive

    public DBConnector() {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/Game", "root", "root123");
            System.out.println("You are connected to the database");
        } catch (SQLException e) {
            System.out.println("Cannot Log-in" + e);
        }
    }

    public void createCar(String insert) {

        //INSERT INTO CAR VALUES ('ABC123', 'Car', 'Toyota', 'Vios', '1');
        try {
            //con = DriverManager.getConnection("jdbc:mysql://localhost/CarRental", "root", "root123");
            pst = con.prepareStatement(insert);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error! " + e);
        }
    }

    public void updateQ(String Q) {
        try {
            pst = con.prepareStatement(Q);
            pst.executeUpdate();
            System.out.println("update complete!");
        } catch (SQLException e) {
            System.out.println("Error! " + e);
            JOptionPane.showMessageDialog(null, "Update problem. Cannot update data if its being rented by a customer ");
        }
    }
 

}
