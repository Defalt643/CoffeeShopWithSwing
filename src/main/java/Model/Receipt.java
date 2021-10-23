/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Xenon
 */
public class Receipt {
    private int id;
    private int emp_id;
    private Date date;
    private int cus_id;
    private int total;
    private int cash;
    private int change;

    public Receipt(int id, int emp_id, Date date, int cus_id, int total, int cash, int change) {
        this.id = id;
        this.emp_id = emp_id;
        this.date = date;
        this.cus_id = cus_id;
        this.total = total;
        this.cash = cash;
        this.change = change;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public Date getDate() {
        return date;
    }

    public int getCus_id() {
        return cus_id;
    }

    public int getTotal() {
        return total;
    }

    public int getCash() {
        return cash;
    }

    public int getChange() {
        return change;
    }
    
        @Override
    public String toString() {
        return "Receipt{" + "id=" + id + ", emp_id=" + emp_id + ", date=" + date + ", cus_id=" + cus_id + ", total=" + total + ", cash=" + cash + ", change=" + change + '}';
    }
}
