package de.ait.mvcdemo.service.impl;

import de.ait.mvcdemo.dto.RegisterDto;
import de.ait.mvcdemo.model.User;
import de.ait.mvcdemo.repository.UserRepository;
import de.ait.mvcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;//depended from data base

    public UserServiceImpl(@Qualifier("userRepositoryFileImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //add users methode
    @Override
    //public User addUser(String firstName, String lastName, String email, String password) {
    public User addUser(RegisterDto registerDto) {

        //User user = new User(firstName,lastName,email,password);//created user
        User user = new User(registerDto.getInputFirstName(),
                registerDto.getInputLastName(),
                registerDto.getInputEmail(),
                registerDto.getInputPassword());//created user
        userRepository.save(user);//save user in database

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
