/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;




 /**
 *
 * @author ptmna
 */
public class GUIflashcard extends javax.swing.JFrame {

   
    public GUIflashcard() {
   
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
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
        checkflash = new javax.swing.JButton();
        speechflash = new javax.swing.JButton();
        answer = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        keyword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkflash.setBackground(new java.awt.Color(255,153,153));
        checkflash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/checkfbt.png"))); // NOI18N
        checkflash.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(checkflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 190, 160));

        speechflash.setBackground(new java.awt.Color(255,153,153));
        speechflash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/speechbt.png"))); // NOI18N
        speechflash.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        speechflash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                speechflashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                speechflashMouseExited(evt);
            }
        });
        speechflash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speechflashActionPerformed(evt);
            }
        });
        jPanel2.add(speechflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 190, 160));

        answer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        answer.setForeground(new java.awt.Color(102, 51, 0));
        answer.setText("Answer");
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 39, 0), 7, true));
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 500, 70));

        next.setBackground(new java.awt.Color(255,153,153));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/next.png"))); // NOI18N
        next.setBorder(null);
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 110, 90));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1150, 340));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fontflashcard.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        keyword.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        keyword.setForeground(new java.awt.Color(102, 51, 0));
        keyword.setText("Resistor");
        jPanel3.add(keyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 420, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/bearface.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/paw.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/thunder.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 200, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ImageIcon icon;
    private void speechflashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechflashMouseEntered
       
    }//GEN-LAST:event_speechflashMouseEntered

    private void speechflashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechflashMouseExited
    
    }//GEN-LAST:event_speechflashMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new GUIEpg().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void speechflashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speechflashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speechflashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton back;
    private javax.swing.JButton checkflash;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel keyword;
    private javax.swing.JButton next;
    private javax.swing.JButton speechflash;
    // End of variables declaration//GEN-END:variables
}
