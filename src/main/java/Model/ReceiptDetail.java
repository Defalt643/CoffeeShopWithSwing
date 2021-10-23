/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Xenon
 */
public class ReceiptDetail {
    private int id;
    private int receiptId;
    private int productId;
    private double price;
    private int amount;

    public ReceiptDetail(int id, int receiptId, int productId, double price, int amount) {
        this.id = id;
        this.receiptId = receiptId;
        this.productId = productId;
        this.price = price;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ReceiptDetail{" + "id=" + id + ", receiptId=" + receiptId + ", productId=" + productId + ", price=" + price + ", amount=" + amount + '}';
    }
    
}
