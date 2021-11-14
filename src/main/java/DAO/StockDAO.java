/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
import Model.Stock;
import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author A_R_T
 */
public class StockDAO implements DAOInterface<Stock>{

    @Override
    public int add(Stock object) {
        Connection con =null;
        Database db = Database.getInstance();
        con=db.getConnection();
        int id = -1;
        try{
            String sql = "INSERT INTO Stock (Name,Price,Unit) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,object.getName());
            stmt.setDouble(2, object.getPrice());
            stmt.setInt(3, object.getUnit());
            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            if(result.next()){
                id = result.getInt(1);
                
            }
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
            }db.close();
        return id;            
        }

    @Override
    public ArrayList<Stock> getAll() {
        ArrayList list = new ArrayList();
        Connection con = null;
        Database db = Database.getInstance();
        con=db.getConnection();
        try{
            String query = "SELECT ID,Name,Price,Unit FROM Stock";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int id = result.getInt("ID");
                String name = result.getString("Name");
                double price = result.getDouble("Price");
                int unit = result.getInt("Unit");
                Stock stock = new Stock(id,unit,name,price);
                list.add(stock);
            }
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return list;
    }

    @Override
    public Stock get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Stock object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

 
