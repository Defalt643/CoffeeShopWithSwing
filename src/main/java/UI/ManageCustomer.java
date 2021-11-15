/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.CustomerDAO;
import Model.Customer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ManageCustomer extends javax.swing.JPanel {

    CustomerDAO customer = new CustomerDAO();
    private int index = -1;

    /**
     * Creates new form ManageManagerPanel
     */
    public ManageCustomer() {
        initComponents();
        checkAllUser();
        disableUI();
    }

    public void disableUI() {

        inputName.setEnabled(false);
        inputTel.setEnabled(false);

    }

    private void enableUI() {

        inputName.setEnabled(true);
        inputTel.setEnabled(true);

    }

    private void clearTextField() {

        inputName.setText("");

        inputTel.setText("");

    }

    public void checkAllUser() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < customer.getAll().size(); i++) {
            model.addRow(new Object[]{customer.getAll().get(i).getId(), customer.getAll().get(i).getName(), customer.getAll().get(i).getTel()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        textTel = new javax.swing.JLabel();
        inputTel = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));

        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentShown(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Tel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jTextField1.setColumns(2);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Find ID Customer :");

        textName.setText("Name:");

        textTel.setText("Tel:");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(editButton)
                    .addComponent(cancelButton)
                    .addComponent(textTel))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int TextToInt = Integer.parseInt(jTextField1.getText());
        for (int i = 0; i < customer.getAll().size(); i++) {
            if (TextToInt == customer.getAll().get(i).getId()) {
                jLabel1.setText("ID : " + customer.getAll().get(i).getId() + " Name : " + customer.getAll().get(i).getName() + " Tel : " + customer.getAll().get(i).getTel());
            }
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        index = userTable.getSelectedRow();
        if (index == -1) {
            int reply = JOptionPane.showConfirmDialog(null, "please select Row Edit ", "Edit ", JOptionPane.DEFAULT_OPTION);
            return;
        } else if (index > -1) {
            enableUI();
            ArrayList<Customer> user = this.customer.getAll();
            inputName.setText(customer.get(index).getName());
            inputTel.setText(String.valueOf(customer.get(index).getTel()));

        } else {
            System.out.println("Can't Edit");
        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearTextField();
        disableUI();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        CustomerDAO customer = new CustomerDAO();
        if(index == -1){
            customer.add(new Customer(inputName.getText(),inputTel.getText()));
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        enableUI();

    }//GEN-LAST:event_newButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        CustomerDAO user = new CustomerDAO();
        index = userTable.getSelectedRow();
        if (index == -1) {
            int reply = JOptionPane.showConfirmDialog(null, "please select Row Edit ", "Edit ", JOptionPane.DEFAULT_OPTION);
            return;
        } else {
            user.delete(index + 1);
        }
        checkAllUser();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jScrollPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputTel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textTel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
