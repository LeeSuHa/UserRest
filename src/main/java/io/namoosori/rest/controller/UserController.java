package io.namoosori.rest.controller;

import io.namoosori.rest.entity.User;
import io.namoosori.rest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping("/users")
    public String register(@RequestBody User newUer){
        return userService.regist(newUer);
    }

    @GetMapping("/users/{id}")
    public User find(@PathVariable String id){
        return userService.find(id);
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("/users")
    public void modify(@RequestBody User newUser){
        userService.modify(newUser);
    }

    @DeleteMapping("/users/{id}")
    public void remove( @PathVariable String id){
        userService.remove(id);
    }
}
