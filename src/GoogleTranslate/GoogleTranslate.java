/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleTranslate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author dram-
 */
public class GoogleTranslate {

    private String key;

    public GoogleTranslate(String apiKey) {
        key = apiKey;
    }

    String translte(String text, String from, String to) {
        StringBuilder result = new StringBuilder();
        try {
            String encodedText = URLEncoder.encode(text, "UTF-8");
         //   System.out.println(encodedText);
            String urlStr = "https://www.googleapis.com/language/translate/v2?key=" + key + "&q=" + encodedText + "&target=" + to + "&source=" + from;
           // System.out.println(urlStr);
            URL url = new URL(urlStr);

            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            InputStream stream;
            if (conn.getResponseCode() == 200) //success
            {
                stream = conn.getInputStream();
            } else {
                stream = conn.getErrorStream();
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            JsonParser parser = new JsonParser();

            JsonElement element = parser.parse(result.toString());

            if (element.isJsonObject()) {
                JsonObject obj = element.getAsJsonObject();
                if (obj.get("error") == null) {
                    String translatedText = obj.get("data").getAsJsonObject().
                            get("translations").getAsJsonArray().
                            get(0).getAsJsonObject().
                            get("translatedText").getAsString();
                    
                    return translatedText;

                }
            }

            if (conn.getResponseCode() != 200) {
                System.err.println(result);
            }

        } catch (IOException | JsonSyntaxException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }


    public static void main(String[] args) {

        GoogleTranslate translator = new GoogleTranslate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translte("Dream", "en", "th");
        System.out.println(text);
    }
}
