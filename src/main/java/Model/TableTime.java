/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class TableTime {

    private int id;
    private String name, status;
    private Date time;
    
    
    public TableTime(int id, String name, Date time, String status) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public TableTime(String name, Date time, String status) {
        this.id = -1;
        this.name = name;
        this.time = time;
        this.status = status;
        
    }

    public TableTime(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public TableTime(String name, String status) {
        this.name = name;
        this.status = status;
    }

    
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    @Override
    public String toString() {
        return "TableTime{" + "id=" + id + ", username=" + name + ", time=" + time + ", status=" + status + '}';
    }

}
