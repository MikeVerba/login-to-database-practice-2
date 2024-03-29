package com.example.logintodatabasepractice2.models.repositories;

import com.example.logintodatabasepractice2.models.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
