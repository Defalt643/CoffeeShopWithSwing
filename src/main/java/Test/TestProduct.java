/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.ProductDAO;
import Model.Product;

/**
 *
 * @author Bunny0_
 */
public class TestProduct {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        //TestInsert
        int id = dao.add(new Product(-1, "Hot Latte", 35.0));
        System.out.println("id : " + id);
        //TestInsertLastProdcut
        Product lastProduct = dao.get(id);
        System.out.println("last Product : "+ lastProduct);
        //TestEditPrice
        lastProduct.setPrice(60);
        System.out.println("last Product Edit Price : "+lastProduct);
        //TeestUpdateRowInProduct
        int row = dao.update(lastProduct);
        Product updateProduct = dao.get(id);
        System.out.println("update product : "+updateProduct);
//        //TestDeleteProduct
//        dao.delete(id);
//        Product deleteProduct = dao.get(id);
//        System.out.println("delete product : "+ deleteProduct);
    }
}