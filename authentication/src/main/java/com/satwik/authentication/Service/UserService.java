package com.satwik.authentication.Service;

import com.satwik.authentication.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<UserEntity> getAllUsers() {
        return Arrays.asList(
                new UserEntity("Satwik", "1234"),
                new UserEntity("XYZ","1234"),
                new UserEntity("ABC", "1234")
        );
    }
}