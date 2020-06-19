/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

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

    private String url;// = "jdbc:sqlite:data.db";
    protected Connection c = null;
    
    public Database(){
        System.out.println("Error url is null.");
    }
    public Database(String url){
        this.url = url; 
    }
    public void connect() {
        try {
            c = DriverManager.getConnection(url);
            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            c.close();
            System.out.println("Close database successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTable() {
        Statement stmt = null;

        try {
            stmt = c.createStatement();
           String sql = "CREATE TABLE DATA "
                    + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " vocab           TEXT    NOT NULL UNIQUE, "
                    + " meaning         TEXT    NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            // c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    } 
}
