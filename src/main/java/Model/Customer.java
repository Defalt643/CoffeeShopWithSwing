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
    private int purchaseAmount;
    
    public Customer(int id, String name, String tel, int purchaseAmount){
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.purchaseAmount = purchaseAmount;
    }
    public Customer(String name, String tel,int purchaseAmount){
        this(-1,name,tel,purchaseAmount);
    }public Customer(String name,String tel){
        this(-1,name,tel,0);
    }
    

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", tel=" + tel 
                + ", purchase_amount=" + purchaseAmount + '}';
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
        return purchaseAmount;
    }

    public void setPurchase_amount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    
}
