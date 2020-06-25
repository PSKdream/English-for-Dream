
package TranslateTTS;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
    private static String VoiceName = "kevin16";
    
    public void speak(String word){
        Voice voice = VoiceManager.getInstance().getVoice(VoiceName);
        voice.allocate();
        try{
            voice.speak(word);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}
