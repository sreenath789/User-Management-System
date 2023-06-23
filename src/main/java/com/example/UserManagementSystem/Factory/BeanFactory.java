package com.example.UserManagementSystem.Factory;

import com.example.UserManagementSystem.Controller.UserController;
import com.example.UserManagementSystem.Model.UserManagement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    public Map<Integer, UserManagement> getUserMap(){
        return new HashMap<>();
    }
}
