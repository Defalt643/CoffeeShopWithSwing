/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
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
public class UserDAO implements DAOInterface<User>{

    @Override
    public int add(User object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO user (Name,Tel,Password,Role,Username) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getTel());
            stmt.setString(3, object.getPassword());
            stmt.setString(4, object.getRole());
            stmt.setString(5, object.getUsername());
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
    public ArrayList<User> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,Name,Tel,Password,Role,Username FROM user";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String tel = result.getString("tel");
                String password = result.getString("password");
                String role = result.getString("Role");
                String username = result.getString("Username");
                User user = new User(id, name, tel,role, password,username);
                System.out.println(id + " " + name + " " + tel +" "+role+ " " +" "+username+" "+password);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return list;
    }

    @Override
    public User get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,Name,Tel,Password,Role,Username FROM User WHERE Id=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int pid = result.getInt("Id");
                String name = result.getString("Name");
                String tel = result.getString("Tel");
                String password = result.getString("Password");
                String role = result.getString("Role");
                String username = result.getString("Username");
                User user = new User(id, name, tel,role, password,username);
                return user;
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
            String sql = "DELETE FROM User WHERE Id = ?";
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
    public int update(User object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE User SET Id = ?,Name = ?,Tel = ?,Password = ?,Role = ?,Username = ? WHERE Id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getTel());
            stmt.setString(3, object.getPassword());
            stmt.setString(4, object.getRole());
            stmt.setString(5,object.getUsername());
            stmt.setInt(6, object.getId());
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }
    
}
