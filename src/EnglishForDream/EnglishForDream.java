/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import Database.Database;
import java.sql.*;
import java.util.ArrayList;
import Database.Select;
/**
 *
 * @author dram-
 */
public class EnglishForDream {

    public static void main(String[] args) {
        Select sc = new Select();
        //sc.connect();
        sc.getTable();
        /*sc.getRow("ID","1");
        sc.close();
        TextToSpeech tts = new TextToSpeech();
        tts.speak("My name is Dream");
        
        GoogleTranslate translator = new GoogleTranslate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translte("My name is Dream", "en", "th");
        System.out.println(text);*/
        
    }

}
