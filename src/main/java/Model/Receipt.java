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
    private Date date;
    private int userId;
    private int cusId;
    private int total;

    public Receipt(int id, Date date, int userId, int cusId, int total) {
        this.id = id;
        this.date = date;
        this.userId = userId;
        this.cusId = cusId;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Receipt{" + "id=" + id + ", date=" + date + ", userId=" + userId + ", cusId=" + cusId + ", total=" + total + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }

    public int getCusId() {
        return cusId;
    }

    public int getTotal() {
        return total;
    }


}
