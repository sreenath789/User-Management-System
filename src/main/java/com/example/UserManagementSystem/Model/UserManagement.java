package com.example.UserManagementSystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManagement {

    private int userId;
    private String userName;
    private long phoneNumber;
    private String address;


}
