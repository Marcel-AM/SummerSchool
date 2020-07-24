package com.summerSchool.firstProject.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.summerSchool.firstProject.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

	Optional<UserEntity> findByUsername(String username);

	void deleteById(String username);

}
