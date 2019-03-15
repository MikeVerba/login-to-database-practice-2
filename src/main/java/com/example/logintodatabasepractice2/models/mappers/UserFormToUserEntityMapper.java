package com.example.logintodatabasepractice2.models.mappers;

import com.example.logintodatabasepractice2.models.entities.UserEntity;
import com.example.logintodatabasepractice2.models.forms.UserForm;
import org.springframework.stereotype.Service;

@Service
public class UserFormToUserEntityMapper implements Mapper<UserForm,UserEntity> {
    @Override
    public UserEntity map(UserForm userForm) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userForm.getUsername());
        userEntity.setEmail(userForm.getEmail());
        userEntity.setPassword(userForm.getPassword());
        return userEntity;
    }
}
