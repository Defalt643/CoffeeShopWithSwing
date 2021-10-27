/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Customer;
import Model.Product;
import Model.Receipt;
import Model.ReceiptDetail;
import Model.User;
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
 * @author ming
 */
public class ReceiptDAO implements DAOInterface<Receipt>{

    @Override
    public int add(Receipt object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO Receipt (Cus_id,User_id,total) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, object.getCustomer().getId());
            stmt.setInt(2, object.getSeller().getId());
            stmt.setDouble(3, object.getTotal());
            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            if (result.next()) {
                id = result.getInt(1);
                object.setId(id);
            }
            for(ReceiptDetail r : object.getReceiptDetail()) {
                String sqlDetail = "INSERT INTO ReceiptDetail (Receipt_id,Product_id,Price, Amount) VALUES (?,?,?,?);";
                PreparedStatement stmtDetail = conn.prepareStatement(sqlDetail);
                stmtDetail.setInt(1, r.getReceipt().getId());
                stmtDetail.setInt(2, r.getProduct().getId());
                stmtDetail.setDouble(3, r.getPrice());
                stmtDetail.setInt(4, r.getAmount());
                int rowDetail = stmt.executeUpdate();
                ResultSet resultDetail = stmt.getGeneratedKeys();
                if (resultDetail.next()) {
                    id = resultDetail.getInt(1);
                    r.setId(id);
                }
            }
        }catch(SQLException ex){
            System.out.println("Error: to create receipt !!! " + ex.getMessage());
        }db.close();
        return id;
    }

    @Override
    public ArrayList<Receipt> getAll() {
        ArrayList list = new ArrayList();
        java.sql.Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            db.getConnection();
            conn.setAutoCommit(false);

            String sql = "SELECT r.Id as id,\n"
                    + "       r.Created as created,\n"
                    + "       customer_id,\n"
                    + "       c.Name as customer_name,\n"
                    + "       c.Tel as customer_tel,\n"
                    + "       c.Purchase_amount as purcahseAount   ,\n"
                    + "       user_id,\n"
                    + "       u.Name as user_name,\n"
                    + "       u.tel as user_tel,\n"
                    + "       u.Role as Role,\n"
                    + "       u.Username as username,\n"
                    + "       total\n"
                    + "  FROM Receipt r,Customer c, User u\n"
                    + "  WHERE r.customer_id = c.id AND r.user_id = u.id;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("id");
                Date created = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(result.getString("created"));
                int customerId = result.getInt("customer_id");
                String customerName = result.getString("customer_name");
                String customerTel = result.getString("customer_tel");
                int purchaseAmount = result.getInt("purcahseAount");
                int userId = result.getInt("Id");
                String role = result.getString("Role");
                String userName = result.getString("user_name");
                String userTel = result.getString("user_tel");
                String username= result.getString("username");
                double total = result.getDouble("total");
                Customer cus = new Customer(customerId, customerName, customerTel,purchaseAmount);
                Receipt receipt = new Receipt(id, created, new User(userId, userName, userTel,role,username),new Customer(customerId, customerName, customerTel,purchaseAmount));
                receipt.setTotal(total);
                list.add(receipt);
            }

            result.close();
            stmt.close();
            db.close();
        } catch (SQLException ex) {
            System.out.println("Error: Unable to select All receipt " + ex.getMessage());
        } catch (ParseException ex) {
            System.out.println("Error: Date passing All receipt " + ex.getMessage());
        }
        return list;
    }

    @Override
    public Receipt get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql ="SELECT r.Id as id,\n"
                    + "       r.Created as created,\n"
                    + "       customer_id,\n"
                    + "       c.Name as customer_name,\n"
                    + "       c.Tel as customer_tel,\n"
                    + "       c.Purchase_amount as purcahseAount   ,\n"
                    + "       user_id,\n"
                    + "       u.Name as user_name,\n"
                    + "       u.tel as user_tel,\n"
                    + "       u.Role as Role,\n"
                    + "       u.Username as username,\n"
                    + "       total\n"
                    + "  FROM Receipt r,Customer c, User u\n"
                    + "  WHERE r.customer_id = c.id AND r.user_id = u.id;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                int rid = result.getInt("id");
                Date created = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(result.getString("created"));
                int customerId = result.getInt("customer_id");
                String customerName = result.getString("customer_name");
                String customerTel = result.getString("customer_tel");
                int purchaseAmount = result.getInt("purcahseAount");
                int userId = result.getInt("Id");
                String role = result.getString("Role");
                String userName = result.getString("user_name");
                String userTel = result.getString("user_tel");
                String username= result.getString("username");
                double total = result.getDouble("total");
                Receipt receipt = new Receipt(id, created, new User(userId, userName, userTel,role,username),new Customer(customerId, customerName, customerTel,purchaseAmount));                 
                 String sqlDetail = "SELECT rd.id as id,\n"
                        + "       receipt_id,\n"
                        + "       product_id,\n"
                        + "       p.name as product_name,\n"
                        + "       p.price as product_price, \n"
                        + "       rd.price as price,\n"
                        + "       amount\n"
                        + "  FROM receipt_detail rd, product p\n"
                        + "  WHERE receipt_id = ? AND rd.product_id = p.id;"
                        + "  ORDER BY created DESC;";
                PreparedStatement stmtDetail = conn.prepareStatement(sqlDetail);
                stmtDetail.setInt(1, id);
                ResultSet resultDetail = stmtDetail.executeQuery();
                while(resultDetail.next()) {
                    int receiveId = resultDetail.getInt("id");
                    int productId = resultDetail.getInt("product_id");
                    String productName = resultDetail.getString("product_name");
                    double productPrice = resultDetail.getDouble("product_price");
                    double price = resultDetail.getDouble("price");
                    int amount = resultDetail.getInt("amount");
                    Product product = new Product(productId, productName, productPrice);
                    receipt.addReceiptDetail(receiveId,product, amount, price);
                }
                receipt.setTotal(total);
                return receipt;
            }
            
            result.close();
            stmt.close();
            db.close();
            
        } catch (SQLException ex) {
            System.out.println("Error: Unable to select receipt id " + id + " !!! " + ex.getMessage());
        } catch (ParseException ex) {
            System.out.println("Error: Date passing receipt id" + id + " !!! "+ ex.getMessage());
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
            String sql = "DELETE FROM Receipt WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row = stmt.executeUpdate();
            System.out.println("Affect row " + row);
        } catch (SQLException ex) {
            System.out.println("Error: Unable delete receipt id " + id + " !!!");
        }

        db.close();
        return row;
    }

    @Override
    public int update(Receipt object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row =0;
        try{
            String sql = "UPDATE Receipt Cus_id = ?,User_id = ?,Total = ? WHERE Id=?";
            PreparedStatement stmt= conn.prepareStatement(sql);
            stmt.setInt(1, object.getCustomer().getId());
            stmt.setInt(2, object.getSeller().getId());
            stmt.setDouble(3, object.getTotal());
            stmt.setInt(4,object.getId());
            return 0;
        }catch(SQLException ex){
            System.out.println("ERROR : SQLException");
        }db.close();
        return -1;
    }
    
}
