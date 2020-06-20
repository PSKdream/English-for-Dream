package EnglishForDream;

import Database.Database;
import java.sql.*;
import java.util.ArrayList;
import Database.Select;

public class EnglishForDream extends Translate{

    public static void main(String[] args) {
        Database sc = new Select("jdbc:sqlite:data.db");
        sc.connect();
        //sc.getTable();
        //sc.getRow("ID","1");
        sc.close();
        /*TextToSpeech tts = new TextToSpeech();
        tts.speak("My name is Dream");
        
        Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translte("My name is Dream", "en", "th");
        System.out.println(text);*/
        
    }

}
