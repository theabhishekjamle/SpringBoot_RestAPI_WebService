package com.springbootRestfulwebService.SpringBootRestFullWebService.UserRespository;

import com.springbootRestfulwebService.SpringBootRestFullWebService.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRespository extends JpaRepository<userEntity,Integer> {

}
