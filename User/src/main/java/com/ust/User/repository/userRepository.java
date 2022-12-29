package com.ust.User.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.User.model.UserModel;


@Repository
public interface userRepository extends JpaRepository<UserModel, Integer>{

 

}