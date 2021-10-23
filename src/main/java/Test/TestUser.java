/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.UserDAO;
import Model.User;

/**
 *
 * @author Bunny0_
 */
public class TestUser {
    public static void main(String[] args){
        UserDAO user = new UserDAO();
        //TestInsertUser
        int id = user.add(new User(-1,"winwin","Employee"
                ,"user1","password1","08888888888"));
        System.out.println("id : "+id);
        //TestLastUser
        User lastUser = user.get(id);
        System.out.println("Last User : "+lastUser);
        //TestSetName
        lastUser.setName("winwinwin");
        //TestUpdateUser
        int row = user.update(lastUser);
        User updateUser = user.get(id);
        System.out.println("Update User :" + updateUser);
        user.delete(row);
        //TestDeleteUser
        User deleteUser = user.get(row);
        System.out.println("Delete User : "+ deleteUser);
    }            
}
