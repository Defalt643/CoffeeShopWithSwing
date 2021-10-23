/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Xenon
 */
public class User {
    private int id;
    private String name;
    private String role;
    private String Username;
    private String Password;

    public User(int id, String name, String role, String Username, String Password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.Username = Username;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", role=" + role + ", Username=" + Username + ", Password=" + Password + '}';
    }
}
