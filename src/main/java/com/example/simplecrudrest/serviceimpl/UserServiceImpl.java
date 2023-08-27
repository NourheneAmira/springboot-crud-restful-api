package com.example.simplecrudrest.serviceimpl;

import com.example.simplecrudrest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.simplecrudrest.repository.UserRepository;
import com.example.simplecrudrest.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
       /* Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){return user.get();}
        else {
        throw new ResourceNotFoundException();}*/
        // le meme mais use the lambda expression
        return null;

    }
}
