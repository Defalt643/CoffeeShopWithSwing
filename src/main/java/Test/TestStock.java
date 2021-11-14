/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.StockDAO;
import Model.Stock;

/**
 *
 * @author A_R_T
 */
public class TestStock {
    public static void main(String[] args) {
        StockDAO stock = new StockDAO();
        
        int id = stock.add(new Stock (-1,1, "Sugar", 50.25));
        System.out.println("id " + id);
        
        Stock laststock = stock.get(id);
        System.out.println("laststock " + laststock);
        
        laststock.setName("coffee");
        System.out.println("laststock  edit " + laststock);
        
        int row = stock.update(laststock);
        Stock updateStock = stock.get(id);
        System.out.println("update Stock " + updateStock);
        
        stock.delete(row);
        
    }
}
