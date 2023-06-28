# User-Management-System 
## Frameworks and languages used
###### SpringBoot

## Data Flow

### Controller
###### Map<Integer, UserManagement> getAllUsers() --> get all users ,String addUser ---> add the user , UserManagement getUserById(id) -->get user by id , String updateUser(id,name) --> update by the user by id with name variable , String deleteUser(id) --> delete the user by id

### Service
###### it is autowired in Controller so that it can perform required business logic

### Repository
###### It Consists data which is posted from postman Application. It is autowired in Service application

### Model
###### @NotNull(message = "UserId Must not be null") private Integer userId;
###### @NotEmpty(message = "Username Must not be empty") private String userName;
###### @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Enter a Valid Phone Number") private String phoneNumber;
###### @Email private String eMail;
###### @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of Birth must be in the format dd-mm-yyyy") private String dateOfBirth;
### Factory
###### BeanFactory class it will initialize object by spring

## Summary
###### Performing Validation on User-management-system (validation on username , dateofBirth (date of birth should be validated with hyphen(-)),email,PhoneNumber(length of phone number should be 12 digit ,first two digit is country code and rest phone number)) by using Validation Annotations @NotNull,@NotEmpty,@Pattern,@Email,@Valid

    
    
    
