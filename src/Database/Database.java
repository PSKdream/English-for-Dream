/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.Insert;

/**
 *
 * @author dram-
 */
public class Database {

    protected String url;
    protected Connection c = null;
    
    public Insert insert = null;
    public Select select = null;
    public Delete delete = null;
    

    public Database() {
        System.out.println("Error url is null.");
    }

    public Database(String url) {
        this.url = url;
    }

    public void connect() {
        try {
            c = DriverManager.getConnection(url);
             insert = new Insert(c);
             select = new Select(c);
             delete = new Delete(c);
            System.out.println("Connect database successfully");
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
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}
