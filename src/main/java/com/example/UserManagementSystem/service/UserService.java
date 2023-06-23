package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.Model.UserManagement;
import com.example.UserManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public Map<Integer, UserManagement> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public String addUser(UserManagement userManagement){
        Map<Integer,UserManagement> users = getAllUsers();
        users.put(userManagement.getUserId(), userManagement);
        return "User Added Successfully!";
    }

    public String updateUser(int id,String name){
        Map<Integer,UserManagement> users = getAllUsers();
        if(users.containsKey(id)){
            users.get(id).setUserName(name);
            return "User Updated";
        }
        else{
            return "User Not Found!";
        }
    }

    public String deleteUser(int id){
        Map<Integer,UserManagement> users = getAllUsers();
        if(users.containsKey(id)){
            users.remove(id);
            return "User Deleted "+"with by Id "+id;
        }
        else{
            return "User Not Found!";
        }
    }

    public UserManagement getUserById(int id){
        Map<Integer,UserManagement> users = getAllUsers();
        return users.getOrDefault(id, null);
    }
}
