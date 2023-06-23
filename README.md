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
###### private int userId;private String userName;private long phoneNumber;private String address;

### Factory
###### BeanFactory class it will initialize object by spring

## Summary
###### Performing crud operations(Add,Update,Delete,Read) on User-management-system.

    
    
    
