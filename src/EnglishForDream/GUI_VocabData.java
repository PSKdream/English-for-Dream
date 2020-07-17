
package EnglishForDream;

import Database.Database;
import TranslateTTS.TextToSpeech;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ptmna
 */
public class GUI_VocabData extends Gui_control {

    private ArrayList<ArrayList<Object>> data = new ArrayList();

    public GUI_VocabData() {

        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        this.data = db.select.getTable(); //retrun ArrayList type Object
        db.close();

        DefaultTableModel model = (DefaultTableModel) this.tableData.getModel();
        for (int i = 0; i < this.data.size(); i++) {
            model.addRow(new Object[0]);
            model.setValueAt(this.data.get(i).get(1), i, 0);
            model.setValueAt(this.data.get(i).get(2), i, 1);
        }
        super.CustomCursor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1150, 60));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fontvocabu.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 380, 80));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        tableData.setBackground(new java.awt.Color(225,205,158));
        tableData.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vocab", "Meaning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setAlignmentX(0.0F);
        tableData.setAlignmentY(0.0F);
        tableData.setGridColor(new java.awt.Color(255, 255, 255));
        tableData.setRowHeight(30);
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(tableData);

        jPanel3.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 890, 580));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/trash.png"))); // NOI18N
        Delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 110, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CustomCursor();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new GUI_Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        if (evt.getClickCount() == 2) {
            // JTable target = new JTable();
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow(); // select a row
            TextToSpeech tts = new TextToSpeech();
            tts.speak((String) this.tableData.getValueAt(row, 0));
        }
    }//GEN-LAST:event_tableDataMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        int count = this.tableData.getSelectedRows().length;
        System.out.println(this.tableData.getSelectedRows());
        for (int i = 0; i < count; i++) {
            String text = (String) this.tableData.getValueAt(this.tableData.getSelectedRows()[i], 0);
            System.out.println(text);
            db.delete.delete(text);
        }
        for (int i = count - 1; i >= 0; i--) {
            ((DefaultTableModel) this.tableData.getModel()).removeRow(this.tableData.getSelectedRows()[i]);
        }
        db.close();
    }//GEN-LAST:event_DeleteActionPerformed

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        setMouseEntered_Exited(Delete,"trashmouseover");
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
         setMouseEntered_Exited(Delete,"trash");
    }//GEN-LAST:event_DeleteMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
