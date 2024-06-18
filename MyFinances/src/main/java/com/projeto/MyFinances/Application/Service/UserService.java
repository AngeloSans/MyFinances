package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.User;
import com.projeto.MyFinances.Infrastructure.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }


}
