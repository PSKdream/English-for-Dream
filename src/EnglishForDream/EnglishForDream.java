/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.sql.*;

/**
 *
 * @author dram-
 */
public class EnglishForDream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database();
      //  db.createTable();
       //db.insertData("Cat","แมว");
       // System.out.println("--------------------");
        db.selectData("vocab");
    }

}
