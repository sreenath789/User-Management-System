package com.example.UserManagementSystem.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManagement {

    @NotNull(message = "UserId Must not be null")
    private Integer userId;
    @NotEmpty(message = "Username Must not be empty")
    private String userName;
    @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Enter a Valid Phone Number")
    private String phoneNumber;
    @Email
    private String eMail;
    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of Birth must be in the format dd-mm-yyyy")
    private String dateOfBirth;

}
