/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import database.Database;
import java.sql.Connection;

/**
 *
 * @author ming
 */
public class TestConnection {
    public static void main(String[] args) {
        Connection c = null;
        Database db = Database.getInstance();
        db.close();
    }
}
