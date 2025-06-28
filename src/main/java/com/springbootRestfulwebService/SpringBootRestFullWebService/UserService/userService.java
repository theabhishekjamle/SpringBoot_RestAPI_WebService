package com.springbootRestfulwebService.SpringBootRestFullWebService.UserService;

import com.springbootRestfulwebService.SpringBootRestFullWebService.Entity.userEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface userService {
    public userEntity addUserDetial(userEntity user);
    public List<userEntity> allStudents();
    public Optional<userEntity> getStudentById(Integer id);
    public userEntity updateStudent(int id,userEntity userEN);
    public void  deleteUserById(int id);
}
