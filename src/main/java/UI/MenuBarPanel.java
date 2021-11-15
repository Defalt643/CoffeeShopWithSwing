/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Customer;
import Model.OrderUI;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MenuBarPanel extends javax.swing.JPanel {

    private final MainPanel mainPanel;
    public ArrayList<OrderUI> countedOrder;
    public double grandTotal;
    public double total;
    public double cash;
    public double discount;
    public Customer customer;
    public double vat;
    public double change;
    public String username;

    /**
     * Creates new form MenuBarPanel
     */
    public MenuBarPanel(MainPanel mainPanel) {
        initComponents();
        this.mainPanel = mainPanel;
        currentUserName.setText(mainPanel.currentUser.getName());
        currentUserRole.setText(mainPanel.currentUser.getRole());
        username = mainPanel.currentUser.getName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentUserContainer = new javax.swing.JPanel();
        btnOut = new javax.swing.JButton();
        currentUserName = new javax.swing.JLabel();
        currentUserRole = new javax.swing.JLabel();
        containerScroll = new javax.swing.JScrollPane();
        btnSell = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnInOut = new javax.swing.JButton();
        btnCheckStock = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(930, 600));

        currentUserContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOut.setText("Logout");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        currentUserName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        currentUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentUserName.setText("name");

        currentUserRole.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        currentUserRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentUserRole.setText("Role");
        currentUserRole.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout currentUserContainerLayout = new javax.swing.GroupLayout(currentUserContainer);
        currentUserContainer.setLayout(currentUserContainerLayout);
        currentUserContainerLayout.setHorizontalGroup(
            currentUserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentUserContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentUserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentUserRole, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOut)
                .addContainerGap())
        );
        currentUserContainerLayout.setVerticalGroup(
            currentUserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentUserContainerLayout.createSequentialGroup()
                .addGroup(currentUserContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(currentUserContainerLayout.createSequentialGroup()
                        .addComponent(currentUserRole)
                        .addGap(1, 1, 1)
                        .addComponent(currentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        containerScroll.setMinimumSize(new java.awt.Dimension(910, 510));
        containerScroll.setPreferredSize(new java.awt.Dimension(910, 510));

        btnSell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSell.setText("Point of Sell");
        btnSell.setMaximumSize(new java.awt.Dimension(107, 52));
        btnSell.setMinimumSize(new java.awt.Dimension(107, 52));
        btnSell.setPreferredSize(new java.awt.Dimension(107, 52));
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        btnManageUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnManageUser.setText("Manage User");
        btnManageUser.setMaximumSize(new java.awt.Dimension(107, 52));
        btnManageUser.setMinimumSize(new java.awt.Dimension(107, 52));
        btnManageUser.setPreferredSize(new java.awt.Dimension(107, 52));
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        btnStock.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnStock.setText("Manage Stock");
        btnStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStock.setMaximumSize(new java.awt.Dimension(107, 52));
        btnStock.setMinimumSize(new java.awt.Dimension(107, 52));
        btnStock.setPreferredSize(new java.awt.Dimension(107, 52));
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnInOut.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnInOut.setText("In-Out Time");
        btnInOut.setMaximumSize(new java.awt.Dimension(107, 52));
        btnInOut.setMinimumSize(new java.awt.Dimension(107, 52));
        btnInOut.setPreferredSize(new java.awt.Dimension(107, 52));
        btnInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOutActionPerformed(evt);
            }
        });

        btnCheckStock.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCheckStock.setText("CheckStock");
        btnCheckStock.setMaximumSize(new java.awt.Dimension(107, 52));
        btnCheckStock.setMinimumSize(new java.awt.Dimension(107, 52));
        btnCheckStock.setPreferredSize(new java.awt.Dimension(107, 52));
        btnCheckStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStockActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setMaximumSize(new java.awt.Dimension(107, 52));
        btnCustomer.setMinimumSize(new java.awt.Dimension(107, 52));
        btnCustomer.setPreferredSize(new java.awt.Dimension(107, 52));
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(containerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheckStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentUserContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentUserContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnInOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(containerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        mainPanel.logout();
        currentUserName.setText("Name");
        currentUserRole.setText("Role");
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        containerScroll.setViewportView(new ManageManagerPanel());
        enableAllBtn();
        btnManageUser.setEnabled(false);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        containerScroll.setViewportView(new MenuPanel(this));
        enableAllBtn();
        btnSell.setEnabled(false);
    }//GEN-LAST:event_btnSellActionPerformed
    public void switchToReceipt() {
        containerScroll.setViewportView(new ReceiptPanel(this));
    }

    public void switchToPointOfSell() {
        containerScroll.setViewportView(new MenuPanel(this));
        enableAllBtn();
        btnSell.setEnabled(false);
    }
    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        containerScroll.setViewportView(new CheckStockPanel());
        enableAllBtn();
        btnStock.setEnabled(false);
    }//GEN-LAST:event_btnStockActionPerformed
    public void setReceiptDetail(ArrayList<OrderUI> countedOrder, double total, double grandTotal, double cash, double discount, double vat, double change, Customer customer) {
        this.countedOrder = countedOrder;
        this.total = total;
        this.grandTotal = grandTotal;
        this.cash = cash;
        this.discount = discount;
        this.vat = vat;
        this.customer = customer;
        this.change = change;
    }
    private void btnInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOutActionPerformed
        containerScroll.setViewportView(new TimeinAndTimeoutPanel());
        enableAllBtn();
        btnInOut.setEnabled(false);
    }//GEN-LAST:event_btnInOutActionPerformed

    private void btnCheckStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStockActionPerformed
        containerScroll.setViewportView(new ManageCheckStock());
        enableAllBtn();
        btnInOut.setEnabled(false);
    }//GEN-LAST:event_btnCheckStockActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        containerScroll.setViewportView(new ManageCustomer());
        enableAllBtn();
        btnInOut.setEnabled(false);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void enableAllBtn() {
        btnSell.setEnabled(true);
        btnManageUser.setEnabled(true);
        btnStock.setEnabled(true);
        btnInOut.setEnabled(true);
        btnCheckStock.setEnabled(true);
        btnCustomer.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckStock;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnInOut;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnStock;
    private javax.swing.JScrollPane containerScroll;
    private javax.swing.JPanel currentUserContainer;
    private javax.swing.JLabel currentUserName;
    private javax.swing.JLabel currentUserRole;
    // End of variables declaration//GEN-END:variables
}
