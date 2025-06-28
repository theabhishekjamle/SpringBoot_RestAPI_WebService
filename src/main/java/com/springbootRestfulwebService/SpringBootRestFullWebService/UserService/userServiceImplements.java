package com.springbootRestfulwebService.SpringBootRestFullWebService.UserService;

import com.springbootRestfulwebService.SpringBootRestFullWebService.Entity.userEntity;
import com.springbootRestfulwebService.SpringBootRestFullWebService.UserRespository.userRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImplements implements userService{

    @Autowired
    private userRespository userRespo;

    @Override
    public userEntity addUserDetial(userEntity user) {
       return userRespo.save(user);
    }

    @Override
    public List<userEntity> allStudents() {
        return userRespo.findAll();
    }

    @Override
    public Optional<userEntity> getStudentById(Integer id) {
        return userRespo.findById(id);
    }

    @Override
    public userEntity updateStudent(int id, userEntity userEN) {
        userEntity userData = userRespo.findById(id).orElse(null);
        if( userData !=  null) return userRespo.save(userEN);
       else  throw new RuntimeException(" Student Not Found ! With Id :- "+id);
    }

    @Override
    public void deleteUserById(int id) {
       userRespo.deleteById(id);

    }


}
