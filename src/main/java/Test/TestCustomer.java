/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.CustomerDAO;
import Model.Customer;

/**
 *
 * @author Bunny0_
 */
public class TestCustomer {
    public static void main(String[] args) {
        CustomerDAO cus = new CustomerDAO();
        //TestgetAllCustomer
        System.out.println(cus.getAll());
        //TestInsertCustomer
        int id = cus.add(new Customer(-1,"Somsri","0801111111",0));
        System.out.println("id : "+id);
        //TestlastCustomer
        Customer lastCus = cus.get(id);
        System.out.println("Last Customer : "+lastCus);
        //TestSetNameCus
        lastCus.setName("Somsak");
        //TestUpdateCustomer
        int row = cus.update(lastCus);
        Customer updateCus = cus.get(id);
        System.out.println("Update Customer : "+updateCus);
        //TestDeleteCustomer
//        cus.delete(row);
//        Customer deleteCus = cus.get(row);
//        System.out.println("Delete Customer :"+deleteCus);
    }
}
