/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mmathis.stubaequip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathis
 */
public class DatabaseConnector {

    public DatabaseConnector() {
    }

    public void connect() {
        try {

            Connection conn;

            ResultSet rs;
            String ConUrl = "jdbc:mysql://localhost/MobileDeviceService";
            conn = (Connection) DriverManager.getConnection(ConUrl, "root", "Pe605321101992");
            Statement stmt = (Statement) conn.createStatement();
            stmt.executeUpdate("INSERT INTO `mds_device_vendor` (`mds_device_vendor_name`) VALUES ('NOKIA')");

            rs = stmt.executeQuery("SELECT * FROM `mds_device_vendor`");

            while (rs.next()) {
                System.out.println(rs.getString("mds_device_vendor_name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
