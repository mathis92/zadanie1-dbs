/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.equip;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mathis
 */
public class DataHelpers {

    public static ArrayList<String> mds_service_claimant = new ArrayList<String>();
    public static ArrayList<String> mds_device = new ArrayList<String>();
    public static ArrayList<String> mds_service_order = new ArrayList<String>();

    public DataHelpers() {

    }
    
    public static void initializeVariables() {
        mds_service_claimant.add("mds_service_claimant_name");
        mds_service_claimant.add("mds_service_claimant_adress");
        mds_service_claimant.add("mds_service_claimant_city");
        mds_service_claimant.add("mds_service_claimant_country");
        mds_service_claimant.add("mds_service_claimant_email");
        mds_service_claimant.add("mds_service_claimant_phone_number");
        mds_service_claimant.add("mds_service_claimant_legal_type");
        mds_device.add("device_imei");
        mds_device.add("device_type");
        mds_device.add("mds_device_model_id_device_model");
       // mds_service_order.add("mds_service_order_registration_date");
        mds_service_order.add("mds_service_order_fault_description");
        mds_service_order.add("mds_device_id_device");
        mds_service_order.add("mds_service_claimant_id_service_claimant");
        
    }

    public static ResultSet selectFrom(String line) {
        ResultSet rs = null;
        try {

            Connection conn;

            String ConUrl = "jdbc:mysql://localhost/MobileDeviceService";
            conn = (Connection) DriverManager.getConnection(ConUrl, "root", "Pe605321101992");
            Statement stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery(line);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public static void insertInto(String line) {

        try {

            Connection conn;

            String ConUrl = "jdbc:mysql://localhost/MobileDeviceService";
            conn = (Connection) DriverManager.getConnection(ConUrl, "root", "Pe605321101992");
            Statement stmt = (Statement) conn.createStatement();
            System.out.println(line);
            stmt.executeUpdate(line);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertFromArray(ArrayList<String> arrayList, String table, ArrayList<String> collumnList) {
        String line = "INSERT INTO `" + table + "`" + "(";
        for (int i = 0; i < collumnList.size(); i++) {
            line += "`" + collumnList.get(i) + "`";
            if (i < collumnList.size() - 1) {
                line += ",";
            }

        }

        line += ")VALUES" + "('";
        Integer i = 0;
        for (String temp : arrayList) {
            line += temp;
            if (i < arrayList.size() - 1) {
                line += "','";
            }
            i++;
        }
        line += "')";

        DataHelpers.insertInto(line);
    }

}
