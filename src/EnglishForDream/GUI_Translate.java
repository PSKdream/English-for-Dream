/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import Database.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import TranslateTTS.*;

/**
 *
 * @author ptmna
 */
public class GUI_Translate extends javax.swing.JFrame {

    public GUI_Translate() {

        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addTextToData = new javax.swing.JButton();
        texttospeech = new javax.swing.JButton();
        translate1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wordField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        translatedArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTextToData.setBackground(new java.awt.Color(255,153,153));
        addTextToData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/save.png"))); // NOI18N
        addTextToData.setBorder(null);
        addTextToData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTextToDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addTextToDataMouseExited(evt);
            }
        });
        addTextToData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTextToDataActionPerformed(evt);
            }
        });
        jPanel2.add(addTextToData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 160));

        texttospeech.setBackground(new java.awt.Color(255,153,153));
        texttospeech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/speechbt.png"))); // NOI18N
        texttospeech.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        texttospeech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                texttospeechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                texttospeechMouseExited(evt);
            }
        });
        texttospeech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttospeechActionPerformed(evt);
            }
        });
        jPanel2.add(texttospeech, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 190, 160));

        translate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/bttran.png"))); // NOI18N
        translate1.setBorder(null);
        translate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translate1ActionPerformed(evt);
            }
        });
        jPanel2.add(translate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 190, 160));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1150, 230));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setForeground(new java.awt.Color(255, 153, 153));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255,153,153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/arLeft.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel5.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fonttranslate.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 330, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        wordField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        wordField.setForeground(new java.awt.Color(102, 51, 0));
        wordField.setToolTipText("");
        wordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 39, 0), 7, true));
        wordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(wordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 430, 70));

        translatedArea.setEditable(false);
        translatedArea.setBackground(new java.awt.Color(255, 255, 204));
        translatedArea.setColumns(20);
        translatedArea.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        translatedArea.setForeground(new java.awt.Color(52, 14, 14));
        translatedArea.setLineWrap(true);
        translatedArea.setRows(5);
        translatedArea.setBorder(null);
        jScrollPane1.setViewportView(translatedArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 620, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texttospeechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texttospeechMouseEntered
        setMouseEntered_Exited(texttospeech, "speechover");
    }//GEN-LAST:event_texttospeechMouseEntered

    private void texttospeechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texttospeechMouseExited
        setMouseEntered_Exited(texttospeech, "speechbt");
    }//GEN-LAST:event_texttospeechMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new GUI_Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void texttospeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttospeechActionPerformed
        TextToSpeech tts = new TextToSpeech();
        tts.speak(this.wordField.getText());
    }//GEN-LAST:event_texttospeechActionPerformed

    private void wordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordFieldActionPerformed

    private void addTextToDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTextToDataActionPerformed
        Database db = new Database("jdbc:sqlite:data.db");
        Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        db.connect();
        db.insert.insertData(this.wordField.getText(), translator.translate(this.wordField.getText(), "en", "th"));
        db.close();
        this.translate1ActionPerformed(null);
    }//GEN-LAST:event_addTextToDataActionPerformed

    private void translate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translate1ActionPerformed

        Translate translator = new Translate("AIzaSyBmbhyWZW_ywsIDuHEyKvfn1dillOn1hz4");
        String text = translator.translate(this.wordField.getText(), "en", "th");
        System.out.println(text);
        this.translatedArea.setText(text);

    }//GEN-LAST:event_translate1ActionPerformed

    private void addTextToDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTextToDataMouseEntered
      setMouseEntered_Exited(addTextToData, "savemouseover");
    }//GEN-LAST:event_addTextToDataMouseEntered

    private void addTextToDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTextToDataMouseExited
       setMouseEntered_Exited(addTextToData, "save");
    }//GEN-LAST:event_addTextToDataMouseExited
    public void setMouseEntered_Exited(JButton a, String Imagefile) {
        ImageIcon icon = new ImageIcon("src/EnglishForDream/" + Imagefile + ".png");
        a.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTextToData;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton texttospeech;
    private javax.swing.JButton translate1;
    private javax.swing.JTextArea translatedArea;
    private javax.swing.JTextField wordField;
    // End of variables declaration//GEN-END:variables
}