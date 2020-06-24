package EnglishForDream;


import Database.Database;
import java.util.ArrayList;


public class EnglishForDream extends Translate{

    public static void main(String[] args) {
        
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        db.select.getTable();
        db.close();
        
        //TextToSpeech tts = new TextToSpeech();
        //tts.speak("My name is Dream");
        /*Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translate("My name is Dream", "en", "th");
        System.out.println(text);*/
    }

}
