package com.satwik.annot;


@Component
@Service

public class UserService {
    private UserRepository userRepository;

    public void display(){
        System.out.println(userRepository.getUserName());
    }
}
