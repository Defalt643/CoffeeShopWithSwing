/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bunny0_
 */
public class Customer {
    private int id;
    private String name;
    private String tel;
    private int purchase_amount;
    
    public Customer(int id, String name, String tel, int purchase_amount){
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.purchase_amount = purchase_amount;
    }
    public Customer(String name, String tel){
        this(-1,name,tel,0);
    }
    

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", tel=" + tel + ", purchase_amount=" + purchase_amount + '}';
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPurchase_amount() {
        return purchase_amount;
    }

    public void setPurchase_amount(int purchase_amount) {
        this.purchase_amount = purchase_amount;
    }
    
}
