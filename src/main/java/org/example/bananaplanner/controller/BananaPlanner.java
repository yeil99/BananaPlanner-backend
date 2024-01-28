package org.example.bananaplanner.controller;

import org.example.bananaplanner.model.Users;
import org.example.bananaplanner.service.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BananaPlanner {
    private final UsersRepository usersRepository;
    public BananaPlanner(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users")
    public void addUsers(){
        Users user = new Users("kim123","0000","kim");
        usersRepository.save(user);
    }

}
