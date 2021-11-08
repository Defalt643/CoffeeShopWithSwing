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
public class OrderUI {

    private Product product;
    private int amount;
    private double price;

    public OrderUI(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.price = product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void addAmount() {
        amount++;
    }

    public void decreaseAmount() {
        amount--;
    }

    public double getPrice() {
        return price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderUI{" + "product=" + product + ", amount=" + amount + ", price=" + price + '}';
    }

}
