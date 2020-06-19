/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import Database.Execute;
import java.sql.*;
import java.util.ArrayList;
import Database.Select;
import tts.TextToSpeech;
/**
 *
 * @author dram-
 */
public class EnglishForDream {

    public static void main(String[] args) {
        Select sc = new Select();
        sc.connect();
        sc.getRow("ID","1");
        sc.close();
     
       
    }
    

}
