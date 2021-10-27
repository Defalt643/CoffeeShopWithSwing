/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.ReceiptDAO;
import Model.Customer;
import Model.Product;
import Model.Receipt;
import Model.User;

/**
 *
 * @author Bunny0_
 */
public class TestReceipt {
    public static void main(String[] args) {
        //AddProduct2price
        Product p1 = new Product(1,"hot cocoa",55.0);
        Product p2 = new Product(2,"hot mocha",60.0);
        //NewSellerUser
        User seller = new User("winwin","0888888888"
                ,"Employee","password1","user1");
        //NewCustomer
        Customer customer = new Customer("Somsri","0801111111");
        //NewReceipt
        Receipt receipt = new Receipt(seller, customer);
        receipt.addReceiptDetail(p1, 1);
        receipt.addReceiptDetail(p2, 3);
        System.out.println("receipt : "+receipt);
        receipt.deleteReceiptDetail(0);
        System.out.println("receipt : "+receipt);
        receipt.addReceiptDetail(p1,2);
        System.out.println("receipt : "+receipt); 
        receipt.addReceiptDetail(p1,2);
        System.out.println("receipt : "+receipt);
        //NewReceiptDAO
        ReceiptDAO rec = new ReceiptDAO();
        rec.add(receipt);
        System.out.println("id = : "+rec);
        //ReceiptUpdate
        receipt.addReceiptDetail(p1,10);
        rec.update(receipt);
        System.out.println("Update :" + rec);
        //ReceiptGetAll
        System.out.println("Get : " );
        rec.getAll();
        System.out.println("Get : "+ rec.get(1));    
        //ReceiptDelete
        rec.delete(1);
        System.out.println("Delete : "+rec );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}