/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author dram-
 */
public class Database {

    /*public Connection connect() {
        Connection c = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:data.db";
            c = DriverManager.getConnection(url);
            System.out.println("Opened database successfully");
          //  System.out.println(c);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return c;
    }*/
    
    public void connect() {
        Connection c = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:data.db";
            c = DriverManager.getConnection(url);
            System.out.println("Opened database successfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                System.out.println(c);
                if (c != null) {
                    c.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void createTable() {
        Connection c = null;
        Statement stmt = null;

        try {
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE DATA "
                    + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " vocab           TEXT    NOT NULL UNIQUE, "
                    + " meaning         TEXT    NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public void insertData(String vocab, String meaning) {
        Connection c = null;
        Statement stmt = null;

        try {
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO DATA(vocab,meaning)"
                    + "VALUES ('" + vocab + "','" + meaning + "')";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.hashCode());
            if (e.hashCode() == 214126413) {
                System.out.println("คำศัพท์ซ้ำ");
            }
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public ArrayList selectData() {
        ArrayList< ArrayList<Object>> data = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DATA;");
            while (rs.next()) {
                ArrayList<Object> dataReturn = new ArrayList();
                int id = rs.getInt("ID");
                String name = rs.getString("vocab");
                String meaning = rs.getString("meaning");

                dataReturn.add(id);
                dataReturn.add(name);
                dataReturn.add(meaning);
                data.add(dataReturn);
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println(data);
        System.out.println("Operation done successfully");
        return data;
    }

    public ArrayList selectData(String select) {
        ArrayList<Object> data = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(ID) FROM DATA;");
            rs = stmt.executeQuery("SELECT " + select + " FROM DATA;");
            while (rs.next()) {
                ArrayList<Object> dataReturn = new ArrayList();
                String name = rs.getString(1);
                data.add(name);
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            if (e.hashCode() == 1880587981) {
                System.out.println("ไม่มี column นี้ใน db");
            }
            System.exit(0);
        }
        System.out.println(data);
        System.out.println("Operation done successfully");
        return data;
    }

}
