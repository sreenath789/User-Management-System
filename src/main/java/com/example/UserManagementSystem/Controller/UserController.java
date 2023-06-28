package com.example.UserManagementSystem.Controller;

import com.example.UserManagementSystem.Model.UserManagement;
import com.example.UserManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getAllUsers")
    public Map<Integer, UserManagement> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("addUser")
    public String addUser(@RequestBody @Valid UserManagement userManagement){
        return userService.addUser(userManagement);
    }

    @GetMapping("getUser/{userId}")
    public UserManagement getUserById(@PathVariable int userId){
        return userService.getUserById(userId);
    }

    @PutMapping("updateUserInfo/{id}/{name}")
    public String updateUser(@PathVariable int id , @PathVariable String name){
        return userService.updateUser(id,name);
    }

    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId){
        return userService.deleteUser(userId);
    }





}
