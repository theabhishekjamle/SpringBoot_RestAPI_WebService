package com.springbootRestfulwebService.SpringBootRestFullWebService.Controller;

import com.springbootRestfulwebService.SpringBootRestFullWebService.Entity.userEntity;
import com.springbootRestfulwebService.SpringBootRestFullWebService.UserService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;

@RestController
public class userController {

    @Autowired
    private userService userservice;
    @PostMapping("/addUser")
    public userEntity addUserDetials(@RequestBody userEntity user){
        return  userservice.addUserDetial(user);
    }

    @GetMapping("/allStudents")
    public List<userEntity> allStudents(){
        return userservice.allStudents();
    }

    @GetMapping("/getStudentBy/{id}")
    public ResponseEntity<userEntity> getStudentById(@PathVariable int id){
        userEntity userEN = userservice.getStudentById(id).orElse(null);
        if (userEN != null ) return ResponseEntity.ok().body(userEN);
        else return  ResponseEntity.notFound().build();
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<userEntity> updatedStudent(@PathVariable int id,@RequestBody userEntity user){
        userEntity updatedUser = userservice.updateStudent(id,user);
        if( updatedUser != null) return ResponseEntity.ok(updatedUser);
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping("deleteStudentBy/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        userservice.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
