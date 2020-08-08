/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import Database.Database;
import TranslateTTS.TextToSpeech;
import TranslateTTS.Translate;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author dram-
 */
class Gui_control extends javax.swing.JFrame implements GUI_Interface {
    protected Database db = new Database("jdbc:sqlite:data.db");
    protected TextToSpeech tts = new TextToSpeech();
    protected Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
    
    @Override
    public void CustomCursor(){
         Toolkit tool = Toolkit.getDefaultToolkit();
         Image img = tool.getImage("src/EnglishForDream/cursor.png");
         Point point = new Point(0,0);
         Cursor cursor = tool.createCustomCursor(img, point, "src/EnglishForDream/cursor.png");
         setCursor(cursor);
    }
    @Override
    public void setMouseEntered_Exited(JButton a,String Imagefile){
        ImageIcon icon = new ImageIcon("src/EnglishForDream/"+Imagefile+".png");
        a.setIcon(icon);
    }
}
