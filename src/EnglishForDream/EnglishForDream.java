package EnglishForDream;

import Database.DatabaseFunction;
import Database.Insert;
import java.sql.*;
import java.util.ArrayList;
import Database.Select;

public class EnglishForDream extends Translate{

    public static void main(String[] args) {
        Select sc = new Select("jdbc:sqlite:data.db");
       // sc.
       /* sc.connect();
       // sc.insertData("sasa", "dsas");
        sc.close();
        /*TextToSpeech tts = new TextToSpeech();
        tts.speak("My name is Dream");
        
        Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translate("My name is Dream", "en", "th");
        System.out.println(text);*/
        
    }

}
