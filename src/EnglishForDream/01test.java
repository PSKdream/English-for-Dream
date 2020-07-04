/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

/**
 *
 * @author dram-
 */
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.table.TableModel;

import javax.swing.table.DefaultTableModel;

import javax.swing.table.*;

class ButtonInJTable extends JFrame {

    private JPanel topPanel, topPanel1;
    private JTable table;
    private JScrollPane scrollPane, scrollPane1;
    private String[] columnNames = new String[3];
    private String[][] dataValues = new String[3][3];
    JButton button = new JButton();

    public ButtonInJTable() {
        setTitle("Button in JTable Cell");
        setSize(300, 300);
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columnNames = new String[]{"Column 1", "Column 2", "Column 3"};
        dataValues = new String[][]{
            {"1", "2",},
            {"4", "5",},
            {"7", "8",}
        };
        TableModel model = new myTableModel("owntable");
        table = new JTable();
        table.setModel(model);
        table.getColumn("Column 3").setCellRenderer(new ButtonRenderer());
        table.getColumn("Column 3").setCellEditor(new ButtonEditor(new JCheckBox()));
        scrollPane = new JScrollPane(table);
        topPanel.add(scrollPane, BorderLayout.CENTER);
        button.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null,
                        "Button Clicked in JTable Cell");
            }
        }
        );
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString()
            );
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        private String label;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            return button;
        }

        public Object getCellEditorValue() {
            return new String(label);
        }
    }

    public class myTableModel extends DefaultTableModel {

        String dat;
        JButton button = new JButton("");

        myTableModel(String tname) {
            super(dataValues, columnNames);
            dat = tname;
        }

        public boolean isCellEditable(int row, int cols) {
            if (dat == "owntable ") {
                if (cols == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String args[]) {
        ButtonInJTable mainFrame = new ButtonInJTable();
        mainFrame.setVisible(true);
    }

}
