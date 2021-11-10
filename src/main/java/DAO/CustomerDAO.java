/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Customer;
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
public class CustomerDAO implements DAOInterface<Customer>{

    @Override
    public int add(Customer object) {
        Connection c = null;
        Database db = Database.getInstance();
        c = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO customer (name, tel) VALUES (?,?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, object.getName());
            statement.setString(2, object.getTel());
            int row = statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return id;
    }

    @Override
    public ArrayList<Customer> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,Name,Tel,Purchase_amount FROM Customer";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Id");
                String name = result.getString("Name");
                String tel = result.getString("Tel");
                int purchase_amount= result.getInt("Purchase_amount");
                list.add(new Customer(id,name,tel,purchase_amount));
                System.out.println(id + " " + name + " " + tel+" "+purchase_amount);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return list;
    }

    @Override
    public Customer get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,Name,Tel,Purchase_amount FROM customer WHERE id=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int pid = result.getInt("Id");
                String name = result.getString("Name");
                String tel = result.getString("Tel");
                int purchase_amount= result.getInt("Purchase_amount");
                Customer cus = new Customer(id,name,tel,purchase_amount);
                return cus;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        return null;
    }

    @Override
    public int delete(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "DELETE FROM customer WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
           System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }

    @Override
    public int update(Customer object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE customer SET name = ?, tel = ? ,Purchase_amount = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getTel());
            stmt.setInt(3, object.getPurchase_amount());
            stmt.setInt(4, object.getId());
            
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }
    
}
