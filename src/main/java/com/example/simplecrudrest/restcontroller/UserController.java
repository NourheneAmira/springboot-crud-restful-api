package com.example.simplecrudrest.restcontroller;

import com.example.simplecrudrest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.simplecrudrest.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    @ResponseBody
   public User addUser (User user){
       return userService.addUser(user);
   }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

}
