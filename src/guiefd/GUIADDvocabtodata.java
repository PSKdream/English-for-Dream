/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiefd;


 /**
 *
 * @author ptmna
 */
public class GUIADDvocabtodata extends javax.swing.JFrame {

   
    public GUIADDvocabtodata() {
     
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255,153,153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiefd/next.png"))); // NOI18N
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 110, 90));

        jButton7.setText("translate");
        jButton7.setBorder(null);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 140, 80));

        jButton6.setText("speech");
        jButton6.setBorder(null);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 140, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 4, 4));
        jLabel1.setText("Answer");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 410, 120));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1150, 330));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setForeground(new java.awt.Color(255, 153, 153));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255,153,153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiefd/arLeft.png"))); // NOI18N
        jButton4.setBorder(null);
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        jTextField1.setBackground(new java.awt.Color(224, 189, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 51, 0));
        jTextField1.setText("Answer");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 39, 0), 7, true));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 430, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GUIADDvocabtodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
