/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.TableTime;
import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class TimeinTimeoutDAO implements DAOInterface<TableTime> {
    
    @Override
    public int add(TableTime object) {
        Connection con = null;
        Database db = Database.getInstance();
        con = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO TableTime (Name,Status,Time) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getStatus());
            stmt.setString(3, object.getTime());
            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
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
    public ArrayList<TableTime> getAll() {
        ArrayList list = new ArrayList();
        Connection con = null;
        Database db = Database.getInstance();
        con = db.getConnection();
        try {
            String query = "SELECT ID,Name,Time,Status FROM TableTime";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("ID");
                String name = result.getString("Name");
                String time = result.getString("Time");
                String status = result.getString("Status");
                TableTime tabletime = new TableTime(id,name,time,status);
                list.add(time);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return list;
    }
    @Override
    public TableTime get(int id) {
        Connection con = null;
        Database db = Database.getInstance();
        con = db.getConnection();
        try {
            String query = "SELECT ID,Name,Time,Status FROM TableTime WHERE ID=" + id;
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                int sid = result.getInt("ID");
                String name = result.getString("Name");
                String time = result.getString("Time");
                String status = result.getString("Status");
                TableTime tabletime = new TableTime(id,name,time,status);
                return tabletime;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return null;

    }
    @Override
    public int delete(int id) {
        Connection con = null;
        Database db = Database.getInstance();
        con = db.getConnection();
        int row = 0;
        try {
            String updateQuery = "DELETE FROM TableTime WHERE ID=?";
            PreparedStatement statement = con.prepareStatement(updateQuery);
            statement.setInt(1, id);
            row = statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }
    @Override
    public int update(TableTime object) {
        Connection con = null;
        Database db = Database.getInstance();
        con = db.getConnection();
        int row = 0;
        try {
            String updateQuery = "UPDATE TableTime SET Name =?,Time =?,Status=? WHERE ID =?";
            PreparedStatement statement = con.prepareStatement(updateQuery);
            TableTime time = new TableTime(object.getId(), object.getName(), object.getStatus(), object.getTime());
            statement.setString(1, object.getName());
            statement.setString(2, object.getTime());
            statement.setString(3, object.getStatus());
            statement.setInt(4, object.getId());
            row = statement.executeUpdate();
            System.out.println("Affect row " + row);
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }

}
