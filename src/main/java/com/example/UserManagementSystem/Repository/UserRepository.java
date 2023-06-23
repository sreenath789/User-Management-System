package com.example.UserManagementSystem.Repository;

import com.example.UserManagementSystem.Model.UserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    @Autowired
    Map<Integer, UserManagement> users;

    public Map<Integer,UserManagement> getAllUsers(){
        return users;
    }


}
