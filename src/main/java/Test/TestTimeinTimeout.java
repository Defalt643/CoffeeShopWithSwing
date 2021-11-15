/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.TimeinTimeoutDAO;
import Model.TableTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class TestTimeinTimeout {
     public static void main(String[] args){
         TimeinTimeoutDAO time = new TimeinTimeoutDAO();
         time.add(new TableTime("winwin","in"));
         //s
         /*TableTime lastTableTime =time.get(id);
         System.out.print("Last : "+lastTableTime);
         //lastTableTime);
         TableTime updateTableTime =time.get(id);
         System.out.print("Update Tim
         lastTableTime.setName("winwin");
         //
         int row = time.update(einTimeout: "+updateTableTime);
         time.delete(row);
         //
         TableTime deleteTableTime =time.get(row);
         System.out.println("Delete TimeinTimeout : "+ deleteTableTime);
         */

     }
}
