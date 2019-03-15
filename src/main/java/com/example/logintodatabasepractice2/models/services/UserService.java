package com.example.logintodatabasepractice2.models.services;

import com.example.logintodatabasepractice2.models.entities.UserEntity;
import com.example.logintodatabasepractice2.models.forms.UserForm;
import com.example.logintodatabasepractice2.models.mappers.UserFormToUserEntityMapper;
import com.example.logintodatabasepractice2.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserFormToUserEntityMapper userFormToUserEntityMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserFormToUserEntityMapper userFormToUserEntityMapper) {
        this.userRepository = userRepository;
        this.userFormToUserEntityMapper = userFormToUserEntityMapper;
    }


    public boolean saveUser(UserForm userForm){
        UserEntity userEntity = userFormToUserEntityMapper.map(userForm);
        userRepository.save(userEntity);
        return true;
    }


}
