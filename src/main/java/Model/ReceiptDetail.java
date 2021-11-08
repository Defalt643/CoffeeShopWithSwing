/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

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
    private Product product;
    private Receipt receipt;

    public ReceiptDetail(int id, Product product, int amount, double price, Receipt receipt) {
        this.id = id;
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.receipt = receipt;
    }public ReceiptDetail(Product product,int amount, double price,Receipt receipt){
        this(-1, product, amount, price, receipt);
    }

   public double getTotal() {
        return amount * price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    public void addAmount(int amount){
        this.amount = this.amount+amount;
    }

    @Override
    public String toString() {
        return "ReceiptDetail{" + "id=" + id 
                + ", product=" + product 
                + ", amount=" + amount 
                + ", price=" + price 
                + ", total=" + this.getTotal()
                +'}';
    }
    
     public static ArrayList<ReceiptDetail> testReceiptDetail() {
        ArrayList<ReceiptDetail> list = new ArrayList<>();
        Product p1 = new Product(1, "Espresso", 45);
        Product p2 = new Product(2, "Mocha", 45);
        Product p3 = new Product(3, "Latte", 50);
        User seller = new User(1,"winwin","0888888888","Employee","password1","user1");
        Customer customer = new Customer(1,"Somsri","0801111111",0);
        Receipt testReceipt = new Receipt(seller, customer);
        list.add(new ReceiptDetail(1, p1, 1, p1.getPrice(), testReceipt));
        list.add(new ReceiptDetail(2, p2, 1, p2.getPrice(), testReceipt));
        list.add(new ReceiptDetail(3, p3, 1, p3.getPrice(), testReceipt));
        return list;
    }
    
}
