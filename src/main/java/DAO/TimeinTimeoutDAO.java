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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
            String sql = "INSERT INTO TimeinTimeout (Name,Status) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getStatus());
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
            String query = "SELECT ID,Name,Time,Status FROM TimeinTimeout";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("ID");
                String name = result.getString("Name");
                String status = result.getString("Status");
                Date time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(result.getString("time"));
                TableTime tabletime = new TableTime(id,name,time,status);
                list.add(time);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        } catch (ParseException ex) {
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
            String query = "SELECT ID,Name,Time,Status FROM TimeinTimeout WHERE ID=" + id;
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                int sid = result.getInt("ID");
                String name = result.getString("Name");
                String stime = result.getString("Time");
                String status = result.getString("Status");
                Date time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(result.getString("time"));
                TableTime tabletime = new TableTime(id,name,time,status);
                return tabletime;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        } catch (ParseException ex) {
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
            String updateQuery = "DELETE FROM TimeinTimeout WHERE ID=?";
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
            String updateQuery = "UPDATE TimeinTimeout SET Name =?,Status=? WHERE ID =?";
            PreparedStatement statement = con.prepareStatement(updateQuery);
            //TableTime time = new TableTime(object.getId(), object.getName(), object.getStatus(), object.getTime());
                        statement.setString(1, object.getName());
            statement.setString(2, object.getStatus());
            statement.setInt(3, object.getId());
            row = statement.executeUpdate();
            System.out.println("Affect row " + row);
        } catch (SQLException ex) {
            System.out.println("ERROR : SQLException");
        }
        db.close();
        return row;
    }

}
