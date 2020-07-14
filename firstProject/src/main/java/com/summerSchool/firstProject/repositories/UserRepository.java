package com.summerSchool.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.summerSchool.firstProject.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
