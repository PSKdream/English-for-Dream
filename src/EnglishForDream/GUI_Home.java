/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.awt.Dimension;
import java.awt.Toolkit;



 /**
 *
 * @author ptmna
 */
public class GUI_Home extends Gui_control {

   
    public GUI_Home() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        super.CustomCursor();
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
        gotoflash = new javax.swing.JButton();
        gotolistening = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        gotoaddword = new javax.swing.JButton();
        gotoworddata = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setPreferredSize(new java.awt.Dimension(1140, 709));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1150, 40));

        gotoflash.setBackground(new java.awt.Color(250, 191, 180));
        gotoflash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gotoflash.setForeground(new java.awt.Color(255, 255, 255));
        gotoflash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/btL.png"))); // NOI18N
        gotoflash.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gotoflash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoflashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoflashMouseExited(evt);
            }
        });
        gotoflash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoflashActionPerformed(evt);
            }
        });
        jPanel3.add(gotoflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 580, 280));

        gotolistening.setBackground(new java.awt.Color(250, 191, 180));
        gotolistening.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gotolistening.setForeground(new java.awt.Color(255, 255, 255));
        gotolistening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/btR.png"))); // NOI18N
        gotolistening.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gotolistening.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotolisteningMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotolisteningMouseExited(evt);
            }
        });
        gotolistening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotolisteningActionPerformed(evt);
            }
        });
        jPanel3.add(gotolistening, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 570, 280));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setForeground(new java.awt.Color(255, 153, 153));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gotoaddword.setBackground(new java.awt.Color(255,153,153));
        gotoaddword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/logatranslate.png"))); // NOI18N
        gotoaddword.setBorder(null);
        gotoaddword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoaddwordActionPerformed(evt);
            }
        });
        jPanel5.add(gotoaddword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 90, 80));

        gotoworddata.setBackground(new java.awt.Color(255,153,153));
        gotoworddata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/vocabdata.png"))); // NOI18N
        gotoworddata.setBorder(null);
        gotoworddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoworddataActionPerformed(evt);
            }
        });
        jPanel5.add(gotoworddata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fontengfordream.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/dream.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 210, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotoflashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoflashActionPerformed
       new GUI_Flashcard().setVisible(true);
        setVisible(false);        
    }//GEN-LAST:event_gotoflashActionPerformed

    private void gotolisteningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotolisteningActionPerformed
        new GUI_Listening().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_gotolisteningActionPerformed

    private void gotoaddwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoaddwordActionPerformed
        new GUI_Translate().setVisible(true);
        setVisible(false);    
    }//GEN-LAST:event_gotoaddwordActionPerformed

    private void gotoworddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoworddataActionPerformed
        new GUI_VocabData().setVisible(true);
        setVisible(false);  
    }//GEN-LAST:event_gotoworddataActionPerformed

    private void gotoflashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoflashMouseEntered
        setMouseEntered_Exited(gotoflash,"btLover");
    }//GEN-LAST:event_gotoflashMouseEntered

    private void gotoflashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoflashMouseExited
        setMouseEntered_Exited(gotoflash,"btL");
    }//GEN-LAST:event_gotoflashMouseExited

    private void gotolisteningMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotolisteningMouseEntered
       setMouseEntered_Exited(gotolistening,"btRover");
    }//GEN-LAST:event_gotolisteningMouseEntered

    private void gotolisteningMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotolisteningMouseExited
        setMouseEntered_Exited(gotolistening,"btR");
    }//GEN-LAST:event_gotolisteningMouseExited
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GUI_Home().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton gotoaddword;
    javax.swing.JButton gotoflash;
    javax.swing.JButton gotolistening;
    javax.swing.JButton gotoworddata;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
