/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author dram-
 */
public class EnglishForDream {

    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
        ArrayList <Object> data = db.selectData();
        db.close();
    }

}
