/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.ObservableList;

/**
 *
 * @author DELL
 */
public class Connect {

    ResultSet rs = null;

    public Connect() {

    }

    public static Connect getInstance() {
        return new Connect();
    }

    public Connection getConnect() throws SQLException {
        Connection con = null;
        String url = "jdbc:sqlite:C:/Users/abdul/Documents/NetBeansProjects/BloodBank/Database/BloodBanks.db";

        con = DriverManager.getConnection(url);
        System.out.println("Conncetion Established");
        return con;
    }


    public void newDonor(String FirstName, String LastName, String Email, int phone, String BloodType, String username, String password) throws SQLException {
        String sql = "INSERT INTO Donor(FirstName,LastName,Email,Phone,BloodType,Username,Password) VALUES('" + FirstName + "','" + LastName + "','" + Email + "','" + phone + "','" + BloodType + "','" + username + "','" + password + "')";
        Connection con = this.getConnect();
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        st.close();
        con.close();
        System.out.println("The donor added");
    }

    public void newDontion(String FirstName, String LastName, String BloodType, int phone) throws SQLException {
        String sql = "INSERT INTO Donation(FirstName,LastName,BloodType,Phone) VALUES('" + FirstName + "','" + LastName + "','" + BloodType + "','" + phone + "')";
        Connection con = this.getConnect();
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        st.close();
        con.close();
        System.out.println("The dontion added");
    }
}
