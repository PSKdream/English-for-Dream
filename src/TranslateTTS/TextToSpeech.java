
package TranslateTTS;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
    private String VoiceName ;// "kevin";
    
    public void speak(String word,String name){
        this.VoiceName = name;
        Voice voice = VoiceManager.getInstance().getVoice(VoiceName);
        voice.allocate();
        try{
            voice.speak(word);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}
