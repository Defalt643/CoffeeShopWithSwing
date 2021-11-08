/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Product;
import java.util.ArrayList;

/**
 *
 * @author Xenon
 */
public class ProductPanel extends javax.swing.JPanel {

    private final Product product;

    /**
     * Creates new form ProductPanel
     */
    ProductPanel(Product product) {
        initComponents();
        this.product = product;
        setProductData(product);
    }

    public void setProductData(Product product) {
        lblName.setText(product.getName());
        lblPrice.setText("" + product.getPrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImg = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(165, 200));
        setMinimumSize(new java.awt.Dimension(165, 180));
        setPreferredSize(new java.awt.Dimension(165, 200));

        btnImg.setText("Img");
        btnImg.setMaximumSize(new java.awt.Dimension(145, 145));
        btnImg.setMinimumSize(new java.awt.Dimension(145, 145));
        btnImg.setPreferredSize(new java.awt.Dimension(145, 145));
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        lblName.setMaximumSize(new java.awt.Dimension(100, 20));
        lblName.setMinimumSize(new java.awt.Dimension(100, 20));
        lblName.setPreferredSize(new java.awt.Dimension(100, 20));

        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("0.0");
        lblPrice.setMaximumSize(new java.awt.Dimension(45, 20));
        lblPrice.setMinimumSize(new java.awt.Dimension(45, 20));
        lblPrice.setPreferredSize(new java.awt.Dimension(45, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        System.out.println("Product Panel: " + product );
        selectedOrders.add(product);
        System.out.println(selectedOrders);
    }//GEN-LAST:event_btnImgActionPerformed


    ArrayList<Product> selectedOrders = new ArrayList<>();
    ArrayList<Product> countedOrders = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables
}
