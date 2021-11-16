/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



 

/**
 *
 * @author Acer
 */
public class TableTime {

    private int id ;
    private String name,time,status;

    public TableTime(String name, String time, String status) {
        this.id =-1;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public TableTime(String name,String status) {
        this.id =-1;
        this.name = name;
        this.time = time;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public TableTime(int id, String name, String time, String status) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TableTime{" + "id=" + id + ", name=" + name + ", time=" + time + ", status=" + status + '}';
    }
    
    
    
}
