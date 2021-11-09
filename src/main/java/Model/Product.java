/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ming
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private String image;

    public Product(int id, String name, double price, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
//    public static ArrayList<Product> testProductList() {
//        ArrayList<Product> list = new ArrayList<>();
//        list.add(new Product(1, "Espresso", 45));
//        list.add(new Product(2, "Mocha", 45));
//        list.add(new Product(3, "Latte", 50));
//        list.add(new Product(4, "Muchiatto", 50));
//        list.add(new Product(5, "Hot milk", 30));
//        list.add(new Product(6, "Caramel milk", 40));
//        list.add(new Product(7, "Honey milktea", 35));
//        list.add(new Product(8, "Iced Tea", 30));
//        list.add(new Product(9, "Thai cold Tea", 30));
//        return list;
//    }
}
