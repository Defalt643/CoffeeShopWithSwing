/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ming
 */
public class ProductDAO implements DAOInterface<Product>{

    @Override
    public int add(Product object) {
        Connection con =null;
        Database db = Database.getInstance();
        con=db.getConnection();
        int id=-1;
        try{
            String insertQuery = "INSERT INTO Product(Name,Price) VALUES(?,?)";
            PreparedStatement smt = con.prepareStatement(insertQuery);
            smt.setString(1, object.getName());
            smt.setDouble(2, object.getPrice());
            int row = smt.executeUpdate();
            ResultSet result = smt.getGeneratedKeys();
            if(result.next()){
                id = result.getInt(1);
            }
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }db.close();
        return id;
    }

    @Override
    public ArrayList<Product> getAll() {
        ArrayList list = new ArrayList();
        Connection con = null;
        Database db = Database.getInstance();
        con=db.getConnection();
        try{
            String query = "SELECT Id,Name,Price FROM Product";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int id = result.getInt("Id");
                String name = result.getString("Name");
                double price = result.getDouble("Price");
                Product product = new Product(id,name,price);
                list.add(product);  
            }
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return list;
    }

    @Override
    public Product get(int id) {
        Connection con = null;
        Database db = Database.getInstance();
        con=db.getConnection();
        try{
            String query = "SELECT Id,Name,Price FROM Product WHERE Id="+id;
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int pid = result.getInt("Id");
                String name = result.getString("Name");
                double price = result.getDouble("Price");
                Product product = new Product(pid,name,price);
                return product;
            }
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return null;
    }

    @Override
    public int delete(int id) {
        Connection con = null;
        Database db = Database.getInstance();
        con=db.getConnection();
        int row=0;
        try{
            String updateQuery = "DELETE FROM Product WHERE Id=?";
            Product product = new Product(id,"Oh Lieng",30);
            PreparedStatement statement = con.prepareStatement(updateQuery);
            statement.setInt(1, product.getId());
            row = statement.executeUpdate();
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }

    @Override
    public int update(Product object) {
        Connection con = null;
        Database db = Database.getInstance();
        con=db.getConnection();
        int row = 0;
        try{
            String updateQuery = "UPDATE Product SET Name =?,Price =? WHERE Id =?";
            PreparedStatement statement = con.prepareStatement(updateQuery);
            Product product = new Product(object.getId(),object.getName(),object.getPrice());
            statement.setString(1, product.getName());
            statement.setDouble(2,product.getPrice());
            statement.setInt(3, product.getId());
            row = statement.executeUpdate();
            System.out.println("Affect row " + row);
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }
    
}
